package Chemistry.common;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlockSaltOre extends Block {

	public BlockSaltOre(int id, int texture)
	{
		super(id, texture, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3.0f);
	}
	
	public String getTextureFile()
    {
            return CommonProxyChemistry.ORES_PNG;
    }
	
	public int idDropped(int par1, Random random, int zero) {
        return ModChemistry.salt.shiftedIndex;
}

}
