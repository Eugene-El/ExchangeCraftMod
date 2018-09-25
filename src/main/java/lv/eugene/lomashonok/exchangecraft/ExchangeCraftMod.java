package lv.eugene.lomashonok.exchangecraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import lv.eugene.lomashonok.exchangecraft.inits.FuelHandler;
import lv.eugene.lomashonok.exchangecraft.inits.ModBlocks;
import lv.eugene.lomashonok.exchangecraft.inits.ModItems;
import lv.eugene.lomashonok.exchangecraft.proxies.CommonProxy;
import lv.eugene.lomashonok.exchangecraft.utils.Util;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ExchangeCraftMod
{
    @Mod.Instance(Reference.MODID)
    public static ExchangeCraftMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        Util.getLogger().info("Pre initialize started!");

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


        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cobblestoneBrick, 4), new Object[]{Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone});
        GameRegistry.addRecipe(new ItemStack(ModItems.absorbFuel, 1), new Object[] {
                "PPP", "PCP", "PPP", 'P', Items.stick, 'C', new ItemStack(Items.coal, 1, 1)
        });

        Util.getLogger().info("Initialize ended!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        Util.getLogger().info("Post initialize");

        Util.getLogger().info("Post initialize ended!");
    }


}
