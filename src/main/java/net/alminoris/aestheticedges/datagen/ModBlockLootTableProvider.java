package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider
{
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries)
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate()
    {
        for(String name : BlockSetsHelper.getStones())
        {
            dropSelf(ModBlocks.CURBSTONES.get(name).get());
            dropSelf(ModBlocks.CURBSTONES_INNER.get(name).get());
            dropSelf(ModBlocks.CURBSTONES_OUTER.get(name).get());

            dropSelf(ModBlocks.HIGH_CURBSTONES.get(name).get());
            dropSelf(ModBlocks.HIGH_CURBSTONES_INNER.get(name).get());
            dropSelf(ModBlocks.HIGH_CURBSTONES_OUTER.get(name).get());

            dropSelf(ModBlocks.SIMPLE_CURBS.get(name).get());
            dropSelf(ModBlocks.SIMPLE_CURBS_INNER.get(name).get());
            dropSelf(ModBlocks.SIMPLE_CURBS_OUTER.get(name).get());
        }

        for(String name : BlockSetsHelper.getWoods())
        {
            dropSelf(ModBlocks.BASEBOARDS.get(name).get());
            dropSelf(ModBlocks.BASEBOARDS_INNER.get(name).get());
            dropSelf(ModBlocks.BASEBOARDS_OUTER.get(name).get());
        }

        for(String name : BlockSetsHelper.getWoodsNStones())
        {
            dropSelf(ModBlocks.CURTAIN_RODS.get(name).get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}