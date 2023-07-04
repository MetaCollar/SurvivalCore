package com.minecollar.survivalcore.command;

import com.minecollar.survivalcore.SurvivalCore;
import com.minecollar.survivalcore.data.PluginSettings;
import com.minecollar.survivalcore.utils.command.legacy.SimpleCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements SimpleCommand {

    private final PluginSettings settings;

    public SpawnCommand(SurvivalCore survivalCore) {
        this.settings = survivalCore.getSettings();
    }
    @Override
    public String getIdentifier() {
        return "spawn";
    }

    @Override
    public void execute(CommandSender sender, String... args) {
        Player player = (Player) sender;
        player.teleport(settings.getSpawnpoint());
    }
}
