package lv.eugene.lomashonok.exchangecraft.inits;


import cpw.mods.fml.common.registry.GameRegistry;
import lv.eugene.lomashonok.exchangecraft.Reference;
import lv.eugene.lomashonok.exchangecraft.blocks.CobblestoneBrick;
import lv.eugene.lomashonok.exchangecraft.utils.Util;
import net.minecraft.block.Block;

public class ModBlocks {

    public static Block cobblestoneBrick;

    public static void init() {

        cobblestoneBrick = new CobblestoneBrick("CobblestoneBrick");

    }

    public static void register() {
        registerBlock(cobblestoneBrick);
    }

    public static void registerRenders() {
        registerRender(cobblestoneBrick);
    }

    public static void registerBlock(Block block) {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
        Util.getLogger().info("Registered block: " + block.getUnlocalizedName().substring(5));

    }

    public static void registerRender(Block block) {
        block.setBlockTextureName(Reference.MODID + ":" + block.getUnlocalizedName().substring(5));
    }

}
