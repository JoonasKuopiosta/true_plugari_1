package jns.truen_plugari;

import java.util.List;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class SunIsDeadlyLaser {
	
	World world;

	public SunIsDeadlyLaser(World currentWorld) {
		world = currentWorld;
	}
	
	public List<Player> updateCall() {
		List<Player> playerList = world.getPlayers();
		for (Player player : playerList) {
			if (ifPlayerIsExposed(player)) {
				hurtPlayer(player);
			}
		}
		return playerList;
	}
	
	private boolean ifPlayerIsExposed(Player player) {
		Location loc = player.getLocation();
		Block blockAtFeet = world.getBlockAt(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
		if (blockAtFeet instanceof Block) {
			if (((int) blockAtFeet.getLightFromSky()) > 9) {
				return true;
			}
		}
		return false;
	}
	
	private void hurtPlayer(Player player) {
		float damageAmount = 3.0f;
		player.damage(damageAmount);
	}
}
