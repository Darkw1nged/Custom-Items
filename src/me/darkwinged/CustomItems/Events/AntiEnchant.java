package me.darkwinged.CustomItems.Events;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;

public class AntiEnchant implements Listener {

    @EventHandler
    public void NoEnchant(EnchantItemEvent event) {
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&2&l** Farming Boots **"))) event.setCancelled(true);
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&2&l** Replant Hoe **"))) event.setCancelled(true);
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&2&l** Farming Shears **"))) event.setCancelled(true);
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&2&l** Harvester Axe **"))) event.setCancelled(true);
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&8&l** Miner's Helmet **"))) event.setCancelled(true);
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&8&l** Miner's Chestplate **"))) event.setCancelled(true);
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&8&l** Miner's Leggings **"))) event.setCancelled(true);
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&8&l** Miner's Boots **"))) event.setCancelled(true);
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&8&l** Zelock's Helmet ***"))) event.setCancelled(true);
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&8&l** Zelock's Chestplate **"))) event.setCancelled(true);
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&8&l** Zelock's Leggings **"))) event.setCancelled(true);
        if (event.getItem().getItemMeta().getDisplayName().equals(Utils.chat("&8&l** Zelock's Boots **"))) event.setCancelled(true);
    }

}
