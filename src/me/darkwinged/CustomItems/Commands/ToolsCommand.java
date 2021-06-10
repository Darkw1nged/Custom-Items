package me.darkwinged.CustomItems.Commands;

import me.darkwinged.CustomItems.Items.Armor.MinerArmor;
import me.darkwinged.CustomItems.Items.Armor.ZelocksArmor;
import me.darkwinged.CustomItems.Items.Tools;
import me.darkwinged.CustomItems.Main;
import me.darkwinged.CustomItems.Utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ToolsCommand implements CommandExecutor {

	private Main plugin;
	public ToolsCommand(Main plugin) { this.plugin = plugin; }
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
		if (cmd.getName().equalsIgnoreCase("tools")) {
			if (!(sender instanceof Player));
		    	Player player = (Player)sender;
		    	if (player.hasPermission("CustomItems.tools") || player.hasPermission("CustomItems.*")) {
		    		if (args.length < 1) {
		    			player.sendMessage(Utils.chat("&4Error! Usage: /tools <tool>"));
		    			return true;
		    		} 
		    		if (args[0].equalsIgnoreCase("fboots")) {
		    			player.getInventory().addItem(Tools.FarmingBoots());
		    		} else if (args[0].equalsIgnoreCase("shears")) {
		    			player.getInventory().addItem(Tools.HarvesterShears());
		    		} else if (args[0].equalsIgnoreCase("replant")) {
		    			player.getInventory().addItem(Tools.ReplantTool());
		    		} else if (args[0].equalsIgnoreCase("mining")) {
		    			if (args[1].equalsIgnoreCase("helmet")) {
		    				player.getInventory().addItem(MinerArmor.MinerHelmetArmor());
		    			} else if (args[1].equalsIgnoreCase("chestplate")) {
		    				player.getInventory().addItem(MinerArmor.MinerChestplateArmor());
		    			} else if (args[1].equalsIgnoreCase("leggings")) {
		    				player.getInventory().addItem(MinerArmor.MinerLeggingsArmor());
		    			} else if (args[1].equalsIgnoreCase("boots")) {
		    				player.getInventory().addItem(MinerArmor.MinerBootsArmor());
		    			} 
		    		} else if (args[0].equalsIgnoreCase("zelok")) {
						if (args[1].equalsIgnoreCase("helmet")) {
							player.getInventory().addItem(ZelocksArmor.ZelocksHelmetArmor());
						} else if (args[1].equalsIgnoreCase("chestplate")) {
							player.getInventory().addItem(ZelocksArmor.ZelocksChestplateArmor());
						} else if (args[1].equalsIgnoreCase("leggings")) {
							player.getInventory().addItem(ZelocksArmor.ZelocksLeggingsArmor());
						} else if (args[1].equalsIgnoreCase("boots")) {
							player.getInventory().addItem(ZelocksArmor.ZelocksBootsArmor());
						}
					}else if (args[0].equalsIgnoreCase("axe")) {
		    			player.getInventory().addItem(Tools.HarvesterAxe());
		    		}
		    	} 
			} 
		return true;
	}
}
