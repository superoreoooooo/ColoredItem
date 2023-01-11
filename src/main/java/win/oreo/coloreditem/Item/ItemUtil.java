package win.oreo.coloreditem.Item;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import win.oreo.coloreditem.Main;
import win.oreo.hexchatcolor.HEXChatColor;

import java.util.HashSet;
import java.util.Set;

public class ItemUtil {
    public static Set<ColoredItem> coloredItemSet = new HashSet<>();

    public static void register() {
        coloredItemSet.add(new ColoredItem(Material.DEBUG_STICK, "마법 지팡이", "#800080"));
        coloredItemSet.add(new ColoredItem(Material.WOODEN_PICKAXE, "마법 곡괭이", "#800080"));
        coloredItemSet.add(new ColoredItem(Material.CARVED_PUMPKIN, "잠수부 헬멧", "#F1C232"));
        coloredItemSet.add(new ColoredItem(Material.ENCHANTED_BOOK, "마법 교과서", "#800080"));
        coloredItemSet.add(new ColoredItem(Material.KNOWLEDGE_BOOK, "교과서", "#800080"));
        coloredItemSet.add(new ColoredItem(Material.DEBUG_STICK, "플레이어 머리", "#800080"));

        coloredItemSet.add(new ColoredItem(Material.CYAN_WOOL, "청록색 양털", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_CARPET, "청록색 양탄자", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_TERRACOTTA, "청록색 테라코타", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_CONCRETE, "청록색 콘크리트", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_CONCRETE_POWDER, "청록색 콘크리트 가루", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_GLAZED_TERRACOTTA, "청록색 유광 테라코타", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_STAINED_GLASS, "청록색 색유리", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_STAINED_GLASS_PANE, "청록색 색유리 판", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_SHULKER_BOX, "청록색 셜커 상자", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_BED, "청록색 침대", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_CANDLE, "청록색 초", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_BANNER, "청록색 현수막", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.CYAN_DYE, "청록색 염료", "#0054A6"));

        coloredItemSet.add(new ColoredItem(Material.BLUE_WOOL, "파란색 양털", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_CARPET, "파란색 양탄자", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_TERRACOTTA, "파란색 테라코타", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_CONCRETE, "파란색 콘크리트", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_CONCRETE_POWDER, "파란색 콘크리트 가루", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_GLAZED_TERRACOTTA, "파란색 유광 테라코타", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_STAINED_GLASS, "파란색 색유리", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_STAINED_GLASS_PANE, "파란색 색유리 판", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_SHULKER_BOX, "파란색 셜커 상자", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_BED, "파란색 침대", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_CANDLE, "파란색 초", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_BANNER, "파란색 현수막", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_ORCHID, "파란색 난초", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.BLUE_DYE, "파란색 염료", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LAPIS_BLOCK, "청금석 블록", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LAPIS_ORE, "청금석 광석", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.DEEPSLATE_LAPIS_ORE, "심층암 청금석 광석", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LAPIS_LAZULI, "청금석", "#0054A6"));

        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_WOOL, "하늘색 양털", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_CARPET, "하늘색 양탄자", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_TERRACOTTA, "하늘색 테라코타", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_CONCRETE, "하늘색 콘크리트", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_CONCRETE_POWDER, "하늘색 콘크리트 가루", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_GLAZED_TERRACOTTA, "하늘색 유광 테라코타", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_STAINED_GLASS, "하늘색 색유리", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_STAINED_GLASS_PANE, "하늘색 색유리 판", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_SHULKER_BOX, "하늘색 셜커 상자", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_BED, "하늘색 침대", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_CANDLE, "하늘색 초", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_BANNER, "하늘색 현수막", "#0054A6"));
        coloredItemSet.add(new ColoredItem(Material.LIGHT_BLUE_DYE, "하늘색 염료", "#0054A6"));

        Bukkit.getConsoleSender().sendMessage(HEXChatColor.format(Main.toRainBow("아이템 " + coloredItemSet.size() + "개 등록 완료.")));
    }
}
