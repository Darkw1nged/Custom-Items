package me.darkwinged.CustomItems.Events;

import me.darkwinged.CustomItems.Items.Orbs.DamageOrbsItems;
import me.darkwinged.CustomItems.Items.Orbs.HealthOrbItems;
import me.darkwinged.CustomItems.Items.Orbs.MiningOrbsItems;
import me.darkwinged.CustomItems.Items.Orbs.VelocityOrbsItems;
import me.darkwinged.CustomItems.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class OrbsEvent implements Listener {

    private Main plugin;
    public OrbsEvent(Main plugin) { this.plugin = plugin; }

    @EventHandler
    public void Orbs(PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        Boolean creative = player.getGameMode().equals(GameMode.CREATIVE);
        Boolean spectator = player.getGameMode().equals(GameMode.SPECTATOR);

        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(HealthOrbItems.HealthOrbTier1())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier2())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier3())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier4())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier5())) return;
                    if (player.getHealth() >= 18.0D) return;
                    player.setHealth(player.getHealth() + 2.0D);
                }
            }
        },  0L, 300L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(HealthOrbItems.HealthOrbTier1())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier2())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier3())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier4())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier5())) return;
                    if (player.getFoodLevel() >= 19.0D) return;
                    player.setFoodLevel(player.getFoodLevel() + 2);
                }
            }
        },  0L, 300L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(HealthOrbItems.HealthOrbTier2())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier3())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier4())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier5())) return;
                    if (player.getHealth() >= 18.0D) return;
                    player.setHealth(player.getHealth() + 2.0D);
                }
            }
        },  0L, 180L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(HealthOrbItems.HealthOrbTier2())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier3())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier4())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier5())) return;
                    if (player.getFoodLevel() >= 19.0D) return;
                    player.setFoodLevel(player.getFoodLevel() + 2);
                }
            }
        },  0L, 180L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(HealthOrbItems.HealthOrbTier3())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier4())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier5())) return;
                    if (player.getHealth() >= 18.0D) return;
                    player.setHealth(player.getHealth() + 2.0D);
                }
            }
        },  0L, 140L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(HealthOrbItems.HealthOrbTier3())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier4())) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier5())) return;
                    if (player.getFoodLevel() >= 19.0D) return;
                    player.setFoodLevel(player.getFoodLevel() + 2);
                }
            }
        },  0L, 140L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(HealthOrbItems.HealthOrbTier4())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier5())) return;
                    if (player.getHealth() >= 18.0D) return;
                    player.setHealth(player.getHealth() + 2.0D);
                }
            }
        },  0L, 60L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(HealthOrbItems.HealthOrbTier4())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(HealthOrbItems.HealthOrbTier5())) return;
                    if (player.getFoodLevel() >= 19.0D) return;
                    player.setFoodLevel(player.getFoodLevel() + 2);
                }
            }
        },  0L, 60L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(HealthOrbItems.HealthOrbTier5())) {
                    if (creative || spectator) return;
                    if (player.getHealth() >= 18.0) return;
                    player.setHealth(player.getHealth() + 2.0D);
                }
            }
        },  0L, 20L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(HealthOrbItems.HealthOrbTier5())) {
                    if (creative || spectator) return;
                    if (player.getFoodLevel() >= 19.0D) return;
                    player.setFoodLevel(player.getFoodLevel() + 2);
                }
            }
        },  0L, 20L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier1())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier2())) return;
                    if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier3())) return;
                    if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier4())) return;
                    if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier5())) return;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * 12, 1), true);
                }
            }
        }, 0L, 300L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier2())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier3())) return;
                    if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier4())) return;
                    if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier5())) return;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * 12, 1), true);
                }
            }
        }, 0L, 180L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier3())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier4())) return;
                    if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier5())) return;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * 12, 1), true);
                }
            }
        }, 0L, 140L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier4())) {
                    if (creative || spectator) return;
                    if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier5())) return;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * 12, 1), true);
                }
            }
        }, 0L, 60L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(DamageOrbsItems.DamageOrbTier5())) {
                    if (creative || spectator) return;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * 12, 1), true);
                }
            }
        }, 0L, 20L);

        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(MiningOrbsItems.MiningOrbTier3())) {
                    if (creative || spectator) return;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 12, 2), true);
                    return;
                } else if (player.getInventory().contains(MiningOrbsItems.MiningOrbTier2())) {
                    if (creative || spectator) return;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 20 * 12, 1), true);
                    return;
                } else if (player.getInventory().contains(MiningOrbsItems.MiningOrbTier1())) {
                    if (creative || spectator) return;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 20 * 12, 0), true);
                }
            }
        }, 0L, 20L);

        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                if (player.getInventory().contains(VelocityOrbsItems.VelocityOrbTier3())) {
                    if (creative || spectator) return;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 12, 2), true);
                    return;
                } else if (player.getInventory().contains(VelocityOrbsItems.VelocityOrbTier2())) {
                    if (creative || spectator) return;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 12, 1), true);
                    return;
                } else if (player.getInventory().contains(VelocityOrbsItems.VelocityOrbTier1())) {
                    if (creative || spectator) return;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 12, 0), true);
                }
            }
        }, 0L, 20L);

    }

}
