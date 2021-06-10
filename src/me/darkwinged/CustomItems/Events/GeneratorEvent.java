package me.darkwinged.CustomItems.Events;

import me.darkwinged.CustomItems.Main;
import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class GeneratorEvent implements Listener {
	
	private Main plugin;
	public GeneratorEvent(Main plugin) { this.plugin = plugin; }
	
	@EventHandler
	public void onPlace(BlockPlaceEvent event) {
		Block block = event.getBlock();
		Player player = event.getPlayer();
		if (block.getType().equals(Material.COAL_BLOCK)) {
			if (!player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&2&l** Coal Generator **"))) return;
			// LAYER 0
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() -1,
					block.getLocation().getBlockZ()).setType(Material.GOLD_BLOCK);
			// X
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() -1,
					block.getLocation().getBlockZ()).setType(Material.GOLD_BLOCK);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() -1,
					block.getLocation().getBlockZ()).setType(Material.GOLD_BLOCK);
			// Z
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() -1,
					block.getLocation().getBlockZ() + 1).setType(Material.GOLD_BLOCK);
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() -1,
					block.getLocation().getBlockZ() - 1).setType(Material.GOLD_BLOCK);
			// UNIVERSAL
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() -1,
					block.getLocation().getBlockZ() + 1).setType(Material.GOLD_BLOCK);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() -1,
					block.getLocation().getBlockZ() - 1).setType(Material.GOLD_BLOCK);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() -1,
					block.getLocation().getBlockZ() - 1).setType(Material.GOLD_BLOCK);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() -1,
					block.getLocation().getBlockZ() + 1).setType(Material.GOLD_BLOCK);

			// LAYER 1
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY(),
					block.getLocation().getBlockZ()).setType(Material.BEACON);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY(),
					block.getLocation().getBlockZ()).setType(Material.STONE_BRICKS);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY(),
					block.getLocation().getBlockZ()).setType(Material.STONE_BRICKS);
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY(),
					block.getLocation().getBlockZ() + 1).setType(Material.STONE_BRICKS);
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY(),
					block.getLocation().getBlockZ() - 1).setType(Material.STONE_BRICKS);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY(),
					block.getLocation().getBlockZ() - 1).setType(Material.STONE_BRICK_SLAB);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY(),
					block.getLocation().getBlockZ() + 1).setType(Material.STONE_BRICK_SLAB);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY(),
					block.getLocation().getBlockZ() + 1).setType(Material.STONE_BRICK_SLAB);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY(),
					block.getLocation().getBlockZ() - 1).setType(Material.STONE_BRICK_SLAB);

			// LAYER 2
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() + 1,
					block.getLocation().getBlockZ()).setType(Material.END_PORTAL_FRAME);
			// X
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() + 1,
					block.getLocation().getBlockZ()).setType(Material.IRON_BARS);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() + 1,
					block.getLocation().getBlockZ()).setType(Material.IRON_BARS);
			// Z
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() + 1,
					block.getLocation().getBlockZ() + 1).setType(Material.IRON_BARS);
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() + 1,
					block.getLocation().getBlockZ() - 1).setType(Material.IRON_BARS);
			// CORNERS
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() + 1,
					block.getLocation().getBlockZ() + 1).setType(Material.LIME_STAINED_GLASS_PANE);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() + 1,
					block.getLocation().getBlockZ() - 1).setType(Material.LIME_STAINED_GLASS_PANE);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() + 1,
					block.getLocation().getBlockZ() - 1).setType(Material.LIME_STAINED_GLASS_PANE);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() + 1,
					block.getLocation().getBlockZ() + 1).setType(Material.LIME_STAINED_GLASS_PANE);

			// LAYER 3
			// X
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() + 2,
					block.getLocation().getBlockZ()).setType(Material.IRON_BARS);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() + 2,
					block.getLocation().getBlockZ()).setType(Material.IRON_BARS);
			// Z
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() + 2,
					block.getLocation().getBlockZ() + 1).setType(Material.IRON_BARS);
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() + 2,
					block.getLocation().getBlockZ() - 1).setType(Material.IRON_BARS);
			// CORNERS
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() + 2,
					block.getLocation().getBlockZ() + 1).setType(Material.LIME_STAINED_GLASS_PANE);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() + 2,
					block.getLocation().getBlockZ() - 1).setType(Material.LIME_STAINED_GLASS_PANE);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() + 2,
					block.getLocation().getBlockZ() - 1).setType(Material.LIME_STAINED_GLASS_PANE);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() + 2,
					block.getLocation().getBlockZ() + 1).setType(Material.LIME_STAINED_GLASS_PANE);

			// LAYER 4
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() + 3,
					block.getLocation().getBlockZ()).setType(Material.LIME_STAINED_GLASS);
			// X
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() + 3,
					block.getLocation().getBlockZ()).setType(Material.STONE_BRICKS);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() + 3,
					block.getLocation().getBlockZ()).setType(Material.STONE_BRICKS);
			// Z
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() + 3,
					block.getLocation().getBlockZ() + 1).setType(Material.STONE_BRICKS);
			block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() + 3,
					block.getLocation().getBlockZ() - 1).setType(Material.STONE_BRICKS);
			// CORNERS
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() + 3,
					block.getLocation().getBlockZ() + 1).setType(Material.STONE_BRICK_SLAB);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() + 3,
					block.getLocation().getBlockZ() - 1).setType(Material.STONE_BRICK_SLAB);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() + 1, block.getLocation().getBlockY() + 3,
					block.getLocation().getBlockZ() - 1).setType(Material.STONE_BRICK_SLAB);
			block.getWorld().getBlockAt(block.getLocation().getBlockX() - 1, block.getLocation().getBlockY() + 3,
					block.getLocation().getBlockZ() + 1).setType(Material.STONE_BRICK_SLAB);

			// DROP ITEMS
			Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
				public void run() {
					player.getWorld().dropItemNaturally(block.getWorld().getBlockAt(block.getLocation().getBlockX(), block.getLocation().getBlockY() + 4,
							block.getLocation().getBlockZ()).getLocation(), new ItemStack(Material.COAL_BLOCK));
				}
			},  20 * 60, 20 * 60);
		}
	}

}
