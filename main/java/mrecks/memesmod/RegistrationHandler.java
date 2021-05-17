package mrecks.memesmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import mrecks.memesmod.util.RegistryUtil;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = MemesMod.MODID)
public class RegistrationHandler {
		
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				RegistryUtil.setItemName(new Item(), "ung_stick").setCreativeTab(CreativeTabs.MISC)
		};
		event.getRegistry().registerAll(items);
	}
}
