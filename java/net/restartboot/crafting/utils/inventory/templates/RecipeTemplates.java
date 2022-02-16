package net.restartboot.crafting.utils.inventory.templates;

import net.restartboot.crafting.utils.items.ItemStacks;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class RecipeTemplates {

    public static final String startInventoryDisplay = "§6Recipe";

    public static final String[] inventoryDisplayList = new String[]{startInventoryDisplay};

    public static int[][] getStartInventoryTemplate() {
        return new int[][]{
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 0, 1, 0, 2, 0, 3, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
    }

    public static HashMap<Integer, ItemStack> getStartInventoryItems() {
        return new HashMap<Integer, ItemStack>() {{
            put(0, ItemStacks.createItem(Material.GRAY_STAINED_GLASS_PANE, 1, "§4", new String[]{""}));
            put(1, ItemStacks.createItem(Material.LIME_WOOL, 1, "§aRezept hinzufügen", new String[]{"§7Füge ein Rezept hinzu."}));
            put(2, ItemStacks.createItem(Material.RED_WOOL, 1, "§cRezept entfernen", new String[]{"§7Entferne ein erstelltes Rezept"}));
            put(3, ItemStacks.createItem(Material.BOOK, 1, "§6Rezeptübersicht", new String[]{"§7Übersicht der erstellten Rezepte"}));
        }};
    }
}
