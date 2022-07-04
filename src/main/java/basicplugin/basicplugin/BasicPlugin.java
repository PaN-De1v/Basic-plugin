package basicplugin.basicplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class BasicPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Basic plugin is ON!");

    }

    @Override
    public void onDisable() {
        System.out.println("Basic plugin is OFF!");
    }
}
