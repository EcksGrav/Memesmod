package mrecks.memesmod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = MemesMod.MODID, name = MemesMod.NAME, version = MemesMod.VERSION, acceptedMinecraftVersions = MemesMod.MC_VERSION)
public class MemesMod {
	
	public static final String MODID = "memesmod";
	public static final String NAME = "Memes Chat Mod";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final Logger LOGGER = LogManager.getLogger(MemesMod.MODID);
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(MemesMod.NAME + "Pham thinks is working");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        
	}
}
