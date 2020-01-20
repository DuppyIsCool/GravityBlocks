package me.Duppy.GravityBlocks;
/**
* @author DuppyIsCool
* Version: 1.0
*/
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Events implements Listener {
	
	public static boolean isCommandEnabled = false;
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		//Checks if the command is enabled
		if(isCommandEnabled)
			//Get sphere of locations with radius of 10 and not hollow
			for(Location l : Sphere.generateSphere(e.getPlayer().getLocation(), 10, false)) {
				//Do not spawn falling blocks if the block falling is water,lava,or air
				if(!l.getBlock().getType().equals(Material.AIR) && !l.getBlock().getType().equals(Material.WATER)&& !l.getBlock().getType().equals(Material.LAVA)) {
					
					//Delete the block and spawn a falling block of the original material
					Material mat = l.getBlock().getType();
					l.getBlock().setType(Material.AIR);
					l.getWorld().spawnFallingBlock(new Location(l.getWorld(), l.getX() + 0.5, l.getY(), l.getZ() + 0.5), mat, l.getBlock().getData());
				}
			}
	}
	
	
}
