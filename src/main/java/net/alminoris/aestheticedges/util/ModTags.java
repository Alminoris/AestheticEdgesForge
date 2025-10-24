package net.alminoris.aestheticedges.util;

import net.alminoris.aestheticedges.AestheticEdges;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Blocks
    {
        private static TagKey<Block> createTag(String name)
        {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(AestheticEdges.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> CURTAINS = createTag("curtains");

        private static TagKey<Item> createTag(String name)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(AestheticEdges.MOD_ID, name));
        }
    }
}