package net.restartboot.crafting.utils.sender;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class Permissions {

    private static final String global_perm = "crafting.*";

    public static boolean isPlayer(CommandSender sender){
        return sender instanceof Player;
    }

    public static boolean hasPermissions(CommandSender sender,  String[] permissions) {
        for (String perm : permissions)
            if (sender.hasPermission(perm) || sender.hasPermission(global_perm)) return true;
        return false;
    }
}
