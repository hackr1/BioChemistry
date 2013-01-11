package biochemistry.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.*;

@Mod(modid = "biochemistry", name = "BioChemistry", version = "1.0 Hydrogen")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ModBiochemistry 
{
	// proxy things
	@SidedProxy(clientSide = "biochemistry.client.ClientProxyBiochemistry", serverSide = "biochemistry.common.CommonProxyBiochemistry")
	public static CommonProxyBiochemistry proxy;
	
	//block definitions
	public static Block saltOre;
	public static Block platinumOre;
	public static Block leadOre;
	
	//item definitions
	public static Item salt;
	public static Item platinum;
	public static Item lead;
	
	//the config
	public static Configuration config;
	
	
	 @PreInit
     public void preInit(FMLPreInitializationEvent event) {
             config = new Configuration(event.getSuggestedConfigurationFile());
             config.load();
             
             Property someproperty = config.get("developer", "enable_config_check", true);
             someproperty.comment = "(Dev) Enable if the properties should be reloaded before initializing the mod";
             if(someproperty.getBoolean(true)){
            	 config.load();
             }
             
     }
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		config.save();
		
		//proxy things again...
		proxy.registerRenderThings();
		
		//block definition again...
		saltOre = new BlockSaltOre(config.get(Configuration.CATEGORY_BLOCK, "id_SaltOre", 250).getInt(), 0).setBlockName("Salt Ore)");
		platinumOre = new BlockPlatinumOre(config.get(Configuration.CATEGORY_BLOCK, "id_PlatinumOre", 251).getInt(), 1).setBlockName("Platinum Ore");
		leadOre = new BlockLeadOre(config.get(Configuration.CATEGORY_BLOCK, "id_LeadOre", 252).getInt(), 2).setBlockName("Lead Ore");
		
		//item definitions again...
		 salt = new ItemSalt(config.get(Configuration.CATEGORY_ITEM, "id_Salt", 5000).getInt());
		 platinum = new ItemPlatinum(config.get(Configuration.CATEGORY_ITEM, "id_ingotPlatinum", 5001).getInt());
		 lead = new ItemLead(config.get(Configuration.CATEGORY_ITEM, "id_ingotLead", 5002).getInt());
		
		//registering blocks and items
		GameRegistry.registerBlock(saltOre);
		GameRegistry.registerBlock(platinumOre);
		GameRegistry.registerBlock(leadOre);
		GameRegistry.registerItem(salt, "Salt");
		GameRegistry.registerItem(platinum, "Platinum");
		
		//registering names
		LanguageRegistry.addName(saltOre, "Salt Ore");
		LanguageRegistry.addName(platinumOre, "Platinum Ore");
		LanguageRegistry.addName(leadOre, "Lead Ore");
		LanguageRegistry.addName(salt, "Salt (NaCl)");
		LanguageRegistry.addName(platinum, "Platinum Ingot (Pt)");
		
		//adding smelting recipes
		GameRegistry.addSmelting(platinumOre.blockID, new ItemStack(platinum), 1.0f);
		GameRegistry.addSmelting(leadOre.blockID, new ItemStack(lead), 0.3f);
		
		//adding items to the ore Dictionary
		OreDictionary.registerOre("oreSalt", new ItemStack(saltOre));
		OreDictionary.registerOre("orePlatinum", new ItemStack(platinumOre));
		OreDictionary.registerOre("oreLead", new ItemStack(leadOre));
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(platinum));
		OreDictionary.registerOre("ingotLead", new ItemStack(lead));
		
		//save config
		config.save();
	}
	


}