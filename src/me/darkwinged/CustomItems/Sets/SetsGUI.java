package me.darkwinged.CustomItems.Sets;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;

public class SetsGUI {

    String setsGUIname = ChatColor.translateAlternateColorCodes('&', "&6&lSets");

    public Inventory setGUI() {
        Inventory setsGUI = Bukkit.createInventory(null, 54, this.setsGUIname);
        return setsGUI;
    }

}
