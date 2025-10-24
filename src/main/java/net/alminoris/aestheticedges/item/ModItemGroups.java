package net.alminoris.aestheticedges.item;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = AestheticEdges.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemGroups
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AestheticEdges.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AEDGS_TAB = CREATIVE_MODE_TABS.register("aedgstab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(ModBlocks.CURBSTONES_OUTER.get("stone_bricks").get().asItem()::getDefaultInstance)
            .title(Component.translatable("itemgroup.aedgstab"))
            .displayItems((parameters, entries) ->
            {
                for(String name : BlockSetsHelper.STONES)
                {
                    entries.accept(ModBlocks.CURBSTONES.get(name).get());
                    entries.accept(ModBlocks.CURBSTONES_INNER.get(name).get());
                    entries.accept(ModBlocks.CURBSTONES_OUTER.get(name).get());
                }
                if (ModList.get().isLoaded("wildfields"))
                {
                    for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                    {
                        entries.accept(ModBlocks.CURBSTONES.get(name).get());
                        entries.accept(ModBlocks.CURBSTONES_INNER.get(name).get());
                        entries.accept(ModBlocks.CURBSTONES_OUTER.get(name).get());
                    }
                }
                for(String name : BlockSetsHelper.STONES)
                {
                    entries.accept(ModBlocks.HIGH_CURBSTONES.get(name).get());
                    entries.accept(ModBlocks.HIGH_CURBSTONES_INNER.get(name).get());
                    entries.accept(ModBlocks.HIGH_CURBSTONES_OUTER.get(name).get());
                }
                if (ModList.get().isLoaded("wildfields"))
                {
                    for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                    {
                        entries.accept(ModBlocks.HIGH_CURBSTONES.get(name).get());
                        entries.accept(ModBlocks.HIGH_CURBSTONES_INNER.get(name).get());
                        entries.accept(ModBlocks.HIGH_CURBSTONES_OUTER.get(name).get());
                    }
                }
                for(String name : BlockSetsHelper.STONES)
                {
                    entries.accept(ModBlocks.SIMPLE_CURBS.get(name).get());
                    entries.accept(ModBlocks.SIMPLE_CURBS_INNER.get(name).get());
                    entries.accept(ModBlocks.SIMPLE_CURBS_OUTER.get(name).get());
                }
                for(String name : BlockSetsHelper.STONES)
                {
                    entries.accept(ModBlocks.CURTAIN_RODS.get(name).get());
                }
                if (ModList.get().isLoaded("wildfields"))
                {
                    for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                    {
                        entries.accept(ModBlocks.SIMPLE_CURBS.get(name).get());
                        entries.accept(ModBlocks.SIMPLE_CURBS_INNER.get(name).get());
                        entries.accept(ModBlocks.SIMPLE_CURBS_OUTER.get(name).get());
                    }
                    for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                    {
                        entries.accept(ModBlocks.CURTAIN_RODS.get(name).get());
                    }
                }
                for(String name : BlockSetsHelper.WOODS)
                {
                    entries.accept(ModBlocks.BASEBOARDS.get(name).get());
                    entries.accept(ModBlocks.BASEBOARDS_INNER.get(name).get());
                    entries.accept(ModBlocks.BASEBOARDS_OUTER.get(name).get());
                }

                for(String name : BlockSetsHelper.WOODS)
                {
                    entries.accept(ModBlocks.CURTAIN_RODS.get(name).get());
                }

                if (ModList.get().isLoaded("arborealnature"))
                {
                    for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                    {
                        entries.accept(ModBlocks.BASEBOARDS.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_INNER.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_OUTER.get(name).get());
                    }

                    for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                    {
                        entries.accept(ModBlocks.CURTAIN_RODS.get(name).get());
                    }
                }

                if (ModList.get().isLoaded("wildfields"))
                {
                    for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                    {
                        entries.accept(ModBlocks.BASEBOARDS.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_INNER.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_OUTER.get(name).get());
                    }

                    for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                    {
                        entries.accept(ModBlocks.CURTAIN_RODS.get(name).get());
                    }
                }

                if (ModList.get().isLoaded("whisperleaftrees"))
                {
                    for(String name : BlockSetsHelper.WT_WOOD_NAMES)
                    {
                        entries.accept(ModBlocks.BASEBOARDS.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_INNER.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_OUTER.get(name).get());
                    }

                    for(String name : BlockSetsHelper.WT_WOOD_NAMES)
                    {
                        entries.accept(ModBlocks.CURTAIN_RODS.get(name).get());
                    }
                }

                if (ModList.get().isLoaded("silverwoodtrees"))
                {
                    for(String name : BlockSetsHelper.ST_WOOD_NAMES)
                    {
                        entries.accept(ModBlocks.BASEBOARDS.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_INNER.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_OUTER.get(name).get());
                    }

                    for(String name : BlockSetsHelper.ST_WOOD_NAMES)
                    {
                        entries.accept(ModBlocks.CURTAIN_RODS.get(name).get());
                    }
                }

                if (ModList.get().isLoaded("missingtrees"))
                {
                    for(String name : BlockSetsHelper.MT_WOOD_NAMES)
                    {
                        entries.accept(ModBlocks.BASEBOARDS.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_INNER.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_OUTER.get(name).get());
                    }

                    for(String name : BlockSetsHelper.MT_WOOD_NAMES)
                    {
                        entries.accept(ModBlocks.CURTAIN_RODS.get(name).get());
                    }
                }

                if (ModList.get().isLoaded("natures_spirit"))
                {
                    for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
                    {
                        entries.accept(ModBlocks.BASEBOARDS.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_INNER.get(name).get());
                        entries.accept(ModBlocks.BASEBOARDS_OUTER.get(name).get());
                    }

                    for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
                    {
                        entries.accept(ModBlocks.CURTAIN_RODS.get(name).get());
                    }
                }

                entries.accept(ModItems.CURTAIN_REMOVER.get());

                for (String name : BlockSetsHelper.COLORS)
                {
                    entries.accept(ModItems.CURTAINS.get(name).get());
                }
            }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}