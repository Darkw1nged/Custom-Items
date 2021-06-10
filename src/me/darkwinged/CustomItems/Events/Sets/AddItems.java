package me.darkwinged.CustomItems.Events.Sets;

import me.darkwinged.CustomItems.Items.SetsItems.DiamondItems;
import me.darkwinged.CustomItems.Items.SetsItems.FarmerItems;
import me.darkwinged.CustomItems.Items.SetsItems.MinerItems;
import me.darkwinged.CustomItems.Utils.ArrayLists;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class AddItems implements Listener {

    @EventHandler
    public void ItemCheck(PlayerJoinEvent event) {
        if (!ArrayLists.player_Farming_Helmet.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Farming_Helmet.put(event.getPlayer().getUniqueId(), FarmerItems.Farmer_Helmet());
        if (!ArrayLists.player_Farming_Chestplate.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Farming_Chestplate.put(event.getPlayer().getUniqueId(), FarmerItems.Farmer_Chestplate());
        if (!ArrayLists.player_Farming_Leggings.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Farming_Leggings.put(event.getPlayer().getUniqueId(), FarmerItems.Farmer_Leggings());
        if (!ArrayLists.player_Farming_Boots.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Farming_Boots.put(event.getPlayer().getUniqueId(), FarmerItems.Farmer_Boots());
        if (!ArrayLists.player_Farming_Hoe.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Farming_Hoe.put(event.getPlayer().getUniqueId(), FarmerItems.Farmer_Hoe());

        if (!ArrayLists.player_Mining_Helmet.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Mining_Helmet.put(event.getPlayer().getUniqueId(), MinerItems.Miner_Helmet());
        if (!ArrayLists.player_Mining_Chestplate.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Mining_Chestplate.put(event.getPlayer().getUniqueId(), MinerItems.Miner_Chestplate());
        if (!ArrayLists.player_Mining_Leggings.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Mining_Leggings.put(event.getPlayer().getUniqueId(), MinerItems.Miner_Leggings());
        if (!ArrayLists.player_Mining_Boots.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Mining_Boots.put(event.getPlayer().getUniqueId(), MinerItems.Miner_Boots());
        if (!ArrayLists.player_Mining_Pickaxe.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Mining_Pickaxe.put(event.getPlayer().getUniqueId(), MinerItems.Miner_Pickaxe());

        if (!ArrayLists.player_Diamond_Helmet.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Diamond_Helmet.put(event.getPlayer().getUniqueId(), DiamondItems.Diamond_Helmet());
        if (!ArrayLists.player_Diamond_Chestplate.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Diamond_Chestplate.put(event.getPlayer().getUniqueId(), DiamondItems.Diamond_Chestplate());
        if (!ArrayLists.player_Diamond_Leggings.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Diamond_Leggings.put(event.getPlayer().getUniqueId(), DiamondItems.Diamond_Leggings());
        if (!ArrayLists.player_Diamond_Boots.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Diamond_Boots.put(event.getPlayer().getUniqueId(), DiamondItems.Diamond_Boots());
        if (!ArrayLists.player_Diamond_Sword.containsKey(event.getPlayer().getUniqueId()))
            ArrayLists.player_Diamond_Sword.put(event.getPlayer().getUniqueId(), DiamondItems.Diamond_Sword());
    }

}
