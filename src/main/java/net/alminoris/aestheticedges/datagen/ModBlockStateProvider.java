package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.alminoris.aestheticedges.util.helper.ModJsonHelper;
import net.alminoris.aestheticedges.util.helper.ModJsonTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static net.alminoris.aestheticedges.util.helper.BlockSetsHelper.COLORS;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, AestheticEdges.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for(String name : BlockSetsHelper.STONES)
        {
            registerCurtainRod(ModBlocks.CURTAIN_RODS.get(name), name, name, "minecraft");

            registerEdge(ModJsonTemplates.CURBSTONE_MODEL_TEMPLATE, ModBlocks.CURBSTONES.get(name), name, "minecraft");
            registerEdge(ModJsonTemplates.CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_INNER.get(name), name, "minecraft");
            registerEdge(ModJsonTemplates.CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_OUTER.get(name), name, "minecraft");

            registerEdge(ModJsonTemplates.HIGH_CURBSTONE_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES.get(name), name, "minecraft");
            registerEdge(ModJsonTemplates.HIGH_CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_INNER.get(name), name, "minecraft");
            registerEdge(ModJsonTemplates.HIGH_CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_OUTER.get(name), name, "minecraft");

            registerEdge(ModJsonTemplates.SIMPLE_CURB_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS.get(name), name, "minecraft");
            registerEdge(ModJsonTemplates.SIMPLE_CURB_INNER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_INNER.get(name), name, "minecraft");
            registerEdge(ModJsonTemplates.SIMPLE_CURB_OUTER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_OUTER.get(name), name, "minecraft");
        }

        for(String name : BlockSetsHelper.EXTRA_STONES_WF)
        {
            registerCurtainRod(ModBlocks.CURTAIN_RODS.get(name), name, name, "aestheticedges");

            registerEdge(ModJsonTemplates.CURBSTONE_MODEL_TEMPLATE, ModBlocks.CURBSTONES.get(name), name, "aestheticedges");
            registerEdge(ModJsonTemplates.CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_INNER.get(name), name, "aestheticedges");
            registerEdge(ModJsonTemplates.CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_OUTER.get(name), name, "aestheticedges");

            registerEdge(ModJsonTemplates.HIGH_CURBSTONE_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES.get(name), name, "aestheticedges");
            registerEdge(ModJsonTemplates.HIGH_CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_INNER.get(name), name, "aestheticedges");
            registerEdge(ModJsonTemplates.HIGH_CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_OUTER.get(name), name, "aestheticedges");

            registerEdge(ModJsonTemplates.SIMPLE_CURB_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS.get(name), name, "aestheticedges");
            registerEdge(ModJsonTemplates.SIMPLE_CURB_INNER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_INNER.get(name), name, "aestheticedges");
            registerEdge(ModJsonTemplates.SIMPLE_CURB_OUTER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_OUTER.get(name), name, "aestheticedges");
        }

        for(String name : BlockSetsHelper.WOODS)
        {
            String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

            registerCurtainRod(ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_"+logName, "minecraft");

            registerEdge(ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "minecraft");
            registerEdge(ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "minecraft");
            registerEdge(ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "minecraft");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            registerCurtainRod(ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            registerCurtainRod(ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }

        for(String name : BlockSetsHelper.WT_WOOD_NAMES)
        {
            registerCurtainRod(ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }

        for(String name : BlockSetsHelper.ST_WOOD_NAMES)
        {
            registerCurtainRod(ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }

        for(String name : BlockSetsHelper.MT_WOOD_NAMES)
        {
            registerCurtainRod(ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }

        for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
        {
            registerCurtainRod(ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }
    }

    public final void registerCurtainRod(RegistryObject<Block> curtainRod, String matName ,String name, String modId)
    {
        for (String colorName : COLORS)
        {
            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "normal", false, false);
            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "left", false, false);
            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "right", false, false);
            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "center", false, false);

            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "normal", true, false);
            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "left", true, false);
            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "right", true, false);
            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "center", true, false);

            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "normal", true, true);
            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "left", true, true);
            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "right", true, true);
            ModJsonHelper.createCurtainRodBlockModel(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(),modId+":block/"+name,
                    colorName, "center", true, true);
        }

        String filePath = System.getProperty("user.dir").replace("run-data",
                "src\\main\\resources") + "/assets/"+ AestheticEdges.MOD_ID+"/blockstates/curtain_rod_template.json";
        String s = "";
        try { s = Files.readString(Paths.get(filePath)); } catch (IOException ignored) {}

        ModJsonHelper.createBlockstate(ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath(), matName, s);
        blockItem(curtainRod, "block/"+ForgeRegistries.BLOCKS.getKey(curtainRod.get()).getPath());
    }

    public final void registerEdge(String jsonContext, RegistryObject<Block> curbstone, String name, String modId)
    {
        ModJsonHelper.createBlockModel(jsonContext, ForgeRegistries.BLOCKS.getKey(curbstone.get()).getPath(),modId+":block/"+name);
        ModJsonHelper.createBlockstate(ForgeRegistries.BLOCKS.getKey(curbstone.get()).getPath(), ForgeRegistries.BLOCKS.getKey(curbstone.get()).getPath(), ModJsonTemplates.YAXIS_ROTATED_BLOCKSTATE_TEMPLATE);
        blockItem(curbstone, "block/"+ForgeRegistries.BLOCKS.getKey(curbstone.get()).getPath());
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String name)
    {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("aestheticedges:" + name));
    }
}