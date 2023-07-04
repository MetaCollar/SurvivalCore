package com.minecollar.survivalcore.listener;

import com.minecollar.survivalcore.SurvivalCore;
import com.minecollar.survivalcore.data.PluginSettings;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SpawnpointListener implements Listener {

    private final PluginSettings settings;

    public SpawnpointListener(SurvivalCore plugin) {
        settings = plugin.getSettings();
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.teleport(settings.getSpawnpoint());
    }
}
