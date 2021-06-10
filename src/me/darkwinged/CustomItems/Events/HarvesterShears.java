package me.darkwinged.CustomItems.Events;

import me.darkwinged.CustomItems.Items.Tools;
import me.darkwinged.CustomItems.Main;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class HarvesterShears implements Listener {

    @EventHandler
    public void HarvesterShearsEvent(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if (player.getItemInHand().equals(Tools.HarvesterShears())) {
            if (player.getGameMode() == GameMode.CREATIVE || (player.getGameMode() == GameMode.SPECTATOR)) return;
            if (player.getInventory().firstEmpty() == -1) return;
            if (event.getBlock().getType().equals(Material.SUGAR_CANE)) {
                if (event.getBlock().getRelative(BlockFace.UP).getType().equals(Material.SUGAR_CANE)) {
                    if (event.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getType().equals(Material.SUGAR_CANE)) {
                        ItemStack item = new ItemStack(Material.SUGAR_CANE);
                        player.getInventory().addItem(item);
                        player.getInventory().addItem(item);
                        player.getInventory().addItem(item);
                        event.getBlock().setType(Material.AIR);
                        event.getBlock().getRelative(BlockFace.UP).setType(Material.AIR);
                        event.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).setType(Material.AIR);
                    } else {
                        ItemStack item = new ItemStack(Material.SUGAR_CANE);
                        player.getInventory().addItem(item);
                        player.getInventory().addItem(item);
                        event.getBlock().setType(Material.AIR);
                        event.getBlock().getRelative(BlockFace.UP).setType(Material.AIR);
                    }
                } else {
                    ItemStack item = new ItemStack(Material.SUGAR_CANE);
                    player.getInventory().addItem(item);
                    event.getBlock().setType(Material.AIR);
                }
            } else if (event.getBlock().getType().equals(Material.CACTUS)) {
                if (event.getBlock().getRelative(BlockFace.UP).getType().equals(Material.CACTUS)) {
                    if (event.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getType().equals(Material.CACTUS)) {
                        ItemStack item = new ItemStack(Material.CACTUS);
                        player.getInventory().addItem(item);
                        player.getInventory().addItem(item);
                        player.getInventory().addItem(item);
                        event.getBlock().setType(Material.AIR);
                        event.getBlock().getRelative(BlockFace.UP).setType(Material.AIR);
                        event.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).setType(Material.AIR);
                    } else {
                        ItemStack item = new ItemStack(Material.CACTUS);
                        player.getInventory().addItem(item);
                        player.getInventory().addItem(item);
                        event.getBlock().setType(Material.AIR);
                        event.getBlock().getRelative(BlockFace.UP).setType(Material.AIR);
                    }
                } else {
                    ItemStack item = new ItemStack(Material.CACTUS);
                    player.getInventory().addItem(item);
                    event.getBlock().setType(Material.AIR);
                }
            }
        }
    }

}
