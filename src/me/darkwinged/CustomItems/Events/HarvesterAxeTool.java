package me.darkwinged.CustomItems.Events;

import me.darkwinged.CustomItems.Items.Tools;
import me.darkwinged.CustomItems.Main;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public class HarvesterAxeTool implements Listener {

    @EventHandler
    public void HarvesterAxe(BlockBreakEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlock();
        if (player.getGameMode() == GameMode.CREATIVE || (player.getGameMode() == GameMode.SPECTATOR)) { return; }
        if (!player.getItemInHand().equals(Tools.HarvesterAxe())) {
            return;
        }

        if (block.getType().equals(Material.MELON)) {
            if (player.getInventory().firstEmpty() == -1) return;
            Collection<ItemStack> drops = block.getDrops(player.getInventory().getItemInMainHand());
            if (drops.isEmpty()) return;
            player.getInventory().addItem(drops.iterator().next());
            block.setType(Material.AIR);
        } else if (block.getType().equals(Material.PUMPKIN)) {
            if (player.getInventory().firstEmpty() == -1) return;
            Collection<ItemStack> drops = block.getDrops(player.getInventory().getItemInMainHand());
            if (drops.isEmpty()) return;
            player.getInventory().addItem(drops.iterator().next());
            block.setType(Material.AIR);

        }
    }

}
