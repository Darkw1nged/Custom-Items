package me.darkwinged.CustomItems.Sets.menus;

import me.darkwinged.CustomItems.Items.SetsItems.DiamondItems;
import me.darkwinged.CustomItems.Items.SetsItems.FarmerItems;
import me.darkwinged.CustomItems.Items.SetsItems.GUIItems;
import me.darkwinged.CustomItems.Items.SetsItems.MinerItems;
import me.darkwinged.CustomItems.Main;
import me.darkwinged.CustomItems.Sets.structs.Menu;
import me.darkwinged.CustomItems.Utils.ArrayLists;
import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PlayerMenu implements Menu {

	private Main plugin;
	private final Player player;  
	private final Inventory inventory;
	
	String setsGUIname = ChatColor.translateAlternateColorCodes('&', "&6&lSets");
	  
	public PlayerMenu(Player player, Main plugin) {
	    this.player = player;
	    this.plugin = plugin;
	    this.inventory = Bukkit.createInventory(this, 45, this.setsGUIname);
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
	    
	    if (ArrayLists.player_Farming_Helmet.containsKey(player.getUniqueId())) {
	    	this.inventory.setItem(10, ArrayLists.player_Farming_Helmet.get(player.getUniqueId()));
	    }
	    if (ArrayLists.player_Farming_Chestplate.containsKey(player.getUniqueId())) {
	    	this.inventory.setItem(11, ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()));
	    }
	    if (ArrayLists.player_Farming_Leggings.containsKey(player.getUniqueId())) {
	    	this.inventory.setItem(12, ArrayLists.player_Farming_Leggings.get(player.getUniqueId()));
	    }
	    if (ArrayLists.player_Farming_Boots.containsKey(player.getUniqueId())) {
	    	this.inventory.setItem(13, ArrayLists.player_Farming_Boots.get(player.getUniqueId()));
	    }
	    this.inventory.setItem(14, GUIItems.Background());
		if (ArrayLists.player_Farming_Hoe.containsKey(player.getUniqueId())) {
			this.inventory.setItem(15, ArrayLists.player_Farming_Hoe.get(player.getUniqueId()));
		}
	    this.inventory.setItem(16, FarmerItems.FarmerUnEquipped());
	    this.inventory.setItem(17, GUIItems.Background());
	    
	    this.inventory.setItem(18, GUIItems.Background());
	    if (ArrayLists.player_Mining_Helmet.containsKey(player.getUniqueId())) {
			this.inventory.setItem(19, ArrayLists.player_Mining_Helmet.get(player.getUniqueId()));
		}
		if (ArrayLists.player_Mining_Chestplate.containsKey(player.getUniqueId())) {
			this.inventory.setItem(20, ArrayLists.player_Mining_Chestplate.get(player.getUniqueId()));
		}
		if (ArrayLists.player_Mining_Leggings.containsKey(player.getUniqueId())) {
			this.inventory.setItem(21, ArrayLists.player_Mining_Leggings.get(player.getUniqueId()));
		}
		if (ArrayLists.player_Mining_Boots.containsKey(player.getUniqueId())) {
			this.inventory.setItem(22, ArrayLists.player_Mining_Boots.get(player.getUniqueId()));
		}
	    this.inventory.setItem(23, GUIItems.Background());
		if (ArrayLists.player_Mining_Pickaxe.containsKey(player.getUniqueId())) {
			this.inventory.setItem(24, ArrayLists.player_Mining_Pickaxe.get(player.getUniqueId()));
		}
	    this.inventory.setItem(25, MinerItems.MinerUnEquipped());
	    this.inventory.setItem(26, GUIItems.Background());
	    
	    this.inventory.setItem(27, GUIItems.Background());
		if (ArrayLists.player_Diamond_Helmet.containsKey(player.getUniqueId())) {
			this.inventory.setItem(28, ArrayLists.player_Diamond_Helmet.get(player.getUniqueId()));
		}
		if (ArrayLists.player_Diamond_Chestplate.containsKey(player.getUniqueId())) {
			this.inventory.setItem(29, ArrayLists.player_Diamond_Chestplate.get(player.getUniqueId()));
		}
		if (ArrayLists.player_Diamond_Leggings.containsKey(player.getUniqueId())) {
			this.inventory.setItem(30, ArrayLists.player_Diamond_Leggings.get(player.getUniqueId()));
		}
		if (ArrayLists.player_Diamond_Boots.containsKey(player.getUniqueId())) {
			this.inventory.setItem(31, ArrayLists.player_Diamond_Boots.get(player.getUniqueId()));
		}
	    this.inventory.setItem(32, GUIItems.Background());
		if (ArrayLists.player_Diamond_Sword.containsKey(player.getUniqueId())) {
			this.inventory.setItem(33, ArrayLists.player_Diamond_Sword.get(player.getUniqueId()));
		}
	    this.inventory.setItem(34, DiamondItems.DiamondUnEquipped());
	    this.inventory.setItem(35, GUIItems.Background());
	    
	    this.inventory.setItem(36, GUIItems.Background());
	    this.inventory.setItem(37, GUIItems.Background());
	    this.inventory.setItem(38, GUIItems.Background());
	    this.inventory.setItem(39, GUIItems.Background());
	    this.inventory.setItem(40, GUIItems.Close());
	    this.inventory.setItem(41, GUIItems.Background());
	    this.inventory.setItem(42, GUIItems.Background());
	    this.inventory.setItem(43, GUIItems.Background());
	    this.inventory.setItem(44, GUIItems.Background());
	}
	  
	public void onClick(Player player, int slot, ClickType type, ItemStack item, Main plugin) {
		FarmerHelmet farmerHelmet = new FarmerHelmet(player, plugin);
		FarmerChestplate farmerChestplate = new FarmerChestplate(player, plugin);
		//FarmerLeggings farmerLeggings = new FarmerLeggings(player, plugin);
		//FarmerBoots farmerBoots = new FarmerBoots(player, plugin);
		//FarmerHoe farmerHoe = new FarmerHoe(player, plugin);
	    switch (slot) {
	    case 10:
	    	player.openInventory(farmerHelmet.getInventory()); 
	    	break;
	    case 11: 
	    	player.openInventory(farmerChestplate.getInventory()); 
	    	break;
	    case 12: 
	    	//player.openInventory(farmerMenu.getInventory()); 
	    	break;
	    case 13:
	    	//player.openInventory(farmerMenu.getInventory()); 
	    	break;
	    case 15:
	    	//player.openInventory(farmerHoe.getInventory()); 
	    	break;
	    case 16:
	    	if (item.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&a&lEquip"))) {
	    		if (player.getInventory().getItem(0) != null) { player.sendMessage("First slot has to be empty!"); return; }
	    		if (player.getInventory().getHelmet() != null) { player.sendMessage("You can't were armor when equipping!"); return; }
	    		if (player.getInventory().getChestplate() != null) { player.sendMessage("You can't were armor when equipping!"); return; }
	    		if (player.getInventory().getLeggings() != null) { player.sendMessage("You can't were armor when equipping!"); return; }
	    		if (player.getInventory().getBoots() != null) { player.sendMessage("You can't were armor when equipping!"); return; }
	    		this.inventory.setItem(16, FarmerItems.FarmerEquipped());
	    		this.inventory.setItem(9, GUIItems.Equipped_Glass());
	    		this.inventory.setItem(14, GUIItems.Equipped_Glass());
	    		this.inventory.setItem(17, GUIItems.Equipped_Glass());
	    		player.getInventory().setItem(0, ArrayLists.player_Farming_Hoe.get(player.getUniqueId()));
	    		player.getInventory().setHelmet(ArrayLists.player_Farming_Helmet.get(player.getUniqueId()));
	    		player.getInventory().setChestplate(ArrayLists.player_Farming_Chestplate.get(player.getUniqueId()));
	    		player.getInventory().setLeggings(ArrayLists.player_Farming_Leggings.get(player.getUniqueId()));
	    		player.getInventory().setBoots(ArrayLists.player_Farming_Boots.get(player.getUniqueId()));
	    	} else {
	    		this.inventory.setItem(16, FarmerItems.FarmerUnEquipped());
	    		this.inventory.setItem(9, GUIItems.Background());
	    		this.inventory.setItem(14, GUIItems.Background());
	    		this.inventory.setItem(17, GUIItems.Background());
	    		player.getInventory().setItem(0, null);
	    		player.getInventory().setHelmet(null);
	    		player.getInventory().setChestplate(null);
	    		player.getInventory().setLeggings(null);
	    		player.getInventory().setBoots(null);
	    	}
	    	break;
	    case 40:
	    	player.closeInventory();
	    	break;
	    } 
	}
	  
	public void onOpen(Player player, Main plugin) {
		if (player.getInventory().getItem(0) == null) return;
		if (player.getInventory().getItem(0).getItemMeta().getDisplayName().equals(Utils.chat("&2&lFarmer Set"))) {
			this.inventory.setItem(16, FarmerItems.FarmerEquipped());
    		this.inventory.setItem(9, GUIItems.Equipped_Glass());
    		this.inventory.setItem(14, GUIItems.Equipped_Glass());
    		this.inventory.setItem(17, GUIItems.Equipped_Glass());
    		return;
		} else if (player.getInventory().getItem(0).getItemMeta().getDisplayName().equals(Utils.chat("&7&lMiner Set"))) {
			this.inventory.setItem(25, MinerItems.MinerEquipped());
    		this.inventory.setItem(18, GUIItems.Equipped_Glass());
    		this.inventory.setItem(23, GUIItems.Equipped_Glass());
    		this.inventory.setItem(26, GUIItems.Equipped_Glass());
    		return;
		} else if (player.getInventory().getItem(0).getItemMeta().getDisplayName().equals(Utils.chat("&1&lDiamond Set"))) {
			this.inventory.setItem(34, DiamondItems.DiamondEquipped());
    		this.inventory.setItem(27, GUIItems.Equipped_Glass());
    		this.inventory.setItem(32, GUIItems.Equipped_Glass());
    		this.inventory.setItem(35, GUIItems.Equipped_Glass());
    		return;
		} else {
			return;
		}
	}
	  
	public void onClose(Player player) {}
	  
	public Inventory getInventory() {
	    return this.inventory;
	}
	
}
