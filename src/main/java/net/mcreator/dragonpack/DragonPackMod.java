/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.dragonpack;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.dragonpack.init.DragonPackModPotions;
import net.mcreator.dragonpack.init.DragonPackModMobEffects;
import net.mcreator.dragonpack.init.DragonPackModItems;
import net.mcreator.dragonpack.init.DragonPackModFluids;
import net.mcreator.dragonpack.init.DragonPackModFeatures;
import net.mcreator.dragonpack.init.DragonPackModEntities;
import net.mcreator.dragonpack.init.DragonPackModEnchantments;
import net.mcreator.dragonpack.init.DragonPackModBlocks;
import net.mcreator.dragonpack.init.DragonPackModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("dragon_pack")
public class DragonPackMod {
	public static final Logger LOGGER = LogManager.getLogger(DragonPackMod.class);
	public static final String MODID = "dragon_pack";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public DragonPackMod() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		DragonPackModBlocks.REGISTRY.register(bus);
		DragonPackModItems.REGISTRY.register(bus);
		DragonPackModEntities.REGISTRY.register(bus);

		DragonPackModFeatures.REGISTRY.register(bus);
		DragonPackModFluids.REGISTRY.register(bus);
		DragonPackModEnchantments.REGISTRY.register(bus);
		DragonPackModMobEffects.REGISTRY.register(bus);
		DragonPackModPotions.REGISTRY.register(bus);
		DragonPackModBiomes.REGISTRY.register(bus);

	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
