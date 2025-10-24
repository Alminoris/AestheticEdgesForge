package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.item.ModItems;
import net.alminoris.aestheticedges.util.ModTags;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModItemTagProvider extends ItemTagsProvider
{
    public ModItemTagProvider(DataGenerator packOutput, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(packOutput, blockTagsProvider, AestheticEdges.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        for (String name : BlockSetsHelper.COLORS)
        {
            this.tag(ModTags.Items.CURTAINS).add(ModItems.CURTAINS.get(name).get());
        }
    }
}
