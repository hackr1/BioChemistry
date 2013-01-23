package biochemistry.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockCarobiiteOre extends Block{
	public BlockCarobiiteOre(int id, int texture)
	{
		super(id, texture, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2.5f);
	}
	
	public String getTextureFile()
    {
            return CommonProxyBiochemistry.ORES_PNG;
    }
	
	public int idDropped(int par1, Random random, int zero) {
		return ModBiochemistry.potassiumfluoride.shiftedIndex;
	}
}
