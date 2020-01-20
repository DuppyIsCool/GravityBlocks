package me.Duppy.GravityBlocks;
/**
* @author DuppyIsCool
* Version: 1.0
*/
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		// TODO Auto-generated method stub
		if(arg1.getName().equalsIgnoreCase("togglegravity")) {
			
			if(!Events.isCommandEnabled) {
				arg0.sendMessage(ChatColor.GREEN + "Gravity Enabled");
				Events.isCommandEnabled = true;
				return true;
			}
			else {
				arg0.sendMessage(ChatColor.GREEN + "Gravity Disabled");
				Events.isCommandEnabled = false;
				return true;
			}
		}
		return false;
	}
	
	

}
