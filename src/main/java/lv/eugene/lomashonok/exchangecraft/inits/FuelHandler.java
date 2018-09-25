package lv.eugene.lomashonok.exchangecraft.inits;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {

    public static void register() {

        GameRegistry.registerFuelHandler(new FuelHandler());

    }

    @Override
    public int getBurnTime(ItemStack fuel) {

        if (fuel.getItem() == ModItems.absorbFuel)
            return 2000;

        return 0;
    }

}
