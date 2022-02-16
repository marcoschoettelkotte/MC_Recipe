package net.restartboot.crafting.utils.inventory;

import net.restartboot.crafting.utils.inventory.templates.RecipeTemplates;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class InventoryHelper {
    public static void openRecipeInventory(Player player, String display, int[][] template, HashMap<Integer, ItemStack> itemMap) {
        int invSize = template.length * template[0].length;
        Inventory inv = Bukkit.createInventory(null, invSize, display);
        int index = 0;
        for (int[] i : template) {
            for (int e : i) {
                inv.setItem(index, itemMap.get(e));
                ++index;
            }
        }
        player.openInventory(inv);
    }
}
