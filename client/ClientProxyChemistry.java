package Chemistry.client;

import net.minecraftforge.client.MinecraftForgeClient;
import Chemistry.common.*;

public class ClientProxyChemistry extends CommonProxyChemistry {
	 @Override
	    public void registerRenderThings()
	    {
		 	//load texture files
		 	MinecraftForgeClient.preloadTexture(ORES_PNG);
		 	MinecraftForgeClient.preloadTexture(ITEMS_PNG);
	    }
}
