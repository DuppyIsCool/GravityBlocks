package me.Duppy.GravityBlocks;
/**
* @author DuppyIsCool
* Version: 1.0
*/
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new Events(), this);
		this.getCommand("togglegravity").setExecutor(new Commands());
		getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "Enabled Gravity Blocks");
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "Disabled Gravity Blocks");
	}

}
