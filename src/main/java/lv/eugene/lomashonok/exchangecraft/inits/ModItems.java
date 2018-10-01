package lv.eugene.lomashonok.exchangecraft.inits;

import cpw.mods.fml.common.registry.GameRegistry;
import lv.eugene.lomashonok.exchangecraft.Reference;
import lv.eugene.lomashonok.exchangecraft.items.AbsorbFuel;
import lv.eugene.lomashonok.exchangecraft.items.WoodResin;
import lv.eugene.lomashonok.exchangecraft.utils.Util;
import net.minecraft.item.Item;

public class ModItems {

    public static Item absorbFuel;
    public static Item woodResin;

    public static void init() {
        absorbFuel = new AbsorbFuel("AbsorbFuel");
        woodResin = new WoodResin("WoodResin");

    }

    public static void register() {

        registerItem(absorbFuel);
        registerItem(woodResin);

    }

    public static void registerRenders() {

        registerRender(absorbFuel);
        registerRender(woodResin);
    }

    public static void registerItem(Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
        Util.getLogger().info("Registered item: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {

        item.setTextureName(Reference.MODID + ":" + item.getUnlocalizedName().substring(5));
    }

}
