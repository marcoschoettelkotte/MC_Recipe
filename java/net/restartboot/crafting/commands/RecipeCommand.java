package net.restartboot.crafting.commands;

import net.restartboot.crafting.utils.inventory.InventoryHelper;
import net.restartboot.crafting.utils.inventory.templates.RecipeTemplates;
import net.restartboot.crafting.utils.sender.Arguments;
import net.restartboot.crafting.utils.sender.Permissions;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class RecipeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!Permissions.isPlayer(sender)) {
            sender.sendMessage("Nur Spieler können diesen Command ausführen!");
            return false;
        }
        Player player = (Player) sender;
        /* Add Recipe */
        if (Arguments.isValidArgument("add", args)) {
            InventoryHelper.openRecipeInventory(player, RecipeTemplates.startInventoryDisplay,
                    RecipeTemplates.getStartInventoryTemplate(), RecipeTemplates.getStartInventoryItems());
            return false;
        }
        sender.sendMessage("Falsche Ausführung des Commands!");
        return false;
    }
}
