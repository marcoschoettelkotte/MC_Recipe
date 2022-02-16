package net.restartboot.crafting.main;

import net.restartboot.crafting.commands.RecipeCommand;
import net.restartboot.crafting.listener.recipe.InventoryClickListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class MainClass extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new InventoryClickListener(), this);
        Objects.requireNonNull(getCommand("recipe")).setExecutor(new RecipeCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
