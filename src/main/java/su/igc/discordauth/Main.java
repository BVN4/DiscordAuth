package su.igc.discordauth;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        try {
            initConfig();
//            loadDiscordBot();
//            loadAccounts();
            Bukkit.getPluginManager().registerEvents(new ServerEvents(), this);
        } catch (Exception e) {
            e.printStackTrace();
            Bukkit.getPluginManager().disablePlugin(this);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void initConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
        Config.init(getConfig());
    }
}
