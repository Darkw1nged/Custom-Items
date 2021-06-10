package me.darkwinged.CustomItems.Items.Recipes;

import me.darkwinged.CustomItems.Items.Enchanted.EnchantedArmor;
import me.darkwinged.CustomItems.Items.Enchanted.EnchantedTools;
import me.darkwinged.CustomItems.Items.Armor.MinerArmor;
import me.darkwinged.CustomItems.Items.Orbs.MiningOrbsItems;
import me.darkwinged.CustomItems.Main;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

public class Armor {

    private static Main plugin;

    @SuppressWarnings("deprecation")
    public static void MinerHelmetRecipe() {
        ItemStack fproduct = MinerArmor.MinerHelmetArmor();
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        RecipeChoice.ExactChoice EnchantedDiamondHelmet = new RecipeChoice.ExactChoice(EnchantedArmor.EnchantedDiamondHelmet());
        RecipeChoice.ExactChoice EnchantedStonePickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedStonePickaxe());
        RecipeChoice.ExactChoice EnchantedIronPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedIronPickaxe());
        RecipeChoice.ExactChoice EnchantedGoldenPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedGoldPickaxe());
        RecipeChoice.ExactChoice EnchantedDiamondPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedDiamondPickaxe());
        RecipeChoice.ExactChoice MiningOrb = new RecipeChoice.ExactChoice(MiningOrbsItems.MiningOrbTier1());
        recipe.shape("GOD",
                     "OHO",
                     "SOI");
        recipe.setIngredient('H', EnchantedDiamondHelmet);
        recipe.setIngredient('S', EnchantedStonePickaxe);
        recipe.setIngredient('I', EnchantedIronPickaxe);
        recipe.setIngredient('G', EnchantedGoldenPickaxe);
        recipe.setIngredient('D', EnchantedDiamondPickaxe);
        recipe.setIngredient('O', MiningOrb);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void MinerChestplateRecipe() {
        ItemStack fproduct = MinerArmor.MinerChestplateArmor();
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        RecipeChoice.ExactChoice EnchantedDiamondChestplate = new RecipeChoice.ExactChoice(EnchantedArmor.EnchantedDiamondChestPlate());
        RecipeChoice.ExactChoice EnchantedStonePickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedStonePickaxe());
        RecipeChoice.ExactChoice EnchantedIronPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedIronPickaxe());
        RecipeChoice.ExactChoice EnchantedGoldenPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedGoldPickaxe());
        RecipeChoice.ExactChoice EnchantedDiamondPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedDiamondPickaxe());
        RecipeChoice.ExactChoice MiningOrb = new RecipeChoice.ExactChoice(MiningOrbsItems.MiningOrbTier1());
        recipe.shape("GOD",
                     "OCO",
                     "SOI");
        recipe.setIngredient('C', EnchantedDiamondChestplate);
        recipe.setIngredient('S', EnchantedStonePickaxe);
        recipe.setIngredient('I', EnchantedIronPickaxe);
        recipe.setIngredient('G', EnchantedGoldenPickaxe);
        recipe.setIngredient('D', EnchantedDiamondPickaxe);
        recipe.setIngredient('O', MiningOrb);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void MinerLeggingsRecipe() {
        ItemStack fproduct = MinerArmor.MinerLeggingsArmor();
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        RecipeChoice.ExactChoice EnchantedDiamondLeggings = new RecipeChoice.ExactChoice(EnchantedArmor.EnchantedDiamondLeggings());
        RecipeChoice.ExactChoice EnchantedStonePickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedStonePickaxe());
        RecipeChoice.ExactChoice EnchantedIronPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedIronPickaxe());
        RecipeChoice.ExactChoice EnchantedGoldenPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedGoldPickaxe());
        RecipeChoice.ExactChoice EnchantedDiamondPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedDiamondPickaxe());
        RecipeChoice.ExactChoice MiningOrb = new RecipeChoice.ExactChoice(MiningOrbsItems.MiningOrbTier1());
        recipe.shape("GOD",
                "OLO",
                "SOI");
        recipe.setIngredient('L', EnchantedDiamondLeggings);
        recipe.setIngredient('S', EnchantedStonePickaxe);
        recipe.setIngredient('I', EnchantedIronPickaxe);
        recipe.setIngredient('G', EnchantedGoldenPickaxe);
        recipe.setIngredient('D', EnchantedDiamondPickaxe);
        recipe.setIngredient('O', MiningOrb);
        plugin.getServer().addRecipe(recipe);
    }

    @SuppressWarnings("deprecation")
    public static void MinerBootsRecipe() {
        ItemStack fproduct = MinerArmor.MinerBootsArmor();
        ShapedRecipe recipe = new ShapedRecipe(fproduct);
        RecipeChoice.ExactChoice EnchantedDiamondBoots = new RecipeChoice.ExactChoice(EnchantedArmor.EnchantedDiamondBoots());
        RecipeChoice.ExactChoice EnchantedStonePickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedStonePickaxe());
        RecipeChoice.ExactChoice EnchantedIronPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedIronPickaxe());
        RecipeChoice.ExactChoice EnchantedGoldenPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedGoldPickaxe());
        RecipeChoice.ExactChoice EnchantedDiamondPickaxe = new RecipeChoice.ExactChoice(EnchantedTools.EnchantedDiamondPickaxe());
        RecipeChoice.ExactChoice MiningOrb = new RecipeChoice.ExactChoice(MiningOrbsItems.MiningOrbTier1());
        recipe.shape("GOD",
                "OBO",
                "SOI");
        recipe.setIngredient('B', EnchantedDiamondBoots);
        recipe.setIngredient('S', EnchantedStonePickaxe);
        recipe.setIngredient('I', EnchantedIronPickaxe);
        recipe.setIngredient('G', EnchantedGoldenPickaxe);
        recipe.setIngredient('D', EnchantedDiamondPickaxe);
        recipe.setIngredient('O', MiningOrb);
        plugin.getServer().addRecipe(recipe);
    }
}
