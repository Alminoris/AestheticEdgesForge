package net.alminoris.aestheticedges.block.custom;


import net.alminoris.aestheticedges.util.helper.BlockShape;
import net.alminoris.aestheticedges.util.helper.VoxelShapeHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.ArrayList;
import java.util.List;

public class YAxisRotatedBlock extends Block implements SimpleWaterloggedBlock
{
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    List<BlockShape> shapes;

    public YAxisRotatedBlock(BlockBehaviour.Properties settings, BlockShape... shapes)
    {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
        this.shapes = List.of(shapes);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx)
    {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context)
    {
        return getRotatedShape(state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state)
    {
        return RenderShape.MODEL;
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.getValue(FACING);

        List<AABB> boxes = new ArrayList<>();
        for(var shape : shapes)
        {
            VoxelShape voxelShape = YAxisRotatedBlock.createCuboidShape(shape.getShapeCoords());
            boxes.add(voxelShape.bounds());
        }

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    private static VoxelShape createCuboidShape(List<Double> shapeCoords)
    {
        return Block.box(
                shapeCoords.get(0),
                shapeCoords.get(1),
                shapeCoords.get(2),
                shapeCoords.get(3),
                shapeCoords.get(4),
                shapeCoords.get(5)
        );
    }
}