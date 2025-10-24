package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderFrFr extends LanguageProvider
{
    public ModLanguageProviderFrFr(PackOutput output)
    {
        super(output, AestheticEdges.MOD_ID, "fr_fr");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> woodEdges = new LinkedHashMap<>();
        woodEdges.put("baseboard_", "Plinthe en %s");
        woodEdges.put("baseboard_inner_", "Angle intérieur de la plinthe en %s");
        woodEdges.put("baseboard_outer_", "Angle extérieur de la plinthe en %s");
        woodEdges.put("curtain_rod_", "Tringle à rideaux en %s");

        Map<String, String> stoneEdges = new LinkedHashMap<>();
        stoneEdges.put("curbstone_", "Bordure en %s");
        stoneEdges.put("curbstone_inner_", "Angle intérieur de la bordure en %s");
        stoneEdges.put("curbstone_outer_", "Angle extérieur de la bordure en %s");
        stoneEdges.put("curbstone_high_", "Bordure haute en %s");
        stoneEdges.put("curbstone_high_inner_", "Angle intérieur de la bordure haute en %s");
        stoneEdges.put("curbstone_high_outer_", "Angle extérieur de la bordure haute en %s");
        stoneEdges.put("simple_curb_", "Bordure simple en %s");
        stoneEdges.put("simple_curb_inner_", "Angle intérieur de la bordure simple en %s");
        stoneEdges.put("simple_curb_outer_", "Angle extérieur de la bordure simple en %s");
        stoneEdges.put("curtain_rod_", "Tringle à rideaux en %s");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "cyprès chauve");
        woodMaterials.put("thuja", "thuya");
        woodMaterials.put("sequoia", "séquoia");
        woodMaterials.put("mountain_hemlock", "pruche de montagne");
        woodMaterials.put("cryptomeria", "cryptomérie");
        woodMaterials.put("yew", "if");
        woodMaterials.put("larch", "mélèze");
        woodMaterials.put("olive", "olivier");
        woodMaterials.put("tamarisk", "tamaris");
        woodMaterials.put("western_serviceberry", "amélanchier de l’Ouest");
        woodMaterials.put("trembling_aspen", "peuplier faux-tremble");
        woodMaterials.put("cottonwood", "peuplier deltoïde");
        woodMaterials.put("walnut", "noyer");
        woodMaterials.put("silver_maple", "érable argenté");
        woodMaterials.put("staghorn_sumac", "sumac vinaigrier");
        woodMaterials.put("silverberry", "chalef argenté");
        woodMaterials.put("willow", "saule");
        woodMaterials.put("poplar", "peuplier");
        woodMaterials.put("alder", "aulne");
        woodMaterials.put("aspen", "tremble");
        woodMaterials.put("azalea", "azalée");
        woodMaterials.put("apple", "pommier");
        woodMaterials.put("scots_pine", "pin sylvestre");
        woodMaterials.put("swamp_oak", "chêne des marais");
        woodMaterials.put("aspen_nss", "tremble");
        woodMaterials.put("cedar_nss", "cèdre");
        woodMaterials.put("coconut_nss", "cocotier");
        woodMaterials.put("cypress_nss", "cyprès");
        woodMaterials.put("fir_nss", "sapin");
        woodMaterials.put("ghaf_nss", "ghaf");
        woodMaterials.put("larch_nss", "mélèze");
        woodMaterials.put("mahogany_nss", "acajou");
        woodMaterials.put("maple_nss", "érable");
        woodMaterials.put("olive_nss", "olivier");
        woodMaterials.put("palo_verde_nss", "palo verde");
        woodMaterials.put("redwood_nss", "séquoia");
        woodMaterials.put("saxaul_nss", "saxaul");
        woodMaterials.put("sugi_nss", "sugi");
        woodMaterials.put("willow_nss", "saule");
        woodMaterials.put("wisteria_nss", "glycine");
        woodMaterials.put("oak", "chêne");
        woodMaterials.put("birch", "bouleau");
        woodMaterials.put("spruce", "épicéa");
        woodMaterials.put("jungle", "bois tropical");
        woodMaterials.put("acacia", "acacia");
        woodMaterials.put("dark_oak", "chêne noir");
        woodMaterials.put("crimson", "bois cramoisi");
        woodMaterials.put("warped", "bois biscornu");
        woodMaterials.put("mangrove", "mangrove");
        woodMaterials.put("cherry", "cerisier");
        woodMaterials.put("bamboo", "bambou");
        woodMaterials.put("hazelnut", "noisetier");
        woodMaterials.put("hornbeam", "charme");
        woodMaterials.put("hawthorn", "aubépine");
        woodMaterials.put("quince", "cognassier");
        woodMaterials.put("plum", "prunier");
        woodMaterials.put("mango", "manguier");
        woodMaterials.put("fig", "figuier");
        woodMaterials.put("viburnum", "viorne");
        woodMaterials.put("white_mulberry", "mûrier blanc");
        woodMaterials.put("wild_cherry", "merisier");
        woodMaterials.put("bauhinia", "bauhinie");
        woodMaterials.put("pine", "pin");
        woodMaterials.put("fir", "sapin");
        woodMaterials.put("cedar", "cèdre");
        woodMaterials.put("araucaria", "araucaria");
        woodMaterials.put("juniper", "genévrier");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "pierre");
        stoneMaterials.put("tuff", "tuf");
        stoneMaterials.put("blackstone", "pierre noire");
        stoneMaterials.put("andesite", "andésite");
        stoneMaterials.put("diorite", "diorite");
        stoneMaterials.put("granite", "granit");
        stoneMaterials.put("deepslate", "ardoise profonde");
        stoneMaterials.put("basalt_side", "basalte");
        stoneMaterials.put("quartz_block_bottom", "quartz");
        stoneMaterials.put("stone_bricks", "briques de pierre");
        stoneMaterials.put("bricks", "briques");
        stoneMaterials.put("mud_bricks", "briques de boue");
        stoneMaterials.put("sandstone", "grès");
        stoneMaterials.put("dolomite_block", "dolomite");
        stoneMaterials.put("saltmarsh_block", "pierre de marais salé");
        stoneMaterials.put("loessic_marl_block", "marne lœssique");
        stoneMaterials.put("loamy_marl_block", "marne argileuse");
        stoneMaterials.put("fossil_marlstone_block", "marne fossile");
        stoneMaterials.put("limestone_block", "calcaire");

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
        colorItems.put("curtain_", "Rideau");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "%s noir");
        colors.put("brown", "%s brun");
        colors.put("gray", "%s gris");
        colors.put("light_gray", "%s gris clair");
        colors.put("white", "%s blanc");
        colors.put("red", "%s rouge");
        colors.put("orange", "%s orange");
        colors.put("yellow", "%s jaune");
        colors.put("blue", "%s bleu");
        colors.put("cyan", "%s cyan");
        colors.put("light_blue", "%s bleu clair");
        colors.put("purple", "%s violet");
        colors.put("magenta", "%s magenta");
        colors.put("pink", "%s rose");
        colors.put("green", "%s vert");
        colors.put("lime", "%s vert clair");

        for (Map.Entry<String, String> type : colorItems.entrySet())
        {
            for (Map.Entry<String, String> mat : colors.entrySet())
            {
                String key = "item." + AestheticEdges.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                add(key, value);
            }
        }

        add("item." + AestheticEdges.MOD_ID + ".curtain_remover", "Démonte-rideaux");

        add("itemgroup.aedgstab","Aesthetic Edges");
    }
}