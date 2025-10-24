package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.item.ModItemGroups;
import net.alminoris.aestheticedges.item.ModItems;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.alminoris.aestheticedges.util.helper.ModJsonHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{
    public ModRecipeProvider(DataGenerator pOutput)
    {
        super(pOutput);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> recipeExporter)
    {
        ShapedRecipeBuilder.shaped(ModItems.CURTAIN_REMOVER.get())
                .pattern("# #")
                .pattern(" / ")
                .pattern(" / ")
                .define('#', Items.IRON_INGOT)
                .define('/', Items.STICK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(recipeExporter);

        for(String name : BlockSetsHelper.COLORS)
        {
            Block block = ForgeRegistries.BLOCKS.getValue(ResourceLocation.withDefaultNamespace(name+"_wool"));

            ShapedRecipeBuilder.shaped(ModItems.CURTAINS.get(name).get())
                    .pattern("#")
                    .pattern("#")
                    .define('#', block)
                    .unlockedBy(getHasName(block), has(block))
                    .save(recipeExporter);
        }

        for(String name : BlockSetsHelper.STONES)
        {
            Block block = ForgeRegistries.BLOCKS.getValue(ResourceLocation.withDefaultNamespace(name.equals("basalt_side") ? "basalt" :
                    (name.equals("quartz_block_bottom") ? "quartz_block" : name)));

            stonecutterResultFromBase(recipeExporter, ModBlocks.CURTAIN_RODS.get(name).get(), block, 2);

            stonecutterResultFromBase(recipeExporter, ModBlocks.CURBSTONES.get(name).get(), block, 3);
            stonecutterResultFromBase(recipeExporter, ModBlocks.CURBSTONES_OUTER.get(name).get(), block, 4);
            stonecutterResultFromBase(recipeExporter, ModBlocks.CURBSTONES_INNER.get(name).get(), block, 2);

            stonecutterResultFromBase(recipeExporter, ModBlocks.HIGH_CURBSTONES.get(name).get(), block, 2);
            stonecutterResultFromBase(recipeExporter, ModBlocks.HIGH_CURBSTONES_OUTER.get(name).get(), block, 3);
            stonecutterResultFromBase(recipeExporter, ModBlocks.HIGH_CURBSTONES_INNER.get(name).get(), block, 1);

            stonecutterResultFromBase(recipeExporter, ModBlocks.SIMPLE_CURBS.get(name).get(), block, 4);
            stonecutterResultFromBase(recipeExporter, ModBlocks.SIMPLE_CURBS_OUTER.get(name).get(), block, 8);
            stonecutterResultFromBase(recipeExporter, ModBlocks.SIMPLE_CURBS_INNER.get(name).get(), block, 2);
        }

        for(String name : ModItemGroups.EXTRA_STONES_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.CURTAIN_RODS.get(name).get()).getPath(), "2");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.CURBSTONES.get(name).get()).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.CURBSTONES_OUTER.get(name).get()).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.CURBSTONES_INNER.get(name).get()).getPath(), "2");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.HIGH_CURBSTONES.get(name).get()).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.HIGH_CURBSTONES_OUTER.get(name).get()).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.HIGH_CURBSTONES_INNER.get(name).get()).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.SIMPLE_CURBS.get(name).get()).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.SIMPLE_CURBS_OUTER.get(name).get()).getPath(), "8");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.SIMPLE_CURBS_INNER.get(name).get()).getPath(), "2");
        }

        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = ForgeRegistries.BLOCKS.getValue(ResourceLocation.withDefaultNamespace(name+"_planks"));

            String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");
            Block block1 = ForgeRegistries.BLOCKS.getValue(ResourceLocation.withDefaultNamespace("stripped_"+name+"_"+logName));

            stonecutterResultFromBase(recipeExporter, ModBlocks.CURTAIN_RODS.get(name).get(), block1, 2);

            stonecutterResultFromBase(recipeExporter, ModBlocks.BASEBOARDS.get(name).get(), block, 3);
            stonecutterResultFromBase(recipeExporter, ModBlocks.BASEBOARDS_OUTER.get(name).get(), block, 4);
            stonecutterResultFromBase(recipeExporter, ModBlocks.BASEBOARDS_INNER.get(name).get(), block, 2);
        }

        for(String name : ModItemGroups.AN_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("arborealnature:stripped_"+name+"_log",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.CURTAIN_RODS.get(name).get()).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS.get(name).get()).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_OUTER.get(name).get()).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_INNER.get(name).get()).getPath(), "2");
        }

        for(String name : ModItemGroups.WF_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:stripped_"+name+"_log",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.CURTAIN_RODS.get(name).get()).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS.get(name).get()).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_OUTER.get(name).get()).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_INNER.get(name).get()).getPath(), "2");
        }

        for(String name : ModItemGroups.ST_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:stripped_"+name+"_log",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.CURTAIN_RODS.get(name).get()).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS.get(name).get()).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_OUTER.get(name).get()).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_INNER.get(name).get()).getPath(), "2");
        }

        for(String name : ModItemGroups.MT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("missingtrees:stripped_"+name+"_log",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.CURTAIN_RODS.get(name).get()).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS.get(name).get()).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_OUTER.get(name).get()).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_INNER.get(name).get()).getPath(), "2");
        }

        for(String name : ModItemGroups.WT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:stripped_"+name+"_log",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.CURTAIN_RODS.get(name).get()).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS.get(name).get()).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_OUTER.get(name).get()).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_INNER.get(name).get()).getPath(), "2");
        }

        for(String name : ModItemGroups.NSS_WOOD_NAMES)
        {
            String newName = name.replace("_nss", "");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:stripped_"+newName+"_log",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.CURTAIN_RODS.get(name).get()).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+newName+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS.get(name).get()).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+newName+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_OUTER.get(name).get()).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+newName+"_planks",
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.BASEBOARDS_INNER.get(name).get()).getPath(), "2");
        }
    }
}