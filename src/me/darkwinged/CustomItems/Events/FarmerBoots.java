package me.darkwinged.CustomItems.Events;

import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class FarmerBoots implements Listener {

    @EventHandler
    public void NoCropDamage(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getBoots() == null)
            return;
        if (player.getInventory().getBoots().equals(Material.LEATHER_BOOTS))
            return;
        if (player.getInventory().getBoots().equals(Material.IRON_BOOTS))
            return;
        if (player.getInventory().getBoots().equals(Material.GOLDEN_BOOTS))
            return;
        if (player.getInventory().getBoots().equals(Material.DIAMOND_BOOTS))
            return;
        if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(Utils.chat("&2&l** Farming Boots **")) && event.getAction() == Action.PHYSICAL &&
                event.getClickedBlock().getType() == Material.FARMLAND) {
            event.setCancelled(true);
        } else {
            return;
        }

    }

}
