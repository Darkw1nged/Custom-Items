package me.darkwinged.CustomItems.Items.Orbs;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class HealthOrbItems {

    public static ItemStack HealthOrbTier1() {
        ItemStack item = new ItemStack(Material.NETHER_STAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&2&l** Health Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l1"));
        lore.add(Utils.chat("&6&l* &f&l+1 heart every 15 seconds!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack HealthOrbTier2() {
        ItemStack item = new ItemStack(Material.NETHER_STAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&2&l** Health Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l2"));
        lore.add(Utils.chat("&6&l* &f&l+1 heart every 9 seconds!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack HealthOrbTier3() {
        ItemStack item = new ItemStack(Material.NETHER_STAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&2&l** Health Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l3"));
        lore.add(Utils.chat("&6&l* &f&l+1 heart every 7 seconds!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack HealthOrbTier4() {
        ItemStack item = new ItemStack(Material.NETHER_STAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&2&l** Health Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l4"));
        lore.add(Utils.chat("&6&l* &f&l+1 heart every 3 seconds!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack HealthOrbTier5() {
        ItemStack item = new ItemStack(Material.NETHER_STAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&2&l** Health Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l5"));
        lore.add(Utils.chat("&6&l* &f&l+1 heart every 1 second!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

}
