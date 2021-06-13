package io.github.lucunji.uusiaurinko.fluid;

import com.google.common.collect.Lists;
import io.github.lucunji.uusiaurinko.block.ModBlocks;
import io.github.lucunji.uusiaurinko.item.ModItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

import static io.github.lucunji.uusiaurinko.UusiAurinko.MODID;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, MODID);

    private static ForgeFlowingFluid.Properties EXCREMENT_PROPERTIES;

    public static final RegistryObject<FlowingFluid> EXCREMENT = FLUIDS.register("excrement", () ->
            new ForgeFlowingFluid.Source(EXCREMENT_PROPERTIES){
                @Override
                protected int getLevelDecreasePerBlock(IWorldReader worldIn) {
                    return 2;
                }
            });
    public static final RegistryObject<FlowingFluid> FLOWING_EXCREMENT = FLUIDS.register("flowing_excrement", () ->
            new ForgeFlowingFluid.Flowing(EXCREMENT_PROPERTIES){
                @Override
                protected int getLevelDecreasePerBlock(IWorldReader worldIn) {
                    return 2;
                }
            });

    static {
        EXCREMENT_PROPERTIES = new ForgeFlowingFluid.Properties(
                EXCREMENT,
                FLOWING_EXCREMENT,
                FluidAttributes.builder(
                        new ResourceLocation("minecraft:block/water_still"),
                        new ResourceLocation("minecraft:block/water_flow"))
                        .overlay(new ResourceLocation("minecraft:block/water_overlay"))
                        .color(0xFF281804)  // ARGB
                        .viscosity(3000).density(3000)
        ).block(ModBlocks.EXCREMENT).bucket(ModItems.EXCREMENT_BUCKET);
    }
}
