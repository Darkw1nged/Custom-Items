package me.darkwinged.CustomItems.Events.Sets;

import me.darkwinged.CustomItems.Main;
import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemBreakEvent;

import java.util.ArrayList;

public class ItemBreak implements Listener {

    private static Main plugin;

    public void itembreak(PlayerItemBreakEvent event) {
        Player player = event.getPlayer();
        if (player.getItemInHand().getItemMeta().getDisplayName() == Utils.chat("&2&lFarmer Set")) {
            player.sendMessage("You have broke an item");
        } else return;
        /*
        if (player.getItemInHand().getItemMeta().getDisplayName() == Utils.chat("&2&lFarmer Set")) {
                    if (player.getItemInHand().getDurability() == 1) {
                        if (player.getItemInHand().getItemMeta().getLore() == null) {
                            ArrayList<String> lore = new ArrayList();
                            lore.add(Utils.chat("&c&lBroken"));
                            player.getItemInHand().getItemMeta().setLore(lore);
                        } else {
                            if (player.getItemInHand().getItemMeta().getLore().contains(Utils.chat("&c&lBroken"))) return;
                            player.getItemInHand().getItemMeta().getLore().add(Utils.chat("&c&lBroken"));
                        }
                    }
                }
         */
    }

}
