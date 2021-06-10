package me.darkwinged.CustomItems.Items.SetsItems;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MinerItems {

    static String minerset = Utils.chat("&7&lMiner Set");

    public static ItemStack Miner_Helmet() {
        ItemStack Armor = new ItemStack(Material.IRON_HELMET);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(minerset);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Miner_Chestplate() {
        ItemStack Armor = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(minerset);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Miner_Leggings() {
        ItemStack Armor = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(minerset);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Miner_Boots() {
        ItemStack Armor = new ItemStack(Material.IRON_BOOTS);
        ItemMeta meta = Armor.getItemMeta();
        meta.setDisplayName(minerset);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        Armor.setItemMeta(meta);
        return Armor;
    }

    public static ItemStack Miner_Pickaxe() {
        ItemStack Pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta meta = Pickaxe.getItemMeta();
        meta.setDisplayName(minerset);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        Pickaxe.setItemMeta(meta);
        return Pickaxe;
    }

    static String miner_equip = Utils.chat("&a&lEquip");
    static String miner_unequip = Utils.chat("&c&lUnEquip");

    public static ItemStack MinerUnEquipped() {
        ItemStack UnEquip = new ItemStack(Material.REDSTONE_TORCH);
        ItemMeta meta = UnEquip.getItemMeta();
        meta.setDisplayName(miner_equip);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        UnEquip.setItemMeta(meta);
        return UnEquip;
    }

    public static ItemStack MinerEquipped() {
        ItemStack Equip = new ItemStack(Material.TORCH);
        ItemMeta meta = Equip.getItemMeta();
        meta.setDisplayName(miner_unequip);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        Equip.setItemMeta(meta);
        return Equip;
    }

}
