package lv.eugene.lomashonok.exchangecraft.inits;

import cpw.mods.fml.common.registry.GameRegistry;
import lv.eugene.lomashonok.exchangecraft.Reference;
import lv.eugene.lomashonok.exchangecraft.items.AbsorbFuel;
import lv.eugene.lomashonok.exchangecraft.utils.Util;
import net.minecraft.item.Item;

public class ModItems {

    public static Item absorbFuel;

    public static void init() {
        absorbFuel = new AbsorbFuel("AbsorbFuel");


    }

    public static void register() {

        registerItem(absorbFuel);

    }

    public static void registerRenders() {

        registerRender(absorbFuel);
    }

    public static void registerItem(Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
        Util.getLogger().info("Registered item: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {

        item.setTextureName(Reference.MODID + ":" + item.getUnlocalizedName().substring(5));
    }

}
