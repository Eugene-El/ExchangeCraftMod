package lv.eugene.lomashonok.exchangecraft.proxies;

import lv.eugene.lomashonok.exchangecraft.inits.ModBlocks;
import lv.eugene.lomashonok.exchangecraft.inits.ModItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {

        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}
