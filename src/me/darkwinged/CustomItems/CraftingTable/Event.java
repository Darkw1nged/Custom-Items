package me.darkwinged.CustomItems.CraftingTable;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;

import me.darkwinged.CustomItems.Main;

public class Event implements Listener {
	
	private Main plugin;
	public Event(Main plugin) { this.plugin = plugin; }
	
	@EventHandler
	public void craft(InventoryOpenEvent event) {
		Player player = (Player)event.getPlayer();
		Crafting craft = new Crafting(player, plugin);
		if (event.getInventory().getType().equals(InventoryType.WORKBENCH)) {
			event.setCancelled(true);
			player.openInventory(craft.getInventory());
		}
	}
	
}
