package me.darkwinged.CustomItems.CraftingTable.structs;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import me.darkwinged.CustomItems.Main;

public interface Menu extends InventoryHolder {
	  default void onClick(Player player, int slot, ClickType type, ItemStack item, Main plugin) {}
	  
	  default void onOpen(Player player, Main plugin) {}
	  
	  default void onClose(Player player) {}

}
