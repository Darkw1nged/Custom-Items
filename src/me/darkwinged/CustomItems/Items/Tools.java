package me.darkwinged.CustomItems.Items;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Tools {

    public static ItemStack FarmingBoots() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&2&l** Farming Boots **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lDoes not break crops!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack ReplantTool() {
        ItemStack item = new ItemStack(Material.DIAMOND_HOE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&2&l** Replant Hoe **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lAutomatically replants crops!"));
        lore.add(Utils.chat("&6&l* &f&lCan't destroy crops with this!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack HarvesterAxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&2&l** Harvester Axe **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lBreak melons/pumpkins with this!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack HarvesterShears() {
        ItemStack item = new ItemStack(Material.SHEARS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&2&l** Farming Shears **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lBreak sugarcane with this!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        item.setItemMeta(meta);
        return item;
    }

}
