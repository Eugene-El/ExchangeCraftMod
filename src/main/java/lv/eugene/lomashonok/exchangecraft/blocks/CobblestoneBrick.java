package lv.eugene.lomashonok.exchangecraft.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CobblestoneBrick extends Block {

    public CobblestoneBrick(String unlocalizedName) {
        super(Material.rock);
        this.setBlockName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(10F);
        this.setResistance(7F);
        this.setHarvestLevel("pickaxe", 1);
    }




}
