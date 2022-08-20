
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonpack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dragonpack.block.GfBlock;
import net.mcreator.dragonpack.block.Electric_ingotOreBlock;
import net.mcreator.dragonpack.block.Electric_ingotBlockBlock;
import net.mcreator.dragonpack.block.DrakeWoodBlock;
import net.mcreator.dragonpack.block.DrakeStairsBlock;
import net.mcreator.dragonpack.block.DrakeSlabBlock;
import net.mcreator.dragonpack.block.DrakePressurePlateBlock;
import net.mcreator.dragonpack.block.DrakePlanksBlock;
import net.mcreator.dragonpack.block.DrakeLogBlock;
import net.mcreator.dragonpack.block.DrakeLeavesBlock;
import net.mcreator.dragonpack.block.DrakeFenceGateBlock;
import net.mcreator.dragonpack.block.DrakeFenceBlock;
import net.mcreator.dragonpack.block.DrakeButtonBlock;
import net.mcreator.dragonpack.block.CrystalOreBlock;
import net.mcreator.dragonpack.block.CrystalBlockBlock;
import net.mcreator.dragonpack.block.BonePortalBlock;
import net.mcreator.dragonpack.DragonPackMod;

public class DragonPackModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DragonPackMod.MODID);
	public static final RegistryObject<Block> DRAKE_WOOD = REGISTRY.register("drake_wood", () -> new DrakeWoodBlock());
	public static final RegistryObject<Block> DRAKE_LOG = REGISTRY.register("drake_log", () -> new DrakeLogBlock());
	public static final RegistryObject<Block> DRAKE_PLANKS = REGISTRY.register("drake_planks", () -> new DrakePlanksBlock());
	public static final RegistryObject<Block> DRAKE_LEAVES = REGISTRY.register("drake_leaves", () -> new DrakeLeavesBlock());
	public static final RegistryObject<Block> DRAKE_STAIRS = REGISTRY.register("drake_stairs", () -> new DrakeStairsBlock());
	public static final RegistryObject<Block> DRAKE_SLAB = REGISTRY.register("drake_slab", () -> new DrakeSlabBlock());
	public static final RegistryObject<Block> DRAKE_FENCE = REGISTRY.register("drake_fence", () -> new DrakeFenceBlock());
	public static final RegistryObject<Block> DRAKE_FENCE_GATE = REGISTRY.register("drake_fence_gate", () -> new DrakeFenceGateBlock());
	public static final RegistryObject<Block> DRAKE_PRESSURE_PLATE = REGISTRY.register("drake_pressure_plate", () -> new DrakePressurePlateBlock());
	public static final RegistryObject<Block> DRAKE_BUTTON = REGISTRY.register("drake_button", () -> new DrakeButtonBlock());
	public static final RegistryObject<Block> BONE_PORTAL = REGISTRY.register("bone_portal", () -> new BonePortalBlock());
	public static final RegistryObject<Block> CRYSTAL_ORE = REGISTRY.register("crystal_ore", () -> new CrystalOreBlock());
	public static final RegistryObject<Block> CRYSTAL_BLOCK = REGISTRY.register("crystal_block", () -> new CrystalBlockBlock());
	public static final RegistryObject<Block> ELECTRIC_INGOT_ORE = REGISTRY.register("electric_ingot_ore", () -> new Electric_ingotOreBlock());
	public static final RegistryObject<Block> ELECTRIC_INGOT_BLOCK = REGISTRY.register("electric_ingot_block", () -> new Electric_ingotBlockBlock());
	public static final RegistryObject<Block> GF = REGISTRY.register("gf", () -> new GfBlock());
}
