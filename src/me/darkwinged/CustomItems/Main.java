package me.darkwinged.CustomItems;

import me.darkwinged.CustomItems.Commands.SetGUICommand;
import me.darkwinged.CustomItems.Events.*;
import me.darkwinged.CustomItems.Events.Sets.AddItems;
import me.darkwinged.CustomItems.Events.Sets.ItemBreak;
import me.darkwinged.CustomItems.Events.Sets.MenuListener;
import me.darkwinged.CustomItems.Items.Recipes.Armor;
import me.darkwinged.CustomItems.Items.Recipes.EnchantedLogsRecipe;
import me.darkwinged.CustomItems.Items.Recipes.HealthOrbs;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import me.darkwinged.CustomItems.Commands.GeneratorsCommand;
import me.darkwinged.CustomItems.Commands.OrbCommand;
import me.darkwinged.CustomItems.Commands.ToolsCommand;

public class Main extends JavaPlugin {

    private static Economy econ = null;

    public void onEnable() {
        registerCommands();
        registerEvents();
        registerRecipes();
        if (!setupEconomy() ) {
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
    }

    public void registerCommands() {
        getCommand("orb").setExecutor(new OrbCommand(this));
        getCommand("tools").setExecutor(new ToolsCommand(this));
        getCommand("generator").setExecutor(new GeneratorsCommand());
        getCommand("sets").setExecutor(new SetGUICommand(this));
    }

    public void registerEvents() {
        getServer().getPluginManager().registerEvents(new AntiEnchant(), this);
        getServer().getPluginManager().registerEvents(new FarmerBoots(), this);
        getServer().getPluginManager().registerEvents(new HarvesterAxeTool(), this);
        getServer().getPluginManager().registerEvents(new HarvesterShears(), this);
        getServer().getPluginManager().registerEvents(new ArmorEvent(this), this);
        getServer().getPluginManager().registerEvents(new OrbsEvent(this), this);
        getServer().getPluginManager().registerEvents(new ReplantTool(this), this);
        getServer().getPluginManager().registerEvents(new MenuListener(this), this);
        getServer().getPluginManager().registerEvents(new GeneratorEvent(this), this);
        getServer().getPluginManager().registerEvents(new AddItems(), this);
    }

    public void registerRecipes() {
        EnchantedLogsRecipe.EnchantedOakLogsRecipe();
        EnchantedLogsRecipe.EnchantedSpruceLogsRecipe();
        EnchantedLogsRecipe.EnchantedBirchLogsRecipe();
        EnchantedLogsRecipe.EnchantedJungleLogsRecipe();
        EnchantedLogsRecipe.EnchantedAcaciaLogsRecipe();
        EnchantedLogsRecipe.EnchantedDarkOakLogsRecipe();

        HealthOrbs.healthorb1Recipe();
        HealthOrbs.healthorb2Recipe();
        HealthOrbs.healthorb3Recipe();
        HealthOrbs.healthorb4Recipe();
        HealthOrbs.healthorb5Recipe();

        Armor.MinerHelmetRecipe();
        Armor.MinerChestplateRecipe();
        Armor.MinerLeggingsRecipe();
        Armor.MinerBootsRecipe();
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    public static Economy getEconomy() {
        return econ;
    }

}