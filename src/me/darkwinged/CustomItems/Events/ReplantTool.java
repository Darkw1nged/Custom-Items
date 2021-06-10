package me.darkwinged.CustomItems.Events;

import me.darkwinged.CustomItems.Items.Tools;
import me.darkwinged.CustomItems.Main;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class ReplantTool implements Listener {

    private Main plugin;
    public ReplantTool(Main plugin) { this.plugin = plugin; }

    @EventHandler
    private void Replant(BlockBreakEvent event) {
        final Block block = event.getBlock();
        final Player player = event.getPlayer();

        if (player.getGameMode() == GameMode.CREATIVE || (player.getGameMode() == GameMode.SPECTATOR)) { return; }

        if (isNotCrop(block)) {
            return;
        }

        final Ageable ageable = (Ageable) block.getState().getBlockData();

        if (player.getItemInHand().equals(Tools.ReplantTool())) {
            if (ageable.getAge() == ageable.getMaximumAge()) {
                autoReplant(player, block);
            }
        }
        event.setCancelled(true);
    }

    private void autoReplant(Player player, Block block) {
        block.getDrops(player.getInventory().getItemInMainHand()).forEach(drop -> {
            switch (drop.getType()) {
                case WHEAT_SEEDS:
                case BEETROOT_SEEDS:
                case CARROTS:
                case POTATOES:
                case NETHER_WART:
                    drop.setAmount(drop.getAmount() - 1);
                    break;
            }

            final Location blockLocation = block.getLocation();
            blockLocation.getWorld().dropItem(blockLocation,drop);
        });

        block.setType(block.getType());
    }

    private boolean isNotCrop(Block block) {
        switch (block.getType()) {
            case WHEAT:
            case CARROTS:
            case POTATOES:
            case BEETROOTS:
            case MELON_STEM:
            case PUMPKIN_STEM:
            case NETHER_WART:
                return false;
        }
        return true;
    }

}
