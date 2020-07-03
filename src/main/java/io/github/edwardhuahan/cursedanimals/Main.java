package io.github.edwardhuahan.cursedanimals;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private Main plugin;

    @Override
    public void onEnable() {
        plugin = this;

        this.getServer().getPluginManager().registerEvents(new CreatureSpawnListener(), this);
        getLogger().info("Cursed Animals is loaded");
        super.onEnable();
    }

    @Override
    public void onDisable() {
        getLogger().info("Cursed Animals is disabled");
        super.onDisable();
    }
}
