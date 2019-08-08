package jns.truen_plugari.MobSpawnTweak;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public class ChangeSpawningMob {
	
	// public class CreatureSpawnEvent
	private double generalMovSpeedMult;
	private double generalArmorMult;
	
	public ChangeSpawningMob() {
		generalMovSpeedMult = 1.2;
		generalArmorMult = 1.5;
		// TODO Auto-generated constructor stub
	}
	
	public void tweakMonster(Creature creature) {
		// To be called for each desired creature spawned
		// Expects hostile mobs as input
		
		if (creature.getType() == EntityType.ZOMBIE) {
			tweakZombie(creature);
		}
	}
	
	private void tweakZombie(Creature creature) {
		double baseMovSpeed = creature.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getBaseValue();
	}
}
