
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.dragonpack.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DragonPackModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.FLETCHER) {
			trades.get(5).add(new BasicItemListing(new ItemStack(Blocks.LIME_CANDLE_CAKE, 7),

					new ItemStack(Items.EMERALD, 5), 10, 55, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(Items.DEBUG_STICK),

					new ItemStack(Items.EMERALD, 5), 10, 5, 0.05f));
		}
	}
}
