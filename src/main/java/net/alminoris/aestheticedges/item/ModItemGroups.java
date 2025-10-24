package net.alminoris.aestheticedges.item;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = AestheticEdges.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemGroups
{
    public static CreativeModeTab AEDGS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        AEDGS_TAB = event.registerCreativeModeTab(ResourceLocation.fromNamespaceAndPath(AestheticEdges.MOD_ID, "aedgstab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.CURBSTONES_OUTER.get("stone_bricks").get().asItem()))
                        .title(Component.translatable("itemgroup.aedgstab")));
    }
}