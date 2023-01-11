package win.oreo.coloreditem.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import win.oreo.coloreditem.Item.ColoredItem;
import win.oreo.coloreditem.Item.ItemUtil;
import win.oreo.coloreditem.Main;
import win.oreo.hexchatcolor.HEXChatColor;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ColoredItemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            if (args.length >= 2) {
                if (Bukkit.getPlayer(args[0]) != null) {
                    switch (args.length) {
                        case 2 -> {
                            Player player1 = Bukkit.getPlayer(args[0]);
                            for (ColoredItem coloredItem : ItemUtil.coloredItemSet) {
                                if (coloredItem.getMaterial().toString().equals(args[1])) {
                                    ItemStack item = new ItemStack(coloredItem.getMaterial(), 1);
                                    ItemMeta meta = item.getItemMeta();
                                    meta.setDisplayName(HEXChatColor.format(coloredItem.getHexCode() + coloredItem.getName()));
                                    item.setItemMeta(meta);
                                    player1.getInventory().addItem(item);
                                    return true;
                                }
                            }
                        }
                        case 3 -> {
                            Player player1 = Bukkit.getPlayer(args[0]);
                            for (ColoredItem coloredItem : ItemUtil.coloredItemSet) {
                                if (coloredItem.getMaterial().toString().equals(args[1])) {
                                    ItemStack item = new ItemStack(coloredItem.getMaterial(), Integer.parseInt(args[2]));
                                    ItemMeta meta = item.getItemMeta();
                                    meta.setDisplayName(HEXChatColor.format(coloredItem.getHexCode() + coloredItem.getName()));
                                    item.setItemMeta(meta);
                                    player1.getInventory().addItem(item);
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else {
                player.sendMessage(HEXChatColor.format(Main.toRainBow("/givec [playerName] [itemName] [amount]")));
            }
        } else {
            Bukkit.getConsoleSender().sendMessage(HEXChatColor.format(Main.toRainBow("no console!")));
        }
        return false;
    }
}
