package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderRuRu extends LanguageProvider
{
    public ModLanguageProviderRuRu(PackOutput output)
    {
        super(output, AestheticEdges.MOD_ID, "ru_ru");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> woodEdges = new LinkedHashMap<>();
        woodEdges.put("baseboard_", "Плинтус из %s");
        woodEdges.put("baseboard_inner_", "Внутренний угол плинтуса из %s");
        woodEdges.put("baseboard_outer_", "Внешний угол плинтуса из %s");
        woodEdges.put("curtain_rod_", "Карниз для штор из %s");

        Map<String, String> stoneEdges = new LinkedHashMap<>();
        stoneEdges.put("curbstone_", "Бордюр из %s");
        stoneEdges.put("curbstone_inner_", "Внутренний угол бордюра из %s");
        stoneEdges.put("curbstone_outer_", "Внешний угол бордюра из %s");
        stoneEdges.put("curbstone_high_", "Высокий бордюр из %s");
        stoneEdges.put("curbstone_high_inner_", "Внутренний угол высокого бордюра из %s");
        stoneEdges.put("curbstone_high_outer_", "Внешний угол высокого бордюра из %s");
        stoneEdges.put("simple_curb_", "Простой бордюр из %s");
        stoneEdges.put("simple_curb_inner_", "Внутренний угол простого бордюра из %s");
        stoneEdges.put("simple_curb_outer_", "Внешний угол простого бордюра из %s");
        stoneEdges.put("curtain_rod_", "Карниз для штор из %s");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "болотного кипариса");
        woodMaterials.put("thuja", "туи");
        woodMaterials.put("sequoia", "секвойи");
        woodMaterials.put("mountain_hemlock", "горной тсуги");
        woodMaterials.put("cryptomeria", "криптомерии");
        woodMaterials.put("yew", "тиса");
        woodMaterials.put("larch", "лиственницы");
        woodMaterials.put("olive", "оливы");
        woodMaterials.put("tamarisk", "тамариска");
        woodMaterials.put("western_serviceberry", "ирги западной");
        woodMaterials.put("trembling_aspen", "осины дрожащей");
        woodMaterials.put("cottonwood", "тополя хлопкового");
        woodMaterials.put("walnut", "грецкого ореха");
        woodMaterials.put("silver_maple", "серебристого клёна");
        woodMaterials.put("staghorn_sumac", "сумаха");
        woodMaterials.put("silverberry", "лохины серебристой");
        woodMaterials.put("willow", "ивы");
        woodMaterials.put("poplar", "тополя");
        woodMaterials.put("alder", "ольхи");
        woodMaterials.put("aspen", "осины");
        woodMaterials.put("azalea", "азалии");
        woodMaterials.put("apple", "яблони");
        woodMaterials.put("scots_pine", "сосны обыкновенной");
        woodMaterials.put("swamp_oak", "болотного дуба");
        woodMaterials.put("aspen_nss", "осины");
        woodMaterials.put("cedar_nss", "кедра");
        woodMaterials.put("coconut_nss", "кокосовой пальмы");
        woodMaterials.put("cypress_nss", "кипариса");
        woodMaterials.put("fir_nss", "пихты");
        woodMaterials.put("ghaf_nss", "гафа");
        woodMaterials.put("larch_nss", "лиственницы");
        woodMaterials.put("mahogany_nss", "махогони");
        woodMaterials.put("maple_nss", "клёна");
        woodMaterials.put("olive_nss", "оливы");
        woodMaterials.put("palo_verde_nss", "пало-верде");
        woodMaterials.put("redwood_nss", "секвойи");
        woodMaterials.put("saxaul_nss", "саксаула");
        woodMaterials.put("sugi_nss", "суги");
        woodMaterials.put("willow_nss", "ивы");
        woodMaterials.put("wisteria_nss", "глицинии");
        woodMaterials.put("oak", "дуба");
        woodMaterials.put("birch", "берёзы");
        woodMaterials.put("spruce", "ели");
        woodMaterials.put("jungle", "тропического дерева");
        woodMaterials.put("acacia", "акации");
        woodMaterials.put("dark_oak", "тёмного дуба");
        woodMaterials.put("crimson", "багрового дерева");
        woodMaterials.put("warped", "искривлённого дерева");
        woodMaterials.put("mangrove", "мангрового дерева");
        woodMaterials.put("cherry", "вишни");
        woodMaterials.put("bamboo", "бамбука");
        woodMaterials.put("hazelnut", "лесного ореха");
        woodMaterials.put("hornbeam", "граба");
        woodMaterials.put("hawthorn", "боярышника");
        woodMaterials.put("quince", "айвы");
        woodMaterials.put("plum", "сливы");
        woodMaterials.put("mango", "манго");
        woodMaterials.put("fig", "инжира");
        woodMaterials.put("viburnum", "калины");
        woodMaterials.put("white_mulberry", "белой шелковицы");
        woodMaterials.put("wild_cherry", "черешни");
        woodMaterials.put("bauhinia", "баухинии");
        woodMaterials.put("pine", "сосны");
        woodMaterials.put("fir", "пихты");
        woodMaterials.put("cedar", "кедра");
        woodMaterials.put("araucaria", "араукарии");
        woodMaterials.put("juniper", "можжевельника");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "камня");
        stoneMaterials.put("tuff", "туфа");
        stoneMaterials.put("blackstone", "чёрного камня");
        stoneMaterials.put("andesite", "андезита");
        stoneMaterials.put("diorite", "диорита");
        stoneMaterials.put("granite", "гранита");
        stoneMaterials.put("deepslate", "глубинного сланца");
        stoneMaterials.put("basalt_side", "базальта");
        stoneMaterials.put("quartz_block_bottom", "кварца");
        stoneMaterials.put("stone_bricks", "каменного кирпича");
        stoneMaterials.put("bricks", "кирпича");
        stoneMaterials.put("mud_bricks", "глиняного кирпича");
        stoneMaterials.put("sandstone", "песчаника");
        stoneMaterials.put("dolomite_block", "доломита");
        stoneMaterials.put("saltmarsh_block", "солончака");
        stoneMaterials.put("loessic_marl_block", "лёссового мергеля");
        stoneMaterials.put("loamy_marl_block", "суглинистого мергеля");
        stoneMaterials.put("fossil_marlstone_block", "ископаемого мергеля");
        stoneMaterials.put("limestone_block", "известняка");

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
        colorItems.put("curtain_", "занавеска");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "Чёрная %s");
        colors.put("brown", "Коричневая %s");
        colors.put("gray", "Серая %s");
        colors.put("light_gray", "Светло-серая %s");
        colors.put("white", "Белая %s");
        colors.put("red", "Красная %s");
        colors.put("orange", "Оранжевая %s");
        colors.put("yellow", "Жёлтая %s");
        colors.put("blue", "Синяя %s");
        colors.put("cyan", "Бирюзовая %s");
        colors.put("light_blue", "Голубая %s");
        colors.put("purple", "Фиолетовая %s");
        colors.put("magenta", "Пурпурная %s");
        colors.put("pink", "Розовая %s");
        colors.put("green", "Зелёная %s");
        colors.put("lime", "Лаймовая %s");

        for (Map.Entry<String, String> type : colorItems.entrySet())
        {
            for (Map.Entry<String, String> mat : colors.entrySet())
            {
                String key = "item." + AestheticEdges.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(mat.getValue(), type.getValue());
                add(key, value);
            }
        }

        add("item." + AestheticEdges.MOD_ID + ".curtain_remover", "Съёмник штор");

        add("itemgroup.aedgstab","Aesthetic Edges");
    }
}