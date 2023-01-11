package win.oreo.coloreditem.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import win.oreo.coloreditem.Item.ColoredItem;
import win.oreo.coloreditem.Item.ItemUtil;

import java.util.ArrayList;
import java.util.List;

public class ColoredItemCompleter implements TabCompleter {
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        List<String> completions = new ArrayList<>();
        if (args.length == 1) {
            Bukkit.getOnlinePlayers().forEach(player -> completions.add(player.getName()));
            return completions;
        }
        else if (args.length == 2) {
            for (ColoredItem item : ItemUtil.coloredItemSet) {
                completions.add(item.getMaterial().toString());
            }
        }
        return completions;
    }
}
