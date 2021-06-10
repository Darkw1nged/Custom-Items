package me.darkwinged.CustomItems.Commands;

import me.darkwinged.CustomItems.Items.Generator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GeneratorsCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
		if (cmd.getName().equalsIgnoreCase("generator")) {
			if (!(sender instanceof Player)) return true;
		    Player player = (Player)sender;
		    if (player.hasPermission("CustomItems.generator") || player.hasPermission("CustomItems.*")) {
		    	player.getInventory().addItem(Generator.Coal());
		    }
		}
		return true;
	}
	
}
