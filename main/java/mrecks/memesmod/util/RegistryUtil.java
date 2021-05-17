package mrecks.memesmod.util;

import mrecks.memesmod.MemesMod;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegistryUtil {
	@SubscribeEvent
	public static Item setItemName(final Item item, final String name) {
				item.setRegistryName(MemesMod.MODID, name).setUnlocalizedName(MemesMod.MODID + "."+name);
				return item;
		};
	public static Block setBlockName(final Block block, final String name) {
		block.setRegistryName(MemesMod.MODID, name).setUnlocalizedName(MemesMod.MODID+"."+name);
		return block;

	}
}
