package me.darkwinged.CustomItems.Items.Armor;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ZelocksArmor {

    public static ItemStack ZelocksHelmetArmor() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&8&l** Zelock's Helmet **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lStrength 3 and Speed 4"));
        lore.add(Utils.chat("&4&l!! &f&lOnly when you are wearing the"));
        lore.add(Utils.chat("   &d&lZelocks armour set!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack ZelocksChestplateArmor() {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&8&l** Zelock's Chestplate **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lStrength 3 and Speed 4"));
        lore.add(Utils.chat("&4&l!! &f&lOnly when you are wearing the"));
        lore.add(Utils.chat("   &d&lZelocks armour set!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack ZelocksLeggingsArmor() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&8&l** Zelock's Leggings **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lStrength 3 and Speed 4"));
        lore.add(Utils.chat("&4&l!! &f&lOnly when you are wearing the"));
        lore.add(Utils.chat("   &d&lZelocks armour set!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack ZelocksBootsArmor() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&8&l** Zelock's Boots **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lStrength 3 and Speed 4"));
        lore.add(Utils.chat("&4&l!! &f&lOnly when you are wearing the"));
        lore.add(Utils.chat("   &d&lZelocks armour set!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        return item;
    }

}
