package Chemistry.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLead extends Item {
	public ItemLead(int id) {
		super(id);
		setMaxStackSize(64);
		setIconIndex(2);
		setItemName("Lead Ingot");
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
		
	public String getTextureFile()
	{
	    return CommonProxyChemistry.ITEMS_PNG;
	}
}
