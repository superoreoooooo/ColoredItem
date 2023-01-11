package win.oreo.coloreditem;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import win.oreo.coloreditem.Item.ItemUtil;
import win.oreo.coloreditem.command.ColoredItemCommand;
import win.oreo.coloreditem.command.ColoredItemCompleter;
import win.oreo.hexchatcolor.HEXChatColor;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        String msg = "Colored Item Plugin Enabled!";
        Bukkit.getConsoleSender().sendMessage(HEXChatColor.format(toRainBow(msg)));
        getCommand("givec").setExecutor(new ColoredItemCommand());
        getCommand("givec").setTabCompleter(new ColoredItemCompleter());
        ItemUtil.register();
    }

    @Override
    public void onDisable() {
        String msg = "Colored Item Plugin Disabled!";
        Bukkit.getConsoleSender().sendMessage(HEXChatColor.format(toRainBow(msg)));
    }

    public static String toRainBow(String msg) {
        String[] str = new String[5];
        str[0] = "#ffb3ba";
        str[1] = "#ffdfba";
        str[2] = "#ffffba";
        str[3] = "#baffc9";
        str[4] = "#bae1ff";
        String result = "";
        int j = -1;
        msg = "[ColoredItem] " + msg;
        for (int i = 0; i < msg.length(); i++) {
            j++;
            if (j > 4) j = 0;
            result = result + str[j] + msg.charAt(i);
        }
        return result;
    }
}
