package me.darkwinged.CustomItems.Items.SetsItems;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIItems {

    public static ItemStack Background() {
        ItemStack GrayPane = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta meta = GrayPane.getItemMeta();
        meta.setDisplayName(" ");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        GrayPane.setItemMeta(meta);
        return GrayPane;
    }

    public static ItemStack Equipped_Glass() {
        ItemStack Equip = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta meta = Equip.getItemMeta();
        meta.setDisplayName(Utils.chat("&a&lEquipped!"));
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        Equip.setItemMeta(meta);
        return Equip;
    }

    public static ItemStack Close() {
        ItemStack Close = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta meta = Close.getItemMeta();
        meta.setDisplayName(Utils.chat("&4&lClose"));
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        Close.setItemMeta(meta);
        return Close;
    }

    public static ItemStack Back() {
        ItemStack Back = new ItemStack(Material.ARROW);
        ItemMeta meta = Back.getItemMeta();
        meta.setDisplayName(Utils.chat("&7&l<--"));
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        Back.setItemMeta(meta);
        return Back;
    }

}
