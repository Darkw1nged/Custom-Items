package me.darkwinged.CustomItems.Items.Armor;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class MinerArmor {

    public static ItemStack MinerHelmetArmor() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&8&l** Miner's Helmet **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lHaste 3 and Night Vision 2"));
        lore.add(Utils.chat("&4&l!! &f&lOnly when you are wearing the"));
        lore.add(Utils.chat("   &f&lminers armour set!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack MinerChestplateArmor() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&8&l** Miner's Chestplate **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lHaste 3 and Night Vision 2"));
        lore.add(Utils.chat("&4&l!! &f&lOnly when you are wearing the"));
        lore.add(Utils.chat("   &f&lminers armour set!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack MinerLeggingsArmor() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&8&l** Miner's Leggings **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lHaste 3 and Night Vision 2"));
        lore.add(Utils.chat("&4&l!! &f&lOnly when you are wearing the"));
        lore.add(Utils.chat("   &f&lminers armour set!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack MinerBootsArmor() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&8&l** Miner's Boots **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&6&l* &f&lHaste 3 and Night Vision 2"));
        lore.add(Utils.chat("&4&l!! &f&lOnly when you are wearing the"));
        lore.add(Utils.chat("   &f&lminers armour set!"));
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        item.setItemMeta(meta);
        return item;
    }

}
