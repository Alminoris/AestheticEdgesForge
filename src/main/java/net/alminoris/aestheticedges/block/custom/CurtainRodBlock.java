package net.alminoris.aestheticedges.block.custom;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.item.ModItems;
import net.alminoris.aestheticedges.util.ModTags;
import net.alminoris.aestheticedges.util.helper.BlockShape;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.ForgeRegistries;

public class CurtainRodBlock extends YAxisRotatedBlock
{
    public enum Color implements StringRepresentable
    {
        BLACK("black"),
        BROWN("brown"),
        GRAY("gray"),
        LIGHT_GRAY("light_gray"),
        WHITE("white"),
        RED("red"),
        ORANGE("orange"),
        YELLOW("yellow"),
        PURPLE("purple"),
        MAGENTA("magenta"),
        PINK("pink"),
        BLUE("blue"),
        CYAN("cyan"),
        LIGHT_BLUE("light_blue"),
        GREEN("green"),
        LIME("lime");

        private final String name;

        Color(String name) { this.name = name; }

        public static Color fromString(String name)
        {
            for (Color inside : Color.values())
            {
                if (inside.name.equalsIgnoreCase(name))
                    return inside;
            }
            throw new IllegalArgumentException("No enum constant for name: " + name);
        }

        public String getSerializedName() {
            return this.name;
        }
    }

    public enum Variant implements StringRepresentable
    {
        NORMAL("normal"),
        LEFT("left"),
        RIGHT("right"),
        CENTER("center");

        private final String name;

        Variant(String name) { this.name = name; }

        public static Variant fromString(String name)
        {
            for (Variant inside : Variant.values())
            {
                if (inside.name.equalsIgnoreCase(name))
                    return inside;
            }
            throw new IllegalArgumentException("No enum constant for name: " + name);
        }

        @Override
        public String getSerializedName() { return this.name; }
    }

    public static final EnumProperty<Color> COLOR = EnumProperty.create("color", Color.class);

    public static final EnumProperty<Variant> VARIANT = EnumProperty.create("variant", Variant.class);

    public static final BooleanProperty DRESSED = BooleanProperty.create("dressed");

    public static final BooleanProperty OPENED = BooleanProperty.create("opened");

    public CurtainRodBlock(BlockBehaviour.Properties settings, BlockShape... shapes)
    {
        super(settings, shapes);
        this.registerDefaultState(this.stateDefinition.any().setValue(VARIANT, Variant.NORMAL).setValue(DRESSED, false)
                .setValue(COLOR, Color.BLACK).setValue(OPENED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(VARIANT, DRESSED, COLOR, OPENED);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit)
    {
        ItemStack stack = player.getItemInHand(InteractionHand.MAIN_HAND);

        boolean currentDressed = state.getValue(DRESSED);
        boolean currentOpened = state.getValue(OPENED);
        Variant currentVariant = state.getValue(VARIANT);

        if (stack.is(ModTags.Items.CURTAINS) && !currentDressed)
        {
            if (!world.isClientSide)
            {
                Direction currentFacing = state.getValue(FACING);
                String colorName = ForgeRegistries.ITEMS.getKey(stack.getItem()).getPath().replace("curtain_", "");
                world.setBlock(pos, state
                        .setValue(FACING, currentFacing)
                        .setValue(VARIANT, currentVariant)
                        .setValue(DRESSED, true)
                        .setValue(OPENED, currentOpened)
                        .setValue(COLOR, Color.fromString(colorName)), 3);

                stack.shrink(1);
            }

            return InteractionResult.SUCCESS;
        }

        if (stack.isEmpty() && currentDressed)
        {
            if (!world.isClientSide)
            {
                Direction currentFacing = state.getValue(FACING);
                Color currentColor = state.getValue(COLOR);
                world.setBlock(pos, state
                        .setValue(FACING, currentFacing)
                        .setValue(VARIANT, currentVariant)
                        .setValue(DRESSED, currentDressed)
                        .setValue(OPENED, !currentOpened)
                        .setValue(COLOR, currentColor), 3);

                if (stack.getDamageValue() < stack.getMaxDamage() - 1)
                    stack.setDamageValue(stack.getDamageValue() + 1);
                else
                    stack.shrink(1);
            }

            return InteractionResult.SUCCESS;
        }

        if (stack.is(ModItems.CURTAIN_REMOVER.get()))
        {
            if (!world.isClientSide)
            {
                Direction currentFacing = state.getValue(FACING);
                Color currentColor = state.getValue(COLOR);
                String colorName = currentColor.getSerializedName();
                world.setBlock(pos, state
                        .setValue(FACING, currentFacing)
                        .setValue(VARIANT, currentVariant)
                        .setValue(DRESSED, false)
                        .setValue(OPENED, currentOpened)
                        .setValue(COLOR, currentColor), 3);

                if (stack.getDamageValue() < stack.getMaxDamage() - 1)
                    stack.setDamageValue(stack.getDamageValue() + 1);
                else
                    stack.shrink(1);

                Item item =ForgeRegistries.ITEMS.getValue(ResourceLocation.fromNamespaceAndPath(AestheticEdges.MOD_ID, "curtain_"+colorName));
                ItemStack carpetStack = new ItemStack(item);
                if (!player.getInventory().add(carpetStack))
                    player.drop(carpetStack, false);
            }

            return InteractionResult.SUCCESS;
        }

        return super.useWithoutItem(state, world, pos, player, hit);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState,
                                  LevelAccessor world, BlockPos pos, BlockPos neighborPos)
    {
        return updateCurtainRodVariant(state, world, pos);
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving)
    {
        super.onPlace(state, world, pos, oldState, isMoving);
        updateSurroundingCurtainRodes(world, pos);
    }

    private void updateSurroundingCurtainRodes(Level world, BlockPos pos)
    {
        for (Direction dir : Direction.Plane.HORIZONTAL)
        {
            BlockPos neighborPos = pos.relative(dir);
            BlockState neighborState = world.getBlockState(neighborPos);
            if (neighborState.getBlock() == this)
                world.setBlock(neighborPos, updateCurtainRodVariant(neighborState, world, neighborPos), 3);
        }
    }

    private BlockState updateCurtainRodVariant(BlockState state, LevelAccessor world, BlockPos pos)
    {
        Direction facing = state.getValue(FACING);
        BlockPos leftPos = pos.relative(facing.getCounterClockWise());
        BlockPos rightPos = pos.relative(facing.getClockWise());

        boolean leftConnected = isCurtainRod(world, leftPos, facing);
        boolean rightConnected = isCurtainRod(world, rightPos, facing);

        if (leftConnected && rightConnected)
            return state.setValue(VARIANT, Variant.CENTER);
        else if (leftConnected)
            return state.setValue(VARIANT, Variant.RIGHT);
        else if (rightConnected)
            return state.setValue(VARIANT, Variant.LEFT);
        else
            return state.setValue(VARIANT, Variant.NORMAL);
    }

    private boolean isCurtainRod(LevelAccessor world, BlockPos pos, Direction facing)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() == this && state.getValue(FACING) == facing;
    }
}