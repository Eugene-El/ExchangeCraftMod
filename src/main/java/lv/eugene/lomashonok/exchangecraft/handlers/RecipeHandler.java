package lv.eugene.lomashonok.exchangecraft.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import lv.eugene.lomashonok.exchangecraft.inits.ModBlocks;
import lv.eugene.lomashonok.exchangecraft.inits.ModItems;
import lv.eugene.lomashonok.exchangecraft.utils.Util;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeHandler {

    public static void registerCraftingRecipes() {

        // Cobblestone Brick
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cobblestoneBrick, 4), new Object[]{Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone});

        // Absorb Fuel
        GameRegistry.addRecipe(new ItemStack(ModItems.absorbFuel, 1), new Object[] {
                " P ",
                "WCW",
                " P ",
                'P', Items.stick, 'C', new ItemStack(Items.coal, 1, 1), 'W', ModItems.woodResin
        });


        Util.getLogger().info("Registered crafting recipes!");
    }

    public static void registerFurnaceRecipes() {


        Util.getLogger().info("Registered furnace recipes!");
    }

}
