package net.alminoris.aestheticedges.util.helper;

import net.alminoris.aestheticedges.AestheticEdges;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModJsonHelper
{
    public static void createBlockModel(String jsonContent, String name, String textureName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticEdges.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("NAME", textureName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createCurtainRodBlockModel(String jsonContent, String name, String textureName,
                                                  String color, String variant, boolean isDressed, boolean isOpened)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticEdges.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ((variant.equals("normal")) ? "" : "_" + variant) + (isDressed ? "_dressed" : "") + (isDressed ? "_" + color : "") + (isOpened ? "_opened" : "")  + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("NAME", textureName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createStonecuttingRecipe(String ingredientName, String outputName, String count)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/data/"+ AestheticEdges.MOD_ID+"/recipes/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = outputName + "_from_" + ingredientName.split(":")[1] + "_stonecutting.json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.STONECUTTING_RECIPE.replace("COUNT", count)
                .replace("INGREDIENT_NAME", ingredientName).replace("OUTPUT_NAME", outputName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createBlockstate(String name, String accurateName, String jsonTemplate)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticEdges.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = jsonTemplate.replace("NAME", accurateName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createCurtainRodBlockModel(String name, String materialName, String colorName, String variantName, boolean isDressed, boolean isOpened)
    {
        switch (variantName)
        {
            case "normal":
                if (isDressed)
                    if (isOpened)
                        createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD_DRESSED_OPENED.replace("COLOR_NAME", colorName), name, materialName,
                                colorName, variantName, true, true);
                    else
                        createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD_DRESSED.replace("COLOR_NAME", colorName), name, materialName,
                                colorName, variantName, true, false);
                else
                    createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD, name, materialName,
                            colorName, variantName, false, false);
                break;
            case "left":
                if (isDressed)
                    if (isOpened)
                        createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD_LEFT_DRESSED_OPENED.replace("COLOR_NAME", colorName), name, materialName,
                                colorName, variantName, true, true);
                    else
                        createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD_LEFT_DRESSED.replace("COLOR_NAME", colorName), name, materialName,
                                colorName, variantName, true, false);
                else
                    createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD_LEFT, name, materialName,
                            colorName, variantName, false, false);
                break;
            case "right":
                if (isDressed)
                    if (isOpened)
                        createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD_RIGHT_DRESSED_OPENED.replace("COLOR_NAME", colorName), name, materialName,
                                colorName, variantName, true, true);
                    else
                        createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD_RIGHT_DRESSED.replace("COLOR_NAME", colorName), name, materialName,
                                colorName, variantName, true, false);
                else
                    createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD_RIGHT, name, materialName,
                            colorName, variantName, false, false);
                break;
            case "center":
                if (isDressed)
                    if (isOpened)
                        createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD_CENTER_DRESSED_OPENED.replace("COLOR_NAME", colorName), name, materialName,
                                colorName, variantName, true, true);
                    else
                        createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD_CENTER_DRESSED.replace("COLOR_NAME", colorName), name, materialName,
                                colorName, variantName, true, false);
                else
                    createCurtainRodBlockModel(ModJsonTemplates.CURTAIN_ROD_CENTER, name, materialName,
                            colorName, variantName, false, false);
                break;
        }
    }
}