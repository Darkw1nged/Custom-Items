package me.darkwinged.CustomItems.Items.Orbs;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class MiningOrbsItems {

    public static ItemStack MiningOrbTier1() {
        ItemStack item = new ItemStack(Material.PRISMARINE_CRYSTALS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&7&l** Mining Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l1"));
        lore.add(Utils.chat("&6&l* &f&lHaste 1 forever!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack MiningOrbTier2() {
        ItemStack item = new ItemStack(Material.PRISMARINE_CRYSTALS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&7&l** Mining Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l2"));
        lore.add(Utils.chat("&6&l* &f&lHaste 2 forever!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack MiningOrbTier3() {
        ItemStack item = new ItemStack(Material.PRISMARINE_CRYSTALS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&7&l** Mining Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l3"));
        lore.add(Utils.chat("&6&l* &f&lHaste 3 forever!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

}
