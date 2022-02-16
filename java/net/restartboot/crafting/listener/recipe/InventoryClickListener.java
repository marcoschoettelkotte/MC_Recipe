package net.restartboot.crafting.listener.recipe;

import net.restartboot.crafting.utils.inventory.templates.RecipeTemplates;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Objects;

public class InventoryClickListener implements Listener {

    private boolean isCorrectItem(ItemMeta meta, String display, String[] lore) {
        return meta.getDisplayName().equals(display) && Objects.equals(meta.getLore(), Arrays.asList(lore));
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player)) return;
        if (event.getClickedInventory() == null) return;
        Player player = (Player) event.getWhoClicked();
        Inventory inv = event.getClickedInventory();
        for (String display : RecipeTemplates.inventoryDisplayList) {
            if (event.getView().getTitle().equals(display) && event.getCurrentItem() != null) {
                event.setCancelled(true);
                try {
                    ItemMeta meta = Objects.requireNonNull(event.getCurrentItem().getItemMeta());
                    if (isCorrectItem(meta, "§aRezept hinzufügen", new String[]{"§7Füge ein Rezept hinzu."})) {
                        Bukkit.broadcastMessage("add");
                    } else if (isCorrectItem(meta, "§cRezept entfernen", new String[]{"§7Entferne ein erstelltes Rezept"})) {
                        Bukkit.broadcastMessage("remove");
                    } else if (isCorrectItem(meta, "§6Rezeptübersicht", new String[]{"§7Übersicht der erstellten Rezepte"})) {
                        Bukkit.broadcastMessage("list");
                    }
                } catch (NullPointerException ex) {
                    return;
                }


            }
        }
    }
}
