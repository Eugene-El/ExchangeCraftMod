package lv.eugene.lomashonok.exchangecraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lv.eugene.lomashonok.exchangecraft.handlers.DropHandler;
import lv.eugene.lomashonok.exchangecraft.handlers.FuelHandler;
import lv.eugene.lomashonok.exchangecraft.handlers.RecipeHandler;
import lv.eugene.lomashonok.exchangecraft.inits.ModBlocks;
import lv.eugene.lomashonok.exchangecraft.inits.ModItems;
import lv.eugene.lomashonok.exchangecraft.proxies.CommonProxy;
import lv.eugene.lomashonok.exchangecraft.utils.Util;
import net.minecraftforge.common.MinecraftForge;
import java.util.Random;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ExchangeCraftMod
{
    @Mod.Instance(Reference.MODID)
    public static ExchangeCraftMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    private Random random;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        Util.getLogger().info("Pre initialize started!");
        random = new Random();

        ModItems.init();
        ModItems.register();
        ModBlocks.init();
        ModBlocks.register();
        FuelHandler.register();
        Util.getLogger().info("Pre initialize ended!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        Util.getLogger().info("Initialize");

        proxy.registerRenders();

        RecipeHandler.registerCraftingRecipes();
        RecipeHandler.registerFurnaceRecipes();

        Util.getLogger().info("Initialize ended!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        Util.getLogger().info("Post initialize");

        MinecraftForge.EVENT_BUS.register(new DropHandler(random));

        Util.getLogger().info("Post initialize ended!");
    }


}
