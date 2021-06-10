package me.darkwinged.CustomItems.Events.Sets;

import me.darkwinged.CustomItems.Main;
import me.darkwinged.CustomItems.Sets.menus.PlayerMenu;
import me.darkwinged.CustomItems.Sets.structs.Menu;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class MenuListener implements Listener {

	private Main plugin;
	public MenuListener(Main plugin) { this.plugin = plugin; }
	
	@EventHandler
	private void onClick(InventoryClickEvent event) {
	    InventoryHolder holder = event.getInventory().getHolder();
	    if (!(holder instanceof Menu))
	      return; 
	    ((Menu) holder).onClick((Player)event.getWhoClicked(), event.getSlot(), event.getClick(), event.getCurrentItem(), plugin);
	    ItemStack item = event.getCurrentItem();
	    Player player = (Player)event.getWhoClicked();
	    PlayerMenu playerMenu = new PlayerMenu(player, plugin);
	    if (item.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&7&l<--"))) player.openInventory(playerMenu.getInventory()); 
	    event.setCancelled(true);
	}
	  
	@EventHandler
	  private void onOpen(InventoryOpenEvent event) {
	    InventoryHolder holder = event.getInventory().getHolder();
	    if (holder instanceof Menu)
	      ((Menu)holder).onOpen((Player)event.getPlayer(), plugin); 
	}
	
	@EventHandler
	  private void onClose(InventoryCloseEvent event) {
	    InventoryHolder holder = event.getInventory().getHolder();
	    if (holder instanceof Menu)
	    	((Menu)holder).onClose((Player)event.getPlayer()); 
	}
	
}
