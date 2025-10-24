package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderEsEs extends LanguageProvider
{
    public ModLanguageProviderEsEs(DataGenerator output)
    {
        super(output, AestheticEdges.MOD_ID, "es_es");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> woodEdges = new LinkedHashMap<>();
        woodEdges.put("baseboard_", "Rodapié de %s");
        woodEdges.put("baseboard_inner_", "Esquina interior del rodapié de %s");
        woodEdges.put("baseboard_outer_", "Esquina exterior del rodapié de %s");
        woodEdges.put("curtain_rod_", "Barra de cortina de %s");

        Map<String, String> stoneEdges = new LinkedHashMap<>();
        stoneEdges.put("curbstone_", "Bordillo de %s");
        stoneEdges.put("curbstone_inner_", "Esquina interior del bordillo de %s");
        stoneEdges.put("curbstone_outer_", "Esquina exterior del bordillo de %s");
        stoneEdges.put("curbstone_high_", "Bordillo alto de %s");
        stoneEdges.put("curbstone_high_inner_", "Esquina interior del bordillo alto de %s");
        stoneEdges.put("curbstone_high_outer_", "Esquina exterior del bordillo alto de %s");
        stoneEdges.put("simple_curb_", "Bordillo simple de %s");
        stoneEdges.put("simple_curb_inner_", "Esquina interior del bordillo simple de %s");
        stoneEdges.put("simple_curb_outer_", "Esquina exterior del bordillo simple de %s");
        stoneEdges.put("curtain_rod_", "Barra de cortina de %s");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "ciprés calvo");
        woodMaterials.put("thuja", "tuya");
        woodMaterials.put("sequoia", "secuoya");
        woodMaterials.put("mountain_hemlock", "tsuga de montaña");
        woodMaterials.put("cryptomeria", "criptoemeria");
        woodMaterials.put("yew", "tejo");
        woodMaterials.put("larch", "alerce");
        woodMaterials.put("olive", "olivo");
        woodMaterials.put("tamarisk", "taray");
        woodMaterials.put("western_serviceberry", "amelanchero occidental");
        woodMaterials.put("trembling_aspen", "álamo temblón");
        woodMaterials.put("cottonwood", "álamo negro");
        woodMaterials.put("walnut", "nogal");
        woodMaterials.put("silver_maple", "arce plateado");
        woodMaterials.put("staghorn_sumac", "zumaque");
        woodMaterials.put("silverberry", "eleagno plateado");
        woodMaterials.put("willow", "sauce");
        woodMaterials.put("poplar", "álamo");
        woodMaterials.put("alder", "aliso");
        woodMaterials.put("aspen", "álamo temblón");
        woodMaterials.put("azalea", "azalea");
        woodMaterials.put("apple", "manzano");
        woodMaterials.put("scots_pine", "pino silvestre");
        woodMaterials.put("swamp_oak", "roble pantanoso");
        woodMaterials.put("aspen_nss", "álamo temblón");
        woodMaterials.put("cedar_nss", "cedro");
        woodMaterials.put("coconut_nss", "palmera de coco");
        woodMaterials.put("cypress_nss", "ciprés");
        woodMaterials.put("fir_nss", "abeto");
        woodMaterials.put("ghaf_nss", "ghaf");
        woodMaterials.put("larch_nss", "alerce");
        woodMaterials.put("mahogany_nss", "caoba");
        woodMaterials.put("maple_nss", "arce");
        woodMaterials.put("olive_nss", "olivo");
        woodMaterials.put("palo_verde_nss", "palo verde");
        woodMaterials.put("redwood_nss", "secuoya");
        woodMaterials.put("saxaul_nss", "saxaul");
        woodMaterials.put("sugi_nss", "sugi");
        woodMaterials.put("willow_nss", "sauce");
        woodMaterials.put("wisteria_nss", "glicina");
        woodMaterials.put("oak", "roble");
        woodMaterials.put("birch", "abedul");
        woodMaterials.put("spruce", "abeto");
        woodMaterials.put("jungle", "madera tropical");
        woodMaterials.put("acacia", "acacia");
        woodMaterials.put("dark_oak", "roble oscuro");
        woodMaterials.put("crimson", "madera carmesí");
        woodMaterials.put("warped", "madera deformada");
        woodMaterials.put("mangrove", "mangle");
        woodMaterials.put("cherry", "cerezo");
        woodMaterials.put("bamboo", "bambú");
        woodMaterials.put("hazelnut", "avellano");
        woodMaterials.put("hornbeam", "carpe");
        woodMaterials.put("hawthorn", "espino");
        woodMaterials.put("quince", "membrillero");
        woodMaterials.put("plum", "ciruelo");
        woodMaterials.put("mango", "mango");
        woodMaterials.put("fig", "higuera");
        woodMaterials.put("viburnum", "viburno");
        woodMaterials.put("white_mulberry", "morera blanca");
        woodMaterials.put("wild_cherry", "guindo");
        woodMaterials.put("bauhinia", "bauhinia");
        woodMaterials.put("pine", "pino");
        woodMaterials.put("fir", "abeto");
        woodMaterials.put("cedar", "cedro");
        woodMaterials.put("araucaria", "araucaria");
        woodMaterials.put("juniper", "enebro");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "piedra");
        stoneMaterials.put("tuff", "toba");
        stoneMaterials.put("blackstone", "piedra negra");
        stoneMaterials.put("andesite", "andesita");
        stoneMaterials.put("diorite", "diorita");
        stoneMaterials.put("granite", "granito");
        stoneMaterials.put("deepslate", "pizarra profunda");
        stoneMaterials.put("basalt_side", "basalto");
        stoneMaterials.put("quartz_block_bottom", "cuarzo");
        stoneMaterials.put("stone_bricks", "ladrillos de piedra");
        stoneMaterials.put("bricks", "ladrillos");
        stoneMaterials.put("mud_bricks", "ladrillos de barro");
        stoneMaterials.put("sandstone", "arenisca");
        stoneMaterials.put("dolomite_block", "dolomita");
        stoneMaterials.put("saltmarsh_block", "bloque de marisma salada");
        stoneMaterials.put("loessic_marl_block", "marga loésica");
        stoneMaterials.put("loamy_marl_block", "marga arcillosa");
        stoneMaterials.put("fossil_marlstone_block", "marga fósil");
        stoneMaterials.put("limestone_block", "caliza");

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
        colorItems.put("curtain_", "Cortina");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "%s negro");
        colors.put("brown", "%s marrón");
        colors.put("gray", "%s gris");
        colors.put("light_gray", "%s gris claro");
        colors.put("white", "%s blanco");
        colors.put("red", "%s rojo");
        colors.put("orange", "%s naranja");
        colors.put("yellow", "%s amarillo");
        colors.put("blue", "%s azul");
        colors.put("cyan", "%s cian");
        colors.put("light_blue", "%s azul claro");
        colors.put("purple", "%s morado");
        colors.put("magenta", "%s magenta");
        colors.put("pink", "%s rosa");
        colors.put("green", "%s verde");
        colors.put("lime", "%s verde lima");


        for (Map.Entry<String, String> type : colorItems.entrySet())
        {
            for (Map.Entry<String, String> mat : colors.entrySet())
            {
                String key = "item." + AestheticEdges.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                add(key, value);
            }
        }

        add("item." + AestheticEdges.MOD_ID + ".curtain_remover", "Quitacortinas");

        add("itemgroup.aedgstab","Aesthetic Edges");
    }
}