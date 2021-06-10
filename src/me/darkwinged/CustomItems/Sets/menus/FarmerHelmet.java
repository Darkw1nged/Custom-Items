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

public class FarmerHelmet implements Menu {

	private Main plugin;
	private final Player player;  
	private final Inventory inventory;
	
	String farmerGUIname = ChatColor.translateAlternateColorCodes('&', "&6&lFarmer Enchants");
	  
	  public FarmerHelmet(Player player, Main plugin) {
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
	    		// Changing the lore // adding the enchantment
	    		ArrayList<String> lore = new ArrayList<>();
		    	ItemMeta meta = ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).getItemMeta();
		    	if (meta.getLore() != null) { lore.addAll(meta.getLore()); }
		    	if (meta.getLore() == null || !meta.getLore().contains(Utils.chat("&9Protection I"))) { lore.add(Utils.chat("&9Protection I")); }
		    	meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		    	meta.setLore(lore);
		    	
		    	// checking if player has enough money and then removing it
	    		if (!plugin.getEconomy().has(player, 1000)) return;
	    		plugin.getEconomy().withdrawPlayer(player, 1000);
	    		
	    		// finishing things up
	    		ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).setItemMeta(meta);
	    		player.closeInventory();
	    		player.openInventory(this.inventory);
	    		if (player.getInventory().getHelmet() == null) return;
	    		if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(Utils.chat("&2&lFarmer Set"))) {
	    			player.getInventory().setHelmet(ArrayLists.player_Farming_Helmet.get(player.getUniqueId()));
	    		}
	    	} else if (item.equals(Enchantments.ProtectionII())) {
	    		// Changing the lore // adding the enchantment
	    		ItemMeta meta = ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).getItemMeta();
	    		ArrayList<String> lore = new ArrayList<>();
	    		if (meta.getLore() != null) { lore.addAll(meta.getLore()); }
	    		if (meta.getLore().get(0).equals(Utils.chat("&9Protection I"))) { lore.remove(0); lore.add(Utils.chat("&9Protection II")); } else
	    			if (meta.getLore().get(1).equals(Utils.chat("&9Protection I"))) { lore.remove(0); lore.add(Utils.chat("&9Protection II")); }
				meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
	    		meta.setLore(lore);
		    	
	    		// checking if player has enough money and then removing it
	    		if (!plugin.getEconomy().has(player, 2500)) return;
	    		plugin.getEconomy().withdrawPlayer(player, 2500);
	    		
	    		// finishing things up
				ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).setItemMeta(meta);
	    		player.closeInventory();
	    		player.openInventory(this.inventory);
	    		if (player.getInventory().getHelmet() == null) return;
	    		if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(Utils.chat("&2&lFarmer Set"))) {
	    			player.getInventory().setHelmet(ArrayLists.player_Farming_Helmet.get(player.getUniqueId()));
	    		}
	    	} else if (item.equals(Enchantments.ProtectionIII())) {
	    		// Changing the lore // adding the enchantment
	    		ItemMeta meta = ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).getItemMeta();
	    		ArrayList<String> lore = new ArrayList<>();
	    		if (meta.getLore() != null) { lore.addAll(meta.getLore()); }
	    		if (meta.getLore().get(0).equals(Utils.chat("&9Protection II"))) { lore.remove(0); lore.add(Utils.chat("&9Protection III")); } else
	    			if (meta.getLore().get(1).equals(Utils.chat("&9Protection II"))) { lore.remove(0); lore.add(Utils.chat("&9Protection III")); }
				meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
	    		meta.setLore(lore);
		    	
	    		// checking if player has enough money and then removing it
	    		if (!plugin.getEconomy().has(player, 5000)) return;
	    		plugin.getEconomy().withdrawPlayer(player, 5000);
	    		
	    		// finishing things up
				ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).setItemMeta(meta);
	    		player.closeInventory();
	    		player.openInventory(this.inventory);
	    		if (player.getInventory().getHelmet() == null) return;
	    		if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(Utils.chat("&2&lFarmer Set"))) {
	    			player.getInventory().setHelmet(ArrayLists.player_Farming_Helmet.get(player.getUniqueId()));
	    		}
	    	} else if (item.equals(Enchantments.ProtectionIV())) {
	    		// Changing the lore // adding the enchantment
	    		ItemMeta meta = ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).getItemMeta();
	    		ArrayList<String> lore = new ArrayList<>();
	    		if (meta.getLore() != null) { lore.addAll(meta.getLore()); }
	    		if (meta.getLore().get(0).equals(Utils.chat("&9Protection III"))) { lore.remove(0); lore.add(Utils.chat("&9Protection IV")); } else
	    			if (meta.getLore().get(1).equals(Utils.chat("&9Protection III"))) { lore.remove(0); lore.add(Utils.chat("&9Protection IV")); }
				meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
	    		meta.setLore(lore);
		    	
	    		// checking if player has enough money and then removing it
	    		if (!plugin.getEconomy().has(player, 10000)) return;
	    		plugin.getEconomy().withdrawPlayer(player, 10000);
	    		
	    		// finishing things up
				ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).setItemMeta(meta);
	    		player.closeInventory();
	    		player.openInventory(this.inventory);
	    		if (player.getInventory().getHelmet() == null) return;
	    		if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(Utils.chat("&2&lFarmer Set"))) {
	    			player.getInventory().setHelmet(ArrayLists.player_Farming_Helmet.get(player.getUniqueId()));
	    		}
	    	}
	    	break;
	    case 21:
	    	ArrayList<String> lore = new ArrayList<>();
	    	lore.add(Utils.chat("&9Unbreakable"));
	    	ItemMeta meta = ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).getItemMeta();
	    	meta.setUnbreakable(true);
	    	if (meta.getLore() == null) {} else {lore.addAll(meta.getLore());}
	    	if (!meta.getEnchants().containsKey(Enchantment.LUCK)) meta.addEnchant(Enchantment.LUCK, 1, false);
	    	meta.setLore(lore);
	    	
	    	if (item.equals(Enchantments.Unbreakable())) {
	    		if (!plugin.getEconomy().has(player, 50000)) return;
	    		plugin.getEconomy().withdrawPlayer(player, 50000);
				ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).setItemMeta(meta);
	    		player.closeInventory();
	    		player.openInventory(this.inventory);
	    		if (player.getInventory().getHelmet() == null) return;
	    		if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(Utils.chat("&2&lFarmer Set"))) {
	    			player.getInventory().setHelmet(ArrayLists.player_Farming_Helmet.get(player.getUniqueId()));
	    		}
	    	}
	    	break;
	    case 31:
	        player.closeInventory();
	        break;
	    } 
	  }
	  
	  public void onOpen(Player player, Main plugin) {
		  ItemMeta meta = ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).getItemMeta();
		  this.inventory.setItem(13, ArrayLists.player_Farming_Helmet.get(player.getUniqueId()));

		  // Checking if the item has protection in the lore
		  if (meta.getLore() == null) {
			  this.inventory.setItem(20, Enchantments.ProtectionI());
		  } else if (meta.getLore().contains(Utils.chat("&9Protection I"))) {
			  this.inventory.setItem(20, Enchantments.ProtectionII());
		  } else if (meta.getLore().contains(Utils.chat("&9Protection II"))) {
			  this.inventory.setItem(20, Enchantments.ProtectionIII());
		  } else if (meta.getLore().contains(Utils.chat("&9Protection III"))) {
			  this.inventory.setItem(20, Enchantments.ProtectionIV());
		  } else if (meta.getLore().contains(Utils.chat("&9Protection IV"))) {
			  this.inventory.setItem(20, Enchantments.ProtectionMaxed());
		  } else {
			  this.inventory.setItem(20, Enchantments.ProtectionI());
		  }

		  if (ArrayLists.player_Farming_Helmet.get(player.getUniqueId()).getItemMeta().isUnbreakable()) {
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
