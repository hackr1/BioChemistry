package biochemistry.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLeadOre extends Block {

	public BlockLeadOre(int id, int texture)
	{
		super(id, texture, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2.6f);
	}
	
	public String getTextureFile()
    {
            return CommonProxyBiochemistry.ORES_PNG;
    }

}
