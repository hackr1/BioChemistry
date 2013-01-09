package Chemistry.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.*;

@Mod(modid = "hackr1_chemistry", name = "Chemistry", version = "1.0 Hydrogen")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ModChemistry 
{
	// proxy things
	@SidedProxy(clientSide = "Chemistry.client.ClientProxyChemistry", serverSide = "Chemistry.common.CommonProxyChemistry")
	public static CommonProxyChemistry proxy;
	
	//block definitions
	public static Block saltOre;
	public static Block platinumOre;
	
	//item definitions
	public static Item salt;
	public static Item platinum;
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		//proxy things again...
		proxy.registerRenderThings();
		
		//block definition again...
		saltOre = new BlockSaltOre(250, 0).setBlockName("Salt Ore)");
		platinumOre = new BlockPlatinumOre(251, 1).setBlockName("Platinum Ore");
		
		//item definitions again...
		 salt = new ItemSalt(5000);
		 platinum = new ItemPlatinum(5001);
		
		//registering blocks and items
		GameRegistry.registerBlock(saltOre);
		GameRegistry.registerBlock(platinumOre);
		GameRegistry.registerItem(salt, "Salt");
		GameRegistry.registerItem(platinum, "Platinum");
		
		//registering names
		LanguageRegistry.addName(saltOre, "Salt Ore");
		LanguageRegistry.addName(platinumOre, "Platinum Ore");
		LanguageRegistry.addName(salt, "Salt (NaCl)");
		LanguageRegistry.addName(platinum, "Platinum Ingot (Pt)");
		
		//adding smelting recipes
		GameRegistry.addSmelting(platinumOre.blockID, new ItemStack(platinum), 1.0f);
	}
	


}
