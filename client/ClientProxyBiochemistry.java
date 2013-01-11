package biochemistry.client;

import biochemistry.common.*;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyBiochemistry extends CommonProxyBiochemistry {
	 @Override
	    public void registerRenderThings()
	    {
		 	//load texture files
		 	MinecraftForgeClient.preloadTexture(ORES_PNG);
		 	MinecraftForgeClient.preloadTexture(ITEMS_PNG);
	    }
}
