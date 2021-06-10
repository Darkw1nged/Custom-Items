package me.darkwinged.CustomItems.Items.Recipes;

import me.darkwinged.CustomItems.Items.Enchanted.EnchantedLogs;
import me.darkwinged.CustomItems.Main;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class EnchantedLogsRecipe {

    private static Main plugin;

    @SuppressWarnings("deprecation")
    public static void EnchantedOakLogsRecipe() {
        ItemStack fproduct = EnchantedLogs.EnchantedSpruceLogs();
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        recipe.shape(" / ", "///", " / ");
        recipe.setIngredient('/', Material.OAK_LOG);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void EnchantedSpruceLogsRecipe() {
        ItemStack fproduct = EnchantedLogs.EnchantedSpruceLogs();
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        recipe.shape(" / ", "///", " / ");
        recipe.setIngredient('/', Material.SPRUCE_LOG);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void EnchantedBirchLogsRecipe() {
        ItemStack fproduct = EnchantedLogs.EnchantedBirchLogs();
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        recipe.shape(" / ", "///", " / ");
        recipe.setIngredient('/', Material.BIRCH_LOG);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void EnchantedJungleLogsRecipe() {
        ItemStack fproduct = EnchantedLogs.EnchantedJungleLogs();
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        recipe.shape(" / ", "///", " / ");
        recipe.setIngredient('/', Material.JUNGLE_LOG);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void EnchantedAcaciaLogsRecipe() {
        ItemStack fproduct = EnchantedLogs.EnchantedAcaciaLogs();
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        recipe.shape(" / ", "///", " / ");
        recipe.setIngredient('/', Material.ACACIA_LOG);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void EnchantedDarkOakLogsRecipe() {
        ItemStack fproduct = EnchantedLogs.EnchantedDarkOakLogs();
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        recipe.shape(" / ", "///", " / ");
        recipe.setIngredient('/', Material.DARK_OAK_LOG);
        plugin.getServer().addRecipe(recipe);
    }

}
