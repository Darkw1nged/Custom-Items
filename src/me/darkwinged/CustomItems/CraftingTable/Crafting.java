package me.darkwinged.CustomItems.CraftingTable;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.darkwinged.CustomItems.Main;
import me.darkwinged.CustomItems.CraftingTable.structs.Menu;

public class Crafting implements Menu {

	private Main plugin;
	private final Player player;  
	private final Inventory inventory;
	
	String name = ChatColor.translateAlternateColorCodes('&', "&7Crafting");
	  
	public Crafting(Player player, Main plugin) {
	    this.player = player;
	    this.plugin = plugin;
	    this.inventory = Bukkit.createInventory(this, 54, this.name);	    
	    
	    this.inventory.setItem(0, Items.background());
	    this.inventory.setItem(1, Items.background());
	    this.inventory.setItem(2, Items.background());
	    this.inventory.setItem(3, Items.background());
	    this.inventory.setItem(4, Items.background());
	    this.inventory.setItem(5, Items.background());
	    this.inventory.setItem(6, Items.background());
	    this.inventory.setItem(7, Items.background());
	    this.inventory.setItem(8, Items.background());
	    
	    this.inventory.setItem(9, Items.background());
	    this.inventory.setItem(10, Items.background());
	    //11,12,13 is air
	    this.inventory.setItem(14, Items.background());
	    this.inventory.setItem(15, Items.background());
	    this.inventory.setItem(16, Items.background());
	    this.inventory.setItem(17, Items.background());
	    
	    this.inventory.setItem(18, Items.background());
	    this.inventory.setItem(19, Items.background());
	    //20,21,22 is air
	    this.inventory.setItem(23, Items.background());
	    //24 is air
	    this.inventory.setItem(25, Items.background());
	    this.inventory.setItem(26, Items.background());
	    
	    this.inventory.setItem(27, Items.background());
	    this.inventory.setItem(28, Items.background());
	    //29,30,31 is air
	    this.inventory.setItem(32, Items.background());
	    this.inventory.setItem(33, Items.background());
	    this.inventory.setItem(34, Items.background());
	    this.inventory.setItem(35, Items.background());
	    
	    this.inventory.setItem(36, Items.background());
	    this.inventory.setItem(37, Items.background());
	    this.inventory.setItem(38, Items.background());
	    this.inventory.setItem(39, Items.background());
	    this.inventory.setItem(40, Items.background());
	    this.inventory.setItem(41, Items.background());
	    this.inventory.setItem(42, Items.background());
	    this.inventory.setItem(43, Items.background());
	    this.inventory.setItem(44, Items.background());
	    
	    this.inventory.setItem(45, Items.background());
	    this.inventory.setItem(46, Items.background());
	    this.inventory.setItem(47, Items.background());
	    this.inventory.setItem(48, Items.background());
	    this.inventory.setItem(49, Items.close());
	    this.inventory.setItem(50, Items.background());
	    this.inventory.setItem(51, Items.background());
	    this.inventory.setItem(52, Items.background());
	    this.inventory.setItem(53, Items.background());
	}
	  
	public void onClick(Player player, int slot, ClickType type, ItemStack item, Main plugin) {
		switch (slot) {
		case 12:
			if (item == null) return;
			break;
		case 49:
	    	player.closeInventory();
	    	break;
		}
	}
	  
	public void onOpen(Player player, Main plugin) {}
	  
	public void onClose(Player player) {}
	  
	public Inventory getInventory() {
	    return this.inventory;
	}
	

}
