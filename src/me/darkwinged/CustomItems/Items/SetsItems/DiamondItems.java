package me.darkwinged.CustomItems.Items.SetsItems;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DiamondItems {

    static String diamondset = Utils.chat("&1&lDiamond Set");

    public static ItemStack Diamond_Helmet() {
        ItemStack Armor = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(diamondset);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Diamond_Chestplate() {
        ItemStack Armor = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(diamondset);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Diamond_Leggings() {
        ItemStack Armor = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(diamondset);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Diamond_Boots() {
        ItemStack Armor = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(diamondset);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Diamond_Sword() {
        ItemStack Armor = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(diamondset);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        Armor.setItemMeta(meta);
        return Armor;
    }

    static String diamond_equip = Utils.chat("&a&lEquip");
    static String diamond_unequip = Utils.chat("&c&lUnEquip");

    public static ItemStack DiamondUnEquipped() {
        ItemStack UnEquip = new ItemStack(Material.REDSTONE_TORCH);
        ItemMeta meta = UnEquip.getItemMeta();
        meta.setDisplayName(diamond_equip);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        UnEquip.setItemMeta(meta);
        return UnEquip;
    }

    public static ItemStack DiamondEquipped() {
        ItemStack Equip = new ItemStack(Material.TORCH);
        ItemMeta meta = Equip.getItemMeta();
        meta.setDisplayName(diamond_unequip);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        Equip.setItemMeta(meta);
        return Equip;
    }

}
