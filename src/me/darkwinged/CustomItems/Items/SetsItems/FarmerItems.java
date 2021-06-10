package me.darkwinged.CustomItems.Items.SetsItems;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FarmerItems {

    static String farmerset = Utils.chat("&2&lFarmer Set");

    public static ItemStack Farmer_Helmet() {
        ItemStack Armor = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(farmerset);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Farmer_Chestplate() {
        ItemStack Armor = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(farmerset);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Farmer_Leggings() {
        ItemStack Armor = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(farmerset);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Farmer_Boots() {
        ItemStack Armor = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(farmerset);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Farmer_Hoe() {
        ItemStack Hoe = new ItemStack(Material.GOLDEN_HOE);
        ItemMeta meta = Hoe.getItemMeta();
        meta.setDisplayName(farmerset);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        Hoe.setItemMeta(meta);
        return Hoe;
    }

    static String farmer_equip = Utils.chat("&a&lEquip");
    static String farmer_unequip = Utils.chat("&c&lUnEquip");

    public static ItemStack FarmerUnEquipped() {
        ItemStack UnEquip = new ItemStack(Material.REDSTONE_TORCH);
        ItemMeta meta = UnEquip.getItemMeta();
        meta.setDisplayName(farmer_equip);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        UnEquip.setItemMeta(meta);
        return UnEquip;
    }

    public static ItemStack FarmerEquipped() {
        ItemStack Equip = new ItemStack(Material.TORCH);
        ItemMeta meta = Equip.getItemMeta();
        meta.setDisplayName(farmer_unequip);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        Equip.setItemMeta(meta);
        return Equip;
    }

}
