package biochemistry.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSalt extends Item {

	public ItemSalt(int id) {
		super(id);
		setMaxStackSize(64);
		setIconIndex(0);
		setItemName("Salt");
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public String getTextureFile()
    {
            return CommonProxyBiochemistry.ITEMS_PNG;
    }
	
	

}
