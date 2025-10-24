package net.alminoris.aestheticedges;

import com.mojang.logging.LogUtils;
import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.item.ModItemGroups;
import net.alminoris.aestheticedges.item.ModItems;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(AestheticEdges.MOD_ID)
public class AestheticEdges
{
    public static final String MOD_ID = "aestheticedges";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AestheticEdges(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents entries)
    {
        if (entries.getTab() == ModItemGroups.AEDGS_TAB)
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
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
