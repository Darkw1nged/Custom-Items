package me.darkwinged.CustomItems.Sets.menus;

import me.darkwinged.CustomItems.Items.SetsItems.Enchantments;
import me.darkwinged.CustomItems.Items.SetsItems.GUIItems;
import me.darkwinged.CustomItems.Main;
import me.darkwinged.CustomItems.Sets.structs.Menu;
import me.darkwinged.CustomItems.Utils.ArrayLists;
import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class FarmerChestplate implements Menu {

	private Main plugin;
	private final Player player;  
	private final Inventory inventory;
	
	String farmerGUIname = ChatColor.translateAlternateColorCodes('&', "&6&lFarmer Enchants");
	  
	  public FarmerChestplate(Player player, Main plugin) {
	    this.player = player;
	    this.inventory = Bukkit.createInventory(this, 36, this.farmerGUIname);
	    this.inventory.setItem(0, GUIItems.Background());
	    this.inventory.setItem(1, GUIItems.Background());
	    this.inventory.setItem(2, GUIItems.Background());
	    this.inventory.setItem(3, GUIItems.Background());
	    this.inventory.setItem(4, GUIItems.Background());
	    this.inventory.setItem(5, GUIItems.Background());
	    this.inventory.setItem(6, GUIItems.Background());
	    this.inventory.setItem(7, GUIItems.Background());
	    this.inventory.setItem(8, GUIItems.Background());
	    
	    this.inventory.setItem(9, GUIItems.Background());
	    this.inventory.setItem(10, GUIItems.Background());
	    this.inventory.setItem(11, GUIItems.Background());
	    this.inventory.setItem(12, GUIItems.Background());
	    this.inventory.setItem(14, GUIItems.Background());
	    this.inventory.setItem(15, GUIItems.Background());
	    this.inventory.setItem(16, GUIItems.Background());
	    this.inventory.setItem(17, GUIItems.Background());
	    
	    this.inventory.setItem(18, GUIItems.Background());
	    this.inventory.setItem(19, GUIItems.Background());
	    this.inventory.setItem(25, GUIItems.Background());
	    this.inventory.setItem(26, GUIItems.Background());
	    
	    this.inventory.setItem(27, GUIItems.Background());
	    this.inventory.setItem(28, GUIItems.Background());
	    this.inventory.setItem(29, GUIItems.Background());
	    this.inventory.setItem(30, GUIItems.Back());
	    this.inventory.setItem(31, GUIItems.Close());
	    this.inventory.setItem(32, GUIItems.Background());
	    this.inventory.setItem(33, GUIItems.Background());
	    this.inventory.setItem(34, GUIItems.Background());
	    this.inventory.setItem(35, GUIItems.Background());
	  }
	  
	  public void onClick(Player player, int slot, ClickType type, ItemStack item, Main plugin) {
	    switch (slot) {
	    case 20:
	    	if (item.equals(Enchantments.ProtectionI())) {
				ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
	    		player.closeInventory();
	    		player.openInventory(this.inventory);
	    		if (player.getInventory().getChestplate() == null) return;
	    		if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(Utils.chat("&2&lFarmer Set"))) {
	    			player.getInventory().setChestplate(ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()));
	    		}
	    	} else if (item.equals(Enchantments.ProtectionII())) {
				ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
	    		player.closeInventory();
	    		player.openInventory(this.inventory);
	    		if (player.getInventory().getChestplate() == null) return;
	    		if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(Utils.chat("&2&lFarmer Set"))) {
	    			player.getInventory().setChestplate(ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()));
	    		}
	    	} else if (item.equals(Enchantments.ProtectionIII())) {
				ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	    		player.closeInventory();
	    		player.openInventory(this.inventory);
	    		if (player.getInventory().getChestplate() == null) return;
	    		if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(Utils.chat("&2&lFarmer Set"))) {
	    			player.getInventory().setChestplate(ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()));
	    		}
	    	} else if (item.equals(Enchantments.ProtectionIV())) {
				ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
	    		player.closeInventory();
	    		player.openInventory(this.inventory);
	    		if (player.getInventory().getChestplate() == null) return;
	    		if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(Utils.chat("&2&lFarmer Set"))) {
	    			player.getInventory().setChestplate(ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()));
	    		}
	    	}
	    	break;
	    case 21:
	    	ItemMeta meta = ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).getItemMeta();
	    	meta.setUnbreakable(true);
	    	if (item.equals(Enchantments.Unbreakable())) {
				ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()).setItemMeta(meta);
	    		player.closeInventory();
	    		player.openInventory(this.inventory);
	    		if (player.getInventory().getChestplate() == null) return;
	    		if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(Utils.chat("&2&lFarmer Set"))) {
	    			player.getInventory().setChestplate(ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()));
	    		}
	    	}
	    	break;
	    case 31:
	        player.closeInventory();
	        break;
	    } 
	  }
	  
	  public void onOpen(Player player, Main plugin) {
		  this.inventory.setItem(13, ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()));
		  if (!ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()).containsEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL)) {
			  this.inventory.setItem(20, Enchantments.ProtectionI());
		  } else if (ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()).getEnchantmentLevel(Enchantment.PROTECTION_ENVIRONMENTAL) == 1) {
			  this.inventory.setItem(20, Enchantments.ProtectionII());
		  } else if (ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()).getEnchantmentLevel(Enchantment.PROTECTION_ENVIRONMENTAL) == 2) {
			  this.inventory.setItem(20, Enchantments.ProtectionIII());
		  } else if (ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()).getEnchantmentLevel(Enchantment.PROTECTION_ENVIRONMENTAL) == 3) {
			  this.inventory.setItem(20, Enchantments.ProtectionIV());
		  } else if (ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()).getEnchantmentLevel(Enchantment.PROTECTION_ENVIRONMENTAL) == 4) {
			  this.inventory.setItem(20, Enchantments.ProtectionMaxed());
		  }

		  if (ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()).getItemMeta().isUnbreakable()) {
			  this.inventory.setItem(21, Enchantments.UnbreakableMaxed());
		  } else {
			  this.inventory.setItem(21, Enchantments.Unbreakable());
		  }
	  }
	  
	  public void onClose(Player player) {}
	  
	  public Inventory getInventory() {
	    return this.inventory;
	  }

}
