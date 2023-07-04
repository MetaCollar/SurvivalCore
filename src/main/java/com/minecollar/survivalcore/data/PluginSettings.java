package com.minecollar.survivalcore.data;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;

@Getter
public class PluginSettings {

    private final Location spawnpoint;

    public PluginSettings(FileConfiguration config) {
        spawnpoint = getLocation(config.getConfigurationSection("spawnpoint"));
    }


    public Location getLocation(ConfigurationSection section) {
        String world = section.getString("world");
        Location location = new Location(Bukkit.getWorld(world),
                section.getDouble("x"),
                section.getDouble("y"),
                section.getDouble("z"));

        if (section.contains("yaw")) {
            location.setYaw((float) section.getDouble("yaw"));
        }

        if (section.contains("pitch")) {
            location.setPitch((float) section.getDouble("pitch"));
        }

        return location;
    }
}
