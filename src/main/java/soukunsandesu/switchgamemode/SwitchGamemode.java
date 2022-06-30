package soukunsandesu.switchgamemode;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SwitchGamemode extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        super.onEnable();
        Bukkit.getPluginManager().registerEvents(new ChangeGamemode(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }
}
