package me.darkwinged.CustomItems.Items.Recipes;

import me.darkwinged.CustomItems.Items.Enchanted.EnchantedFarming;
import me.darkwinged.CustomItems.Items.Enchanted.EnchantedLogs;
import me.darkwinged.CustomItems.Items.Orbs.HealthOrbItems;
import me.darkwinged.CustomItems.Main;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

public class HealthOrbs {

    private static Main plugin;

    @SuppressWarnings("deprecation")
    public static void healthorb1Recipe() {
        ItemStack fproduct = HealthOrbItems.HealthOrbTier1();
        RecipeChoice.ExactChoice OakLog = new RecipeChoice.ExactChoice(EnchantedLogs.EnchantedOakLogs());
        RecipeChoice.ExactChoice SpruceLog = new RecipeChoice.ExactChoice(EnchantedLogs.EnchantedSpruceLogs());
        RecipeChoice.ExactChoice BirchLog = new RecipeChoice.ExactChoice(EnchantedLogs.EnchantedBirchLogs());
        RecipeChoice.ExactChoice AcaciaLog = new RecipeChoice.ExactChoice(EnchantedLogs.EnchantedAcaciaLogs());
        RecipeChoice.ExactChoice JungleLog = new RecipeChoice.ExactChoice(EnchantedLogs.EnchantedJungleLogs());
        RecipeChoice.ExactChoice DarkOakLog = new RecipeChoice.ExactChoice(EnchantedLogs.EnchantedDarkOakLogs());
        RecipeChoice.ExactChoice EnchantedApple = new RecipeChoice.ExactChoice(EnchantedFarming.EnchantedApple());
        RecipeChoice.ExactChoice EnchantedHay = new RecipeChoice.ExactChoice(EnchantedFarming.EnchantedHay());
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        recipe.shape("#@#", "@/@", "#@#");
        recipe.setIngredient('#', OakLog);recipe.setIngredient('#', SpruceLog);recipe.setIngredient('#', BirchLog);recipe.setIngredient('#', BirchLog);
        recipe.setIngredient('#', AcaciaLog);recipe.setIngredient('#', JungleLog);recipe.setIngredient('#', DarkOakLog);
        recipe.setIngredient('@', EnchantedApple);
        recipe.setIngredient('/', EnchantedHay);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void healthorb2Recipe() {
        ItemStack fproduct = HealthOrbItems.HealthOrbTier2();
        RecipeChoice.ExactChoice exactChoice = new RecipeChoice.ExactChoice(HealthOrbItems.HealthOrbTier1());
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        recipe.shape("###", "###", "###");
        recipe.setIngredient('#', exactChoice);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void healthorb3Recipe() {
        ItemStack fproduct = HealthOrbItems.HealthOrbTier3();
        RecipeChoice.ExactChoice exactChoice = new RecipeChoice.ExactChoice(HealthOrbItems.HealthOrbTier2());
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        recipe.shape("###", "###", "###");
        recipe.setIngredient('#', exactChoice);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void healthorb4Recipe() {
        ItemStack fproduct = HealthOrbItems.HealthOrbTier4();
        RecipeChoice.ExactChoice exactChoice = new RecipeChoice.ExactChoice(HealthOrbItems.HealthOrbTier3());
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        recipe.shape("###", "###", "###");
        recipe.setIngredient('#', exactChoice);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void healthorb5Recipe() {
        ItemStack fproduct = HealthOrbItems.HealthOrbTier5();
        RecipeChoice.ExactChoice exactChoice = new RecipeChoice.ExactChoice(HealthOrbItems.HealthOrbTier4());
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        recipe.shape("###", "###", "###");
        recipe.setIngredient('#', exactChoice);
        plugin.getServer().addRecipe(recipe);
    }

}
