package me.darkwinged.CustomItems.Items.Enchanted;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EnchantedLogs {

	public static ItemStack EnchantedOakLogs() {
		ItemStack item = new ItemStack(Material.OAK_LOG);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(Utils.chat("&5&l** Enchanted Log **"));
	    item.setItemMeta(meta);
	    return item;
	}
	
	public static ItemStack EnchantedSpruceLogs() {
		ItemStack item = new ItemStack(Material.SPRUCE_LOG);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(Utils.chat("&5&l** Enchanted Log **"));
	    item.setItemMeta(meta);
	    return item;
	}

	public static ItemStack EnchantedBirchLogs() {
		ItemStack item = new ItemStack(Material.BIRCH_LOG);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(Utils.chat("&5&l** Enchanted Log **"));
	    item.setItemMeta(meta);
	    return item;
	}
	
	public static ItemStack EnchantedJungleLogs() {
		ItemStack item = new ItemStack(Material.JUNGLE_LOG);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(Utils.chat("&5&l** Enchanted Log **"));
	    item.setItemMeta(meta);
	    return item;
	}
	
	public static ItemStack EnchantedAcaciaLogs() {
		ItemStack item = new ItemStack(Material.ACACIA_LOG);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(Utils.chat("&5&l** Enchanted Log **"));
	    item.setItemMeta(meta);
	    return item;
	}
	
	public static ItemStack EnchantedDarkOakLogs() {
		ItemStack item = new ItemStack(Material.DARK_OAK_LOG);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(Utils.chat("&5&l** Enchanted Log **"));
	    item.setItemMeta(meta);
	    return item;
	}
	
}
