package biochemistry.common;

import java.util.Random;

import net.minecraft.world.*;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGenerator implements IWorldGenerator {
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
	switch (world.provider.dimensionId)
	{
	case -1: generateNether(world, random, chunkX*16, chunkZ*16);
	case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
	}
	}



	private void generateSurface(World world, Random random, int blockX, int blockZ) 
	{
		//generate 20 veins of cinnabar ore per chunk (in layers 1-60)
		for (int i = 0; i < 30; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(60);
			int Zcoord = blockZ + random.nextInt(16);
			(new WorldGenMinable(ModBiochemistry.cinnabarOre.blockID, 5)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		//generate 3 veins of platinum ore per chunk (in layers 1-64)
		for (int i = 0; i < 3; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(64);
			int Zcoord = blockZ + random.nextInt(16);
			(new WorldGenMinable(ModBiochemistry.platinumOre.blockID, 5)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		//generate 20 veins of lead ore per chunk (in layers 1-48)
		for (int i = 0; i < 20; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(48);
			int Zcoord = blockZ + random.nextInt(16);
			(new WorldGenMinable(ModBiochemistry.leadOre.blockID, 5)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		//generate 6 big veins of salt ore per chunk (in layers 1-64)
		for (int i = 0; i < 6; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(64);
			int Zcoord = blockZ + random.nextInt(16);
			(new WorldGenMinable(ModBiochemistry.saltOre.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
	}

	private void generateNether(World world, Random random, int blockX, int blockZ) 
	{

	}




}
