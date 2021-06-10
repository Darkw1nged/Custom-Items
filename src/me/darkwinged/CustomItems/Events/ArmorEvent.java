package me.darkwinged.CustomItems.Events;

import me.darkwinged.CustomItems.Items.Armor.MinerArmor;
import me.darkwinged.CustomItems.Items.Armor.ZelocksArmor;
import me.darkwinged.CustomItems.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ArmorEvent implements Listener {

    private Main plugin;
    public ArmorEvent(Main plugin) { this.plugin = plugin; }

    @EventHandler
    public void MinerArmour(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Boolean creative = player.getGameMode().equals(GameMode.CREATIVE);
        Boolean spectator = player.getGameMode().equals(GameMode.SPECTATOR);
        Inventory inv = player.getInventory();

        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (creative || spectator) return;
                if (player.getInventory().getHelmet() == null || player.getInventory().getChestplate() == null || player.getInventory().getLeggings() == null ||
                    player.getInventory().getBoots() == null) return;
                if (player.getInventory().getHelmet().equals(MinerArmor.MinerHelmetArmor()) && player.getInventory().getChestplate().equals(MinerArmor.MinerChestplateArmor()) &&
                        player.getInventory().getLeggings().equals(MinerArmor.MinerLeggingsArmor()) && player.getInventory().getBoots().equals(MinerArmor.MinerBootsArmor())) {
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 12, 1), true);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 20 * 12, 2), true);
                } else if (player.getInventory().getHelmet().equals(ZelocksArmor.ZelocksHelmetArmor()) && player.getInventory().getChestplate().equals(ZelocksArmor.ZelocksChestplateArmor()) &&
                        player.getInventory().getLeggings().equals(ZelocksArmor.ZelocksLeggingsArmor()) && player.getInventory().getBoots().equals(ZelocksArmor.ZelocksBootsArmor())) {
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 12, 3), true);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * 12, 2), true);
                }
            }
        },  0, 20);

    }

}
