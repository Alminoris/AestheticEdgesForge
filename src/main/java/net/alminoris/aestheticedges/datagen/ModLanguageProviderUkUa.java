package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderUkUa extends LanguageProvider
{
    public ModLanguageProviderUkUa(PackOutput output)
    {
        super(output, AestheticEdges.MOD_ID, "uk_ua");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> woodEdges = new LinkedHashMap<>();
        woodEdges.put("baseboard_", "Плінтус з %s");
        woodEdges.put("baseboard_inner_", "Внутрішній кут плінтусу з %s");
        woodEdges.put("baseboard_outer_", "Зовнішній кут плінтусу з %s");
        woodEdges.put("curtain_rod_", "Карниз для штор з %s");

        Map<String, String> stoneEdges = new LinkedHashMap<>();
        stoneEdges.put("curbstone_", "Бордюр з %s");
        stoneEdges.put("curbstone_inner_", "Внутрішній кут бордюру з %s");
        stoneEdges.put("curbstone_outer_", "Зовнішній кут бордюру з %s");
        stoneEdges.put("curbstone_high_", "Високий бордюр з %s");
        stoneEdges.put("curbstone_high_inner_", "Внутрішній кут високого бордюру з %s");
        stoneEdges.put("curbstone_high_outer_", "Зовнішній кут високого бордюру з %s");
        stoneEdges.put("simple_curb_", "Простий бордюр з %s");
        stoneEdges.put("simple_curb_inner_", "Внутрішній кут простого бордюру з %s");
        stoneEdges.put("simple_curb_outer_", "Зовнішній кут простого бордюру з %s");
        stoneEdges.put("curtain_rod_", "Карниз для штор з %s");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "каменю");
        stoneMaterials.put("tuff", "туфу");
        stoneMaterials.put("blackstone", "чорного каменю");
        stoneMaterials.put("andesite", "андезиту");
        stoneMaterials.put("diorite", "діориту");
        stoneMaterials.put("granite", "граніту");
        stoneMaterials.put("deepslate", "глибокої сланцю");
        stoneMaterials.put("basalt_side", "базальту");
        stoneMaterials.put("quartz_block_bottom", "кварцу");
        stoneMaterials.put("stone_bricks", "кам’яної цегли");
        stoneMaterials.put("bricks", "цегли");
        stoneMaterials.put("mud_bricks", "глиняної цегли");
        stoneMaterials.put("sandstone", "піщанику");
        stoneMaterials.put("dolomite_block", "доломіту");
        stoneMaterials.put("saltmarsh_block", "солончака");
        stoneMaterials.put("loessic_marl_block", "лессового мергеля");
        stoneMaterials.put("loamy_marl_block", "суглинкового мергеля");
        stoneMaterials.put("fossil_marlstone_block", "викопного мергеля");
        stoneMaterials.put("limestone_block", "вапняку");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "болотного кипариса");
        woodMaterials.put("thuja", "туї");
        woodMaterials.put("sequoia", "секвої");
        woodMaterials.put("mountain_hemlock", "гірської тсуги");
        woodMaterials.put("cryptomeria", "криптомерії");
        woodMaterials.put("yew", "тису");
        woodMaterials.put("larch", "модрини");
        woodMaterials.put("olive", "оливи");
        woodMaterials.put("tamarisk", "тамаріску");
        woodMaterials.put("western_serviceberry", "ірги західної");
        woodMaterials.put("trembling_aspen", "осики");
        woodMaterials.put("cottonwood", "тополі бавовникової");
        woodMaterials.put("walnut", "горіха");
        woodMaterials.put("silver_maple", "сріблястого клена");
        woodMaterials.put("staghorn_sumac", "сузу");
        woodMaterials.put("silverberry", "лохини сріблястої");
        woodMaterials.put("willow", "верби");
        woodMaterials.put("poplar", "тополі");
        woodMaterials.put("alder", "вільхи");
        woodMaterials.put("aspen", "осики");
        woodMaterials.put("azalea", "азалії");
        woodMaterials.put("apple", "яблуні");
        woodMaterials.put("scots_pine", "сосни звичайної");
        woodMaterials.put("swamp_oak", "болотного дуба");
        woodMaterials.put("aspen_nss", "осики");
        woodMaterials.put("cedar_nss", "кедра");
        woodMaterials.put("coconut_nss", "кокосової пальми");
        woodMaterials.put("cypress_nss", "кипариса");
        woodMaterials.put("fir_nss", "ялиці");
        woodMaterials.put("ghaf_nss", "гафу");
        woodMaterials.put("larch_nss", "модрини");
        woodMaterials.put("mahogany_nss", "махаґоні");
        woodMaterials.put("maple_nss", "клена");
        woodMaterials.put("olive_nss", "оливи");
        woodMaterials.put("palo_verde_nss", "пало верде");
        woodMaterials.put("redwood_nss", "секвої");
        woodMaterials.put("saxaul_nss", "саксаулу");
        woodMaterials.put("sugi_nss", "суґі");
        woodMaterials.put("willow_nss", "верби");
        woodMaterials.put("wisteria_nss", "гліцинії");
        woodMaterials.put("oak", "дуба");
        woodMaterials.put("birch", "берези");
        woodMaterials.put("spruce", "ялиці");
        woodMaterials.put("jungle", "тропічного дерева");
        woodMaterials.put("acacia", "акації");
        woodMaterials.put("dark_oak", "темного дуба");
        woodMaterials.put("crimson", "пурпурового дерева");
        woodMaterials.put("warped", "деформованого дерева");
        woodMaterials.put("mangrove", "мангрового дерева");
        woodMaterials.put("cherry", "вишні");
        woodMaterials.put("bamboo", "бамбука");
        woodMaterials.put("hazelnut", "ліщини");
        woodMaterials.put("hornbeam", "грабу");
        woodMaterials.put("hawthorn", "глоду");
        woodMaterials.put("quince", "айви");
        woodMaterials.put("plum", "сливи");
        woodMaterials.put("mango", "манго");
        woodMaterials.put("fig", "інжиру");
        woodMaterials.put("viburnum", "калини");
        woodMaterials.put("white_mulberry", "білої шовковиці");
        woodMaterials.put("wild_cherry", "черешні");
        woodMaterials.put("bauhinia", "баухінії");
        woodMaterials.put("pine", "сосни");
        woodMaterials.put("fir", "ялини");
        woodMaterials.put("cedar", "кедра");
        woodMaterials.put("araucaria", "араукарії");
        woodMaterials.put("juniper", "ялівця");

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
        colorItems.put("curtain_", "завіса");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "Чорна %s");
        colors.put("brown", "Коричнева %s");
        colors.put("gray", "Сіра %s");
        colors.put("light_gray", "Світло-сіра %s");
        colors.put("white", "біла %s");
        colors.put("red", "Червона %s");
        colors.put("orange", "Оранжева %s");
        colors.put("yellow", "Жовта %s");
        colors.put("blue", "Синя %s");
        colors.put("cyan", "Бірюзова %s");
        colors.put("light_blue", "Блакитна %s");
        colors.put("purple", "Фіолетова %s");
        colors.put("magenta", "Пурпурна %s");
        colors.put("pink", "Рожева %s");
        colors.put("green", "Зелена %s");
        colors.put("lime", "Лаймова %s");

        for (Map.Entry<String, String> type : colorItems.entrySet())
        {
            for (Map.Entry<String, String> mat : colors.entrySet())
            {
                String key = "item." + AestheticEdges.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(mat.getValue(), type.getValue());
                add(key, value);
            }
        }

        add("item." + AestheticEdges.MOD_ID + ".curtain_remover","Знімач штор");

        add("itemgroup.aedgstab","Aesthetic Edges");
    }
}