package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.apache.commons.lang3.StringUtils.capitalize;

public class ModLanguageProviderEnUs extends LanguageProvider
{
    public ModLanguageProviderEnUs(DataGenerator output)
    {
        super(output, AestheticEdges.MOD_ID, "en_us");
    }

    @Override
    public void addTranslations()
    {
        for (Block block : ForgeRegistries.BLOCKS)
        {
            ResourceLocation id = ForgeRegistries.BLOCKS.getKey(block);
            String path = id.getPath();

            String pathNew = path;

            pathNew = movePrefix(movePrefix(path, BlockSetsHelper.getStones()), BlockSetsHelper.getWoods());

            String[] parts = pathNew.split("_");

            String displayName = Arrays.stream(parts)
                    .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                    .collect(Collectors.joining(" "));

            displayName = displayName.replace(" Nss", "");

            add("block." + AestheticEdges.MOD_ID + "." + path, displayName);
        }

        for (Item item : ForgeRegistries.ITEMS)
        {
            ResourceLocation id = ForgeRegistries.ITEMS.getKey(item);
            String path = id.getPath();

            String pathNew = path;

            pathNew = movePrefix(path, BlockSetsHelper.COLORS);

            String[] parts = pathNew.split("_");

            String displayName = Arrays.stream(parts)
                    .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                    .collect(Collectors.joining(" "));

            add("item." + AestheticEdges.MOD_ID + "." + path, displayName);
        }

        add("itemGroup.aestheticedges.aedgstab","Aesthetic Edges");
    }

    public static String movePrefix(String input, String[] arr)
    {
        String[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted, (a, b) -> Integer.compare(b.length(), a.length()));

        for (String el : sorted)
        {
            String suffix = "_" + el;
            if (input.endsWith(suffix))
            {
                String base = input.substring(0, input.length() - suffix.length());

                return base.isEmpty() ? el : el + "_" + base;
            }
        }
        return input;
    }
}