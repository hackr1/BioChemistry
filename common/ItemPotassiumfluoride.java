package biochemistry.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPotassiumfluoride extends Item {
	public ItemPotassiumfluoride(int id) {
		super(id);
		setMaxStackSize(64);
		setIconIndex(0);
		setItemName("Potassium Fluoride");
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
		
	public String getTextureFile()
	{
	    return CommonProxyBiochemistry.ITEMS_PNG;
	}
}
