package io.github.lucunji.uusiaurinko.client;

import io.github.lucunji.uusiaurinko.client.render.entity.RadiativeItemEntityRenderer;
import io.github.lucunji.uusiaurinko.client.render.tileentity.TransmutingTileEntityRenderer;
import io.github.lucunji.uusiaurinko.entity.ModEntityTypes;
import io.github.lucunji.uusiaurinko.fluid.ModFluids;
import io.github.lucunji.uusiaurinko.tileentity.ModTileEntityTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void onEntityRenderersRegistry(final FMLClientSetupEvent event) {
        LOGGER.info("Register renderers");
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.RADIATIVE_ITEM.get(),
                manager -> new RadiativeItemEntityRenderer(manager, Minecraft.getInstance().getItemRenderer()));
        ClientRegistry.bindTileEntityRenderer(ModTileEntityTypes.TRANSMUTING_BLOCK.get(),
                TransmutingTileEntityRenderer::new);

        ModFluids.FLUIDS.getEntries().forEach(registryObject -> RenderTypeLookup.setRenderLayer(registryObject.get(), RenderType.getTranslucent()));
    }
}