
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonpack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dragonpack.item.WoodenStaffItem;
import net.mcreator.dragonpack.item.WOODItem;
import net.mcreator.dragonpack.item.ThunderItem;
import net.mcreator.dragonpack.item.ThunderFistItem;
import net.mcreator.dragonpack.item.StickOfWaterItem;
import net.mcreator.dragonpack.item.Electric_ingotSwordItem;
import net.mcreator.dragonpack.item.Electric_ingotShovelItem;
import net.mcreator.dragonpack.item.Electric_ingotPickaxeItem;
import net.mcreator.dragonpack.item.Electric_ingotIngotItem;
import net.mcreator.dragonpack.item.Electric_ingotHoeItem;
import net.mcreator.dragonpack.item.Electric_ingotAxeItem;
import net.mcreator.dragonpack.item.Electric_ingotArmorItem;
import net.mcreator.dragonpack.item.CrystalItem;
import net.mcreator.dragonpack.item.CrossboneItem;
import net.mcreator.dragonpack.item.BoneItem;
import net.mcreator.dragonpack.item.BlazeArmorItem;
import net.mcreator.dragonpack.item.BOOMItem;
import net.mcreator.dragonpack.item.AquaTridentItem;
import net.mcreator.dragonpack.item.AquaStickItem;
import net.mcreator.dragonpack.DragonPackMod;

public class DragonPackModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DragonPackMod.MODID);
	public static final RegistryObject<Item> AQUA_STICK = REGISTRY.register("aqua_stick", () -> new AquaStickItem());
	public static final RegistryObject<Item> STICK_OF_WATER = REGISTRY.register("stick_of_water", () -> new StickOfWaterItem());
	public static final RegistryObject<Item> DRAKE_WOOD = block(DragonPackModBlocks.DRAKE_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DRAKE_LOG = block(DragonPackModBlocks.DRAKE_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DRAKE_PLANKS = block(DragonPackModBlocks.DRAKE_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DRAKE_LEAVES = block(DragonPackModBlocks.DRAKE_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DRAKE_STAIRS = block(DragonPackModBlocks.DRAKE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DRAKE_SLAB = block(DragonPackModBlocks.DRAKE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DRAKE_FENCE = block(DragonPackModBlocks.DRAKE_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DRAKE_FENCE_GATE = block(DragonPackModBlocks.DRAKE_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> DRAKE_PRESSURE_PLATE = block(DragonPackModBlocks.DRAKE_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> DRAKE_BUTTON = block(DragonPackModBlocks.DRAKE_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AQUA_TRIDENT = REGISTRY.register("aqua_trident", () -> new AquaTridentItem());
	public static final RegistryObject<Item> BONE = REGISTRY.register("bone", () -> new BoneItem());
	public static final RegistryObject<Item> CROSSBONE = REGISTRY.register("crossbone", () -> new CrossboneItem());
	public static final RegistryObject<Item> CRYSTAL = REGISTRY.register("crystal", () -> new CrystalItem());
	public static final RegistryObject<Item> CRYSTAL_ORE = block(DragonPackModBlocks.CRYSTAL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_BLOCK = block(DragonPackModBlocks.CRYSTAL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLAZE_ARMOR_HELMET = REGISTRY.register("blaze_armor_helmet", () -> new BlazeArmorItem.Helmet());
	public static final RegistryObject<Item> BLAZE_ARMOR_CHESTPLATE = REGISTRY.register("blaze_armor_chestplate",
			() -> new BlazeArmorItem.Chestplate());
	public static final RegistryObject<Item> BLAZE_ARMOR_LEGGINGS = REGISTRY.register("blaze_armor_leggings", () -> new BlazeArmorItem.Leggings());
	public static final RegistryObject<Item> BLAZE_ARMOR_BOOTS = REGISTRY.register("blaze_armor_boots", () -> new BlazeArmorItem.Boots());
	public static final RegistryObject<Item> ELECTRIC_INGOT_INGOT = REGISTRY.register("electric_ingot_ingot", () -> new Electric_ingotIngotItem());
	public static final RegistryObject<Item> ELECTRIC_INGOT_ORE = block(DragonPackModBlocks.ELECTRIC_INGOT_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ELECTRIC_INGOT_BLOCK = block(DragonPackModBlocks.ELECTRIC_INGOT_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ELECTRIC_INGOT_PICKAXE = REGISTRY.register("electric_ingot_pickaxe",
			() -> new Electric_ingotPickaxeItem());
	public static final RegistryObject<Item> ELECTRIC_INGOT_AXE = REGISTRY.register("electric_ingot_axe", () -> new Electric_ingotAxeItem());
	public static final RegistryObject<Item> ELECTRIC_INGOT_SWORD = REGISTRY.register("electric_ingot_sword", () -> new Electric_ingotSwordItem());
	public static final RegistryObject<Item> ELECTRIC_INGOT_SHOVEL = REGISTRY.register("electric_ingot_shovel", () -> new Electric_ingotShovelItem());
	public static final RegistryObject<Item> ELECTRIC_INGOT_HOE = REGISTRY.register("electric_ingot_hoe", () -> new Electric_ingotHoeItem());
	public static final RegistryObject<Item> ELECTRIC_INGOT_ARMOR_HELMET = REGISTRY.register("electric_ingot_armor_helmet",
			() -> new Electric_ingotArmorItem.Helmet());
	public static final RegistryObject<Item> ELECTRIC_INGOT_ARMOR_CHESTPLATE = REGISTRY.register("electric_ingot_armor_chestplate",
			() -> new Electric_ingotArmorItem.Chestplate());
	public static final RegistryObject<Item> ELECTRIC_INGOT_ARMOR_LEGGINGS = REGISTRY.register("electric_ingot_armor_leggings",
			() -> new Electric_ingotArmorItem.Leggings());
	public static final RegistryObject<Item> ELECTRIC_INGOT_ARMOR_BOOTS = REGISTRY.register("electric_ingot_armor_boots",
			() -> new Electric_ingotArmorItem.Boots());
	public static final RegistryObject<Item> THUNDER_FIST = REGISTRY.register("thunder_fist", () -> new ThunderFistItem());
	public static final RegistryObject<Item> THUNDER = REGISTRY.register("thunder", () -> new ThunderItem());
	public static final RegistryObject<Item> WOOD = REGISTRY.register("wood", () -> new WOODItem());
	public static final RegistryObject<Item> WOODEN_STAFF = REGISTRY.register("wooden_staff", () -> new WoodenStaffItem());
	public static final RegistryObject<Item> BOOM = REGISTRY.register("boom", () -> new BOOMItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
