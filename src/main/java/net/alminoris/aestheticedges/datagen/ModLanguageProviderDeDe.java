package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderDeDe extends LanguageProvider
{
    public ModLanguageProviderDeDe(PackOutput output)
    {
        super(output, AestheticEdges.MOD_ID, "de_de");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> woodEdges = new LinkedHashMap<>();
        woodEdges.put("baseboard_", "Sockelleiste aus %s");
        woodEdges.put("baseboard_inner_", "Innenecke der Sockelleiste aus %s");
        woodEdges.put("baseboard_outer_", "Außenecke der Sockelleiste aus %s");
        woodEdges.put("curtain_rod_", "Vorhangstange aus %s");

        Map<String, String> stoneEdges = new LinkedHashMap<>();
        stoneEdges.put("curbstone_", "Bordstein aus %s");
        stoneEdges.put("curbstone_inner_", "Innenecke des Bordsteins aus %s");
        stoneEdges.put("curbstone_outer_", "Außenecke des Bordsteins aus %s");
        stoneEdges.put("curbstone_high_", "Hoher Bordstein aus %s");
        stoneEdges.put("curbstone_high_inner_", "Innenecke des hohen Bordsteins aus %s");
        stoneEdges.put("curbstone_high_outer_", "Außenecke des hohen Bordsteins aus %s");
        stoneEdges.put("simple_curb_", "Einfacher Bordstein aus %s");
        stoneEdges.put("simple_curb_inner_", "Innenecke des einfachen Bordstein aus %s");
        stoneEdges.put("simple_curb_outer_", "Außenecke des einfachen Bordstein aus %s");
        stoneEdges.put("curtain_rod_", "Vorhangstange aus %s");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "Sumpfzypresse");
        woodMaterials.put("thuja", "Thuja");
        woodMaterials.put("sequoia", "Mammutbaum");
        woodMaterials.put("mountain_hemlock", "Berg-Hemlocktanne");
        woodMaterials.put("cryptomeria", "Kryptomerie");
        woodMaterials.put("yew", "Eibe");
        woodMaterials.put("larch", "Lärche");
        woodMaterials.put("olive", "Olivenholz");
        woodMaterials.put("tamarisk", "Tamariske");
        woodMaterials.put("western_serviceberry", "Westlicher Felsenmispel");
        woodMaterials.put("trembling_aspen", "Zitterpappel");
        woodMaterials.put("cottonwood", "Baumwollpappel");
        woodMaterials.put("walnut", "Walnuss");
        woodMaterials.put("silver_maple", "Silber-Ahorn");
        woodMaterials.put("staghorn_sumac", "Essigbaum");
        woodMaterials.put("silverberry", "Silberölweide");
        woodMaterials.put("willow", "Weide");
        woodMaterials.put("poplar", "Pappel");
        woodMaterials.put("alder", "Erle");
        woodMaterials.put("aspen", "Espe");
        woodMaterials.put("azalea", "Azalee");
        woodMaterials.put("apple", "Apfelbaum");
        woodMaterials.put("scots_pine", "Waldkiefer");
        woodMaterials.put("swamp_oak", "Sumpfeiche");
        woodMaterials.put("aspen_nss", "Espe");
        woodMaterials.put("cedar_nss", "Zeder");
        woodMaterials.put("coconut_nss", "Kokospalme");
        woodMaterials.put("cypress_nss", "Zypresse");
        woodMaterials.put("fir_nss", "Tanne");
        woodMaterials.put("ghaf_nss", "Ghaf-Baum");
        woodMaterials.put("larch_nss", "Lärche");
        woodMaterials.put("mahogany_nss", "Mahagoni");
        woodMaterials.put("maple_nss", "Ahorn");
        woodMaterials.put("olive_nss", "Olivenholz");
        woodMaterials.put("palo_verde_nss", "Palo-Verde-Holz");
        woodMaterials.put("redwood_nss", "Mammutbaum");
        woodMaterials.put("saxaul_nss", "Saxaul");
        woodMaterials.put("sugi_nss", "Sugi");
        woodMaterials.put("willow_nss", "Weide");
        woodMaterials.put("wisteria_nss", "Blauregen");
        woodMaterials.put("oak", "Eiche");
        woodMaterials.put("birch", "Birke");
        woodMaterials.put("spruce", "Fichte");
        woodMaterials.put("jungle", "Tropenholz");
        woodMaterials.put("acacia", "Akazie");
        woodMaterials.put("dark_oak", "Dunkeleiche");
        woodMaterials.put("crimson", "Karmesinholz");
        woodMaterials.put("warped", "Wirrholz");
        woodMaterials.put("mangrove", "Mangrovenholz");
        woodMaterials.put("cherry", "Kirschbaum");
        woodMaterials.put("bamboo", "Bambus");
        woodMaterials.put("hazelnut", "Hasel");
        woodMaterials.put("hornbeam", "Hainbuche");
        woodMaterials.put("hawthorn", "Weißdorn");
        woodMaterials.put("quince", "Quitte");
        woodMaterials.put("plum", "Pflaume");
        woodMaterials.put("mango", "Mango");
        woodMaterials.put("fig", "Feige");
        woodMaterials.put("viburnum", "Schneeball");
        woodMaterials.put("white_mulberry", "Weiße Maulbeere");
        woodMaterials.put("wild_cherry", "Süßkirsche");
        woodMaterials.put("bauhinia", "Bauhinie");
        woodMaterials.put("pine", "Kiefer");
        woodMaterials.put("fir", "Tanne");
        woodMaterials.put("cedar", "Zeder");
        woodMaterials.put("araucaria", "Araukarie");
        woodMaterials.put("juniper", "Wacholder");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "Stein");
        stoneMaterials.put("tuff", "Tuffstein");
        stoneMaterials.put("blackstone", "Schwarzstein");
        stoneMaterials.put("andesite", "Andesit");
        stoneMaterials.put("diorite", "Diorit");
        stoneMaterials.put("granite", "Granit");
        stoneMaterials.put("deepslate", "Tiefenschiefer");
        stoneMaterials.put("basalt_side", "Basalt");
        stoneMaterials.put("quartz_block_bottom", "Quarz");
        stoneMaterials.put("stone_bricks", "Steinziegel");
        stoneMaterials.put("bricks", "Ziegel");
        stoneMaterials.put("mud_bricks", "Lehmziegel");
        stoneMaterials.put("sandstone", "Sandstein");
        stoneMaterials.put("dolomite_block", "Dolomit");
        stoneMaterials.put("saltmarsh_block", "Salzmoorstein");
        stoneMaterials.put("loessic_marl_block", "Lössmergel");
        stoneMaterials.put("loamy_marl_block", "Tonmergel");
        stoneMaterials.put("fossil_marlstone_block", "Fossiler Mergelstein");
        stoneMaterials.put("limestone_block", "Kalkstein");

        for (Map.Entry<String, String> type : stoneEdges.entrySet())
        {
            for (Map.Entry<String, String> mat : stoneMaterials.entrySet())
            {
                String key = "block." + AestheticEdges.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                add(key, value);
            }
        }


        for (Map.Entry<String, String> type : woodEdges.entrySet())
        {
            for (Map.Entry<String, String> mat : woodMaterials.entrySet())
            {
                String key = "block." + AestheticEdges.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                add(key, value);
            }
        }

        Map<String, String> colorItems = new LinkedHashMap<>();
        colorItems.put("curtain_", "Vorhang");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "Schwarzer %s");
        colors.put("brown", "Brauner %s");
        colors.put("gray", "Grauer %s");
        colors.put("light_gray", "Hellgrauer %s");
        colors.put("white", "Weißer %s");
        colors.put("red", "Roter %s");
        colors.put("orange", "Oranger %s");
        colors.put("yellow", "Gelber %s");
        colors.put("blue", "Blauer %s");
        colors.put("cyan", "Türkiser %s");
        colors.put("light_blue", "Hellblauer %s");
        colors.put("purple", "Violetter %s");
        colors.put("magenta", "Magenta %s");
        colors.put("pink", "Rosa %s");
        colors.put("green", "Grüner %s");
        colors.put("lime", "Hellgrüner %s");

        for (Map.Entry<String, String> type : colorItems.entrySet())
        {
            for (Map.Entry<String, String> mat : colors.entrySet())
            {
                String key = "item." + AestheticEdges.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(mat.getValue(), type.getValue());
                add(key, value);
            }
        }

        add("item." + AestheticEdges.MOD_ID + ".curtain_remover", "Vorhangentferner");

        add("itemgroup.aedgstab","Aesthetic Edges");
    }
}