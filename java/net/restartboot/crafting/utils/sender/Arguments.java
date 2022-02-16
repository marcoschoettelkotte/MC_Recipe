package net.restartboot.crafting.utils.sender;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Arguments {
    public static boolean isValidArgument(String requiredArg, String[] args) {
        for (String arg: args){
            if(arg.equalsIgnoreCase(requiredArg)) return true;
        }
        return false;
    }
}
