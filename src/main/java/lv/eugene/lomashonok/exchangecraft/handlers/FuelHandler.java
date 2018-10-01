package lv.eugene.lomashonok.exchangecraft.handlers;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import lv.eugene.lomashonok.exchangecraft.inits.ModItems;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {

    public static void register() {

        GameRegistry.registerFuelHandler(new FuelHandler());

    }

    @Override
    public int getBurnTime(ItemStack fuel) {

        if (fuel.getItem() == ModItems.absorbFuel)
            return 2000;
        if (fuel.getItem() == ModItems.woodResin)
            return 400;

        return 0;
    }

}
