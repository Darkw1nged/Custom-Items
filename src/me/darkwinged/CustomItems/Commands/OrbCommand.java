package me.darkwinged.CustomItems.Commands;

import me.darkwinged.CustomItems.Items.Orbs.DamageOrbsItems;
import me.darkwinged.CustomItems.Items.Orbs.HealthOrbItems;
import me.darkwinged.CustomItems.Items.Orbs.MiningOrbsItems;
import me.darkwinged.CustomItems.Items.Orbs.VelocityOrbsItems;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.darkwinged.CustomItems.Main;
import me.darkwinged.CustomItems.Utils.Utils;

public class OrbCommand implements CommandExecutor {
	
	private Main plugin;
	public OrbCommand(Main plugin) { this.plugin = plugin; }

	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
	    if (cmd.getName().equalsIgnoreCase("orb")) {
	      if (!(sender instanceof Player)) return true;
	      Player player = (Player)sender;
	      if (player.hasPermission("CustomItems.orbs") || player.hasPermission("CustomItems.*")) {
	        if (args.length != 2) {
	          player.sendMessage(Utils.chat("&4Error! Usage: /orb <orb> <tier>"));
	          return true;
	        } 
	        if (args[0].equalsIgnoreCase("health")) {
	          if (args[1].equalsIgnoreCase("1")) {
	            player.getInventory().addItem(HealthOrbItems.HealthOrbTier1());
	          } else if (args[1].equalsIgnoreCase("2")) {
	            player.getInventory().addItem(HealthOrbItems.HealthOrbTier2());
	          } else if (args[1].equalsIgnoreCase("3")) {
	            player.getInventory().addItem(HealthOrbItems.HealthOrbTier3());
	          } else if (args[1].equalsIgnoreCase("4")) {
	            player.getInventory().addItem(HealthOrbItems.HealthOrbTier4());
	          } else if (args[1].equalsIgnoreCase("5")) {
	            player.getInventory().addItem(HealthOrbItems.HealthOrbTier5());
	          } else {
	            player.sendMessage(Utils.chat("&4Error! Usage: /orb health <tier 1-5>"));
	          } 
	        } else if (args[0].equalsIgnoreCase("damage")) {
	          if (args[1].equalsIgnoreCase("1")) {
	            player.getInventory().addItem(DamageOrbsItems.DamageOrbTier1());
	          } else if (args[1].equalsIgnoreCase("2")) {
	            player.getInventory().addItem(DamageOrbsItems.DamageOrbTier2());
	          } else if (args[1].equalsIgnoreCase("3")) {
	            player.getInventory().addItem(DamageOrbsItems.DamageOrbTier3());
	          } else if (args[1].equalsIgnoreCase("4")) {
	            player.getInventory().addItem(DamageOrbsItems.DamageOrbTier4());
	          } else if (args[1].equalsIgnoreCase("5")) {
	            player.getInventory().addItem(DamageOrbsItems.DamageOrbTier5());
	          } else {
	            player.sendMessage(Utils.chat("&4Error! Usage: /orb damage <tier 1-5>"));
	          } 
	        } else if (args[0].equalsIgnoreCase("mining")) {
	          if (args[1].equalsIgnoreCase("1")) {
	            player.getInventory().addItem(MiningOrbsItems.MiningOrbTier1());
	          } else if (args[1].equalsIgnoreCase("2")) {
	            player.getInventory().addItem(MiningOrbsItems.MiningOrbTier2());
	          } else if (args[1].equalsIgnoreCase("3")) {
	            player.getInventory().addItem(MiningOrbsItems.MiningOrbTier3());
	          } else {
	            player.sendMessage(Utils.chat("&4Error! Usage: /orb mining <tier 1-3>"));
	          } 
	        } else if (args[0].equalsIgnoreCase("speed")) {
	          if (args[1].equalsIgnoreCase("1")) {
	            player.getInventory().addItem(VelocityOrbsItems.VelocityOrbTier1());
	          } else if (args[1].equalsIgnoreCase("2")) {
	            player.getInventory().addItem(VelocityOrbsItems.VelocityOrbTier2());
	          } else if (args[1].equalsIgnoreCase("3")) {
	            player.getInventory().addItem(VelocityOrbsItems.VelocityOrbTier3());
	          } else {
	            player.sendMessage(Utils.chat("&4Error! Usage: /orb speed <tier 1-3>"));
	          } 
	        } 
	      } 
	    } 
	    return true;
	  }

}
