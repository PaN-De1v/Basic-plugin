package basicplugin.basicplugin;

import jdk.internal.org.jline.reader.impl.KillRing;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class BasicPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Basic plugin is ON!");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        System.out.println("Basic plugin is OFF!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage("Welcome " + player.getName() + ", to the retarded server");
        event.setJoinMessage("");
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.setHealth(20);
        player.setPlayerListName(player.getName());
        player.sendMessage(player.getDisplayName());
    }
    @EventHandler
    public void onEnterBed(PlayerBedEnterEvent event){
        Player player = event.getPlayer();
        player.setPlayerListName("[Sleeping] " + player.getName());
        player.sendMessage(player.getDisplayName());
    }
}
