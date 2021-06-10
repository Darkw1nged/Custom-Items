package me.darkwinged.CustomItems.Items.Enchanted;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EnchantedFarming {

    public static ItemStack EnchantedWheat() {
        ItemStack item = new ItemStack(Material.WHEAT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&d&l** Enchanted Wheat **"));
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack EnchantedHay() {
        ItemStack item = new ItemStack(Material.HAY_BLOCK);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&d&l** Enchanted Hay **"));
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack EnchantedApple() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&d&l** Enchanted Apple **"));
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack EnchantedMelon() {
        ItemStack item = new ItemStack(Material.MELON_SLICE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&d&l** Enchanted Melon Slice **"));
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack EnchantedMelonBlock() {
        ItemStack item = new ItemStack(Material.MELON);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&d&l** Enchanted Melon **"));
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack EnchantedPumpkin() {
        ItemStack item = new ItemStack(Material.PUMPKIN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&d&l** Enchanted Pumpkin **"));
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack EnchantedJackOLanternPumpkin() {
        ItemStack item = new ItemStack(Material.JACK_O_LANTERN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&d&l** Enchanted Jack o'Lantern **"));
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack EnchantedSugarCane() {
        ItemStack item = new ItemStack(Material.SUGAR_CANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&d&l** Enchanted Sugar Cane **"));
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack EnchantedSugar() {
        ItemStack item = new ItemStack(Material.SUGAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&d&l** Enchanted Sugar **"));
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
        item.setItemMeta(meta);
        return item;
    }

}
