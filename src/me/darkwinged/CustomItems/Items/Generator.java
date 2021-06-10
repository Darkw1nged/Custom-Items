package me.darkwinged.CustomItems.Items;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Generator {

    public static ItemStack Coal() {
        ItemStack item = new ItemStack(Material.COAL_BLOCK);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&2&l** Coal Generator **"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&7This will generate 16 blocks of coal an hour!"));
        item.setItemMeta(meta);
        return item;
    }

}
