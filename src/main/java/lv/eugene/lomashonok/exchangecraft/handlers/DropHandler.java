package lv.eugene.lomashonok.exchangecraft.handlers;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import lv.eugene.lomashonok.exchangecraft.inits.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

import java.util.Random;

public class DropHandler {

    // Constructor
    public DropHandler(Random rand)
    {
        random = rand;
    }

    private Random random;

    // Harvest event
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEvent(BlockEvent.HarvestDropsEvent event)
    {

        if(event.block == Blocks.log)
        {
            event.drops.add(new ItemStack(ModItems.woodResin, random.nextInt(2)));
        }

    }
}
