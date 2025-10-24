package net.alminoris.aestheticedges.block;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.block.custom.CurtainRodBlock;
import net.alminoris.aestheticedges.block.custom.YAxisRotatedBlock;
import net.alminoris.aestheticedges.item.ModItems;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.alminoris.aestheticedges.util.helper.BlockShape;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AestheticEdges.MOD_ID);

    public static final Dictionary<String, RegistryObject<Block>> CURBSTONES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 16, 8, 8))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> CURBSTONES_INNER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_inner_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 8, 8, 8), new BlockShape(8, 0, 0, 16, 8, 16))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> CURBSTONES_OUTER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_outer_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
                    new BlockShape(8, 0, 0, 16, 8, 8))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> HIGH_CURBSTONES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_high_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 16, 16, 8))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> HIGH_CURBSTONES_INNER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_high_inner_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 8, 16, 8), new BlockShape(8, 0, 0, 16, 16, 16))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> HIGH_CURBSTONES_OUTER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_high_outer_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
                    new BlockShape(8, 0, 0, 16, 16, 8))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> SIMPLE_CURBS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("simple_curb_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 16, 8, 8))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> SIMPLE_CURBS_INNER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("simple_curb_inner_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 8, 8, 8), new BlockShape(8, 0, 0, 16, 8, 16))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> SIMPLE_CURBS_OUTER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("simple_curb_outer_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
                    new BlockShape(8, 0, 0, 16, 8, 8))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> BASEBOARDS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("baseboard_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS),
                    new BlockShape(0, 0, 0, 16, 3, 3))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> BASEBOARDS_INNER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("baseboard_inner_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS),
                    new BlockShape(0, 0, 0, 16, 3, 3), new BlockShape(13, 0, 0, 16, 3, 16))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> BASEBOARDS_OUTER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("baseboard_outer_"+name, () -> new YAxisRotatedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS),
                    new BlockShape(13, 0, 0, 16, 3, 3))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> CURTAIN_RODS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("curtain_rod_"+name, () -> new CurtainRodBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD),
                    new BlockShape(0, 14, 0, 16, 17, 3))));
        }

        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curtain_rod_"+name, () -> new CurtainRodBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
                    new BlockShape(0, 14, 0, 16, 17, 3))));
        }
    }};

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}