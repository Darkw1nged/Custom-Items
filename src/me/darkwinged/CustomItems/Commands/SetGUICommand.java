package me.darkwinged.CustomItems.Commands;

import me.darkwinged.CustomItems.Main;
import me.darkwinged.CustomItems.Sets.menus.PlayerMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetGUICommand implements CommandExecutor {

	private Main plugin;
	public SetGUICommand(Main plugin) { this.plugin = plugin; }
	
	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
	    if (cmd.getName().equalsIgnoreCase("sets")) {
	      if (!(sender instanceof Player))
	        return true; 
	      Player player = (Player)sender;
	      PlayerMenu playerMenu = new PlayerMenu(player, plugin);
	      player.openInventory(playerMenu.getInventory());
	    } 
	    return true;
	  }
	
}
