
package net.mcreator.dragonpack.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.dragonpack.init.DragonPackModItems;
import net.mcreator.dragonpack.init.DragonPackModFluids;
import net.mcreator.dragonpack.init.DragonPackModBlocks;

public abstract class GfFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(DragonPackModFluids.GF,
			DragonPackModFluids.FLOWING_GF,
			FluidAttributes.builder(new ResourceLocation("dragon_pack:blocks/drake_log_top"), new ResourceLocation("dragon_pack:blocks/f"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.crimson_forest.additions"))))
			.explosionResistance(100f).canMultiply()

			.bucket(DragonPackModItems.GF_BUCKET).block(() -> (LiquidBlock) DragonPackModBlocks.GF.get());

	private GfFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(5.3999999999999995);
	}

	public static class Source extends GfFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GfFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
