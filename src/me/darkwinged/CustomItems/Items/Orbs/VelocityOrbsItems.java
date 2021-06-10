package me.darkwinged.CustomItems.Items.Orbs;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class VelocityOrbsItems {

    public static ItemStack VelocityOrbTier1() {
        ItemStack item = new ItemStack(Material.SNOWBALL);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&b&l** Velocity Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l1"));
        lore.add(Utils.chat("&6&l* &f&lSpeed 1 forever!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack VelocityOrbTier2() {
        ItemStack item = new ItemStack(Material.SNOWBALL);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&b&l** Velocity Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l2"));
        lore.add(Utils.chat("&6&l* &f&lSpeed 2 forever!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack VelocityOrbTier3() {
        ItemStack item = new ItemStack(Material.SNOWBALL);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&b&l** Velocity Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l3"));
        lore.add(Utils.chat("&6&l* &f&lSpeed 3 forever!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

}
