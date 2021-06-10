package me.darkwinged.CustomItems.Items.Orbs;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class DamageOrbsItems {

    public static ItemStack DamageOrbTier1() {
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&c&l** Damage Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l1"));
        lore.add(Utils.chat("&6&l* &f&l+2 Damage every 15 seconds!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack DamageOrbTier2() {
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&c&l** Damage Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l2"));
        lore.add(Utils.chat("&6&l* &f&l+2 Damage every 9 seconds!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack DamageOrbTier3() {
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&c&l** Damage Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l3"));
        lore.add(Utils.chat("&6&l* &f&l+2 Damage every 7 seconds!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack DamageOrbTier4() {
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&c&l** Damage Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l4"));
        lore.add(Utils.chat("&6&l* &f&l+2 Damage every 3 seconds!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack DamageOrbTier5() {
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&c&l** Damage Orb **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&lTier: &f&l5"));
        lore.add(Utils.chat("&6&l* &f&l+2 Damage forever!"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

}
