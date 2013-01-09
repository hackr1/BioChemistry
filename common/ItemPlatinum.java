package Chemistry.common;

import net.minecraft.item.Item;

public class ItemPlatinum extends Item {
	public ItemPlatinum(int id) {
		super(id);
		setMaxStackSize(64);
		setIconIndex(1);
		setItemName("Platinum");
	}
	
	public String getTextureFile()
    {
            return CommonProxyChemistry.ITEMS_PNG;
    }
}
