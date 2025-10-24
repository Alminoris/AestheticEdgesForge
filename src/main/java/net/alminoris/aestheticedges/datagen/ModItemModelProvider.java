package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static net.alminoris.aestheticedges.util.helper.BlockSetsHelper.COLORS;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(DataGenerator output, ExistingFileHelper existingFileHelper)
    {
        super(output, AestheticEdges.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        for (String name : COLORS)
        {
            generatedItem(ModItems.CURTAINS.get(name));
        }
        generatedItem(ModItems.CURTAIN_REMOVER);
    }

    private ItemModelBuilder generatedItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AestheticEdges.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AestheticEdges.MOD_ID,"item/" + item.getId().getPath()));
    }
}