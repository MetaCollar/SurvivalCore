package com.minecollar.survivalcore.command;

import com.minecollar.survivalcore.SurvivalCore;
import com.minecollar.survivalcore.utils.command.legacy.SimpleCommand;
import com.minecollar.survivalcore.utils.storage.YMLBase;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OverrideCommand implements SimpleCommand {

    private final SurvivalCore plugin;
    private final String identifier;
    private final String toExecute;

    public OverrideCommand(SurvivalCore plugin, String identifier, String toExecute) {
        this.plugin = plugin;
        this.identifier = identifier;
        this.toExecute = toExecute;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void execute(CommandSender sender, String... args) {
        Player player = (Player) sender;

        if (toExecute.startsWith("console:")) {
            plugin.getServer().getConsoleSender().sendMessage(toExecute.substring(8));
            return;
        }

        player.performCommand(toExecute);


    }
}
