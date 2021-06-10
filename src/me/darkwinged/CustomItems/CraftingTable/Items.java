package me.darkwinged.CustomItems.CraftingTable;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.darkwinged.CustomItems.Utils.Utils;

public class Items {
	
	public static ItemStack background() {
		ItemStack item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(" ");
		item.setItemMeta(meta);
		return item;
	}
	
	public static ItemStack close() {
		ItemStack item = new ItemStack(Material.RED_STAINED_GLASS_PANE);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&4Close"));
		item.setItemMeta(meta);
		return item;
	}
	
}
