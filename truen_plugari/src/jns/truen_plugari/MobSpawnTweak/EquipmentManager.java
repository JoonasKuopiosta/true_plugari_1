package jns.truen_plugari.MobSpawnTweak;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creature;
import org.bukkit.inventory.ItemStack;

public class EquipmentManager {
	
	public EquipmentManager() {
		// TODO Auto-generated constructor stub
	}
	
	static class ZombieEquipment {
		
		public ZombieEquipment() {

		}
		
		public void suitUpZombie(Creature creature) {
			creature.getEquipment().setItemInMainHand(getZombieSword());
			creature.getEquipment().setItemInMainHandDropChance(0.0f);
			
			creature.getEquipment().setArmorContents(getZombieArmor());
			creature.getEquipment().setBootsDropChance(0.0f);
			creature.getEquipment().setLeggingsDropChance(0.0f);
			creature.getEquipment().setChestplateDropChance(0.0f);
			creature.getEquipment().setHelmetDropChance(0.0f);
		}
		
		private ItemStack getZombieSword() {
			ItemStack zSword = new ItemStack(Material.IRON_SWORD);
			zSword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
			return zSword;
		}
		
		private ItemStack[] getZombieArmor() {
			ItemStack[] armor = new ItemStack[4];
			
			ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
			ItemStack pants = new ItemStack(Material.LEATHER_LEGGINGS);
			ItemStack shirt = new ItemStack(Material.LEATHER_CHESTPLATE);
			ItemStack helm = new ItemStack(Material.LEATHER_HELMET);
			armor[0] = boots;
			armor[1] = pants;
			armor[2] = shirt;
			armor[3] = helm;
			
			return armor;
		}
	}
	
	static class SkeletonEquipment {
		
		public SkeletonEquipment() {
			// TODO Auto-generated constructor stub
		}
		
		public void suitUpSkeleton(Creature creature) {
			creature.getEquipment().setItemInMainHand(getSkeleBow());
			creature.getEquipment().setItemInMainHandDropChance(0.0f);
		}
		
		private ItemStack getSkeleBow() {
			ItemStack sBow = new ItemStack(Material.BOW);
			sBow.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
			return sBow;
		}
	}
}
