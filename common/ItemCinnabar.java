package biochemistry.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCinnabar extends Item {
	public ItemCinnabar(int id) {
		super(id);
		setMaxStackSize(64);
		setIconIndex(3);
		setItemName("Cinnabar Crystal");
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
		
	public String getTextureFile()
	{
	    return CommonProxyBiochemistry.ITEMS_PNG;
	}
}
