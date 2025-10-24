package net.alminoris.aestheticedges.item;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.function.Supplier;


public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AestheticEdges.MOD_ID);

    public static final Dictionary<String, RegistryObject<Item>> CURTAINS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerItem("curtain_"+name, () -> new Item(new Item.Properties().stacksTo(16))));
        }
    }};

    public static final RegistryObject<Item> CURTAIN_REMOVER = registerItem("curtain_remover", () -> new TieredItem(Tiers.STONE, new Item.Properties().stacksTo(1)));

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item)
    {
        return ITEMS.register(name, item);
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
