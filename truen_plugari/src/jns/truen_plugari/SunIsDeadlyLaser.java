package jns.truen_plugari;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class SunIsDeadlyLaser {
	
	World world;

	public SunIsDeadlyLaser(World currentWorld) {
		world = currentWorld;
	}
	
	public List<Player> update() {
		List<Player> playerList = (List<Player>) Bukkit.getServer().getOnlinePlayers();
		for (Player player : playerList) {
			if (ifPlayerIsExposed(player)) {
				hurtPlayer(player);
			}
		}
		return playerList;
	}
	
	private boolean ifPlayerIsExposed(Player player) {
		Block blockBelowPlayer = getBlockBelowPlayer(player);
		if (((int) blockBelowPlayer.getLightFromSky()) > 0) {
			return true;
		}
		return false;
	}
	
	private Block getBlockBelowPlayer(Player player) {
		int checkLimit = 5;
		Location loc;
		Block blockBelowPlayer;
		for (int i = 0; i < checkLimit; i++) {
			loc = player.getLocation();
			blockBelowPlayer = world.getBlockAt(loc.getBlockX(), (loc.getBlockY() - i), loc.getBlockZ());
			if (blockBelowPlayer instanceof Block) {
				return blockBelowPlayer;
			}
		}
		return null;
	}
	
	private void hurtPlayer(Player player) {
		float damageAmount = 3.0f;
		player.damage(damageAmount);
	}
}
