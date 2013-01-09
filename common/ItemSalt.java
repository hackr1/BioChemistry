package Chemistry.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSalt extends Item {

	public ItemSalt(int id) {
		super(id);
		setMaxStackSize(64);
		setIconIndex(0);
		setItemName("Salt");
	}
	
	public String getTextureFile()
    {
            return CommonProxyChemistry.ITEMS_PNG;
    }
	
	

}
