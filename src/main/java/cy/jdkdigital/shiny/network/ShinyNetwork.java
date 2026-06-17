package cy.jdkdigital.shiny.network;

import cy.jdkdigital.shiny.ShinyMod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

@EventBusSubscriber(modid = ShinyMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ShinyNetwork
{
    @SubscribeEvent
    public static void register(final RegisterPayloadHandlersEvent event) {
        final PayloadRegistrar registrar = event.registrar("1");
        registrar.playToClient(ShinyDragonPayload.TYPE, ShinyDragonPayload.STREAM_CODEC, ShinyDragonPayload::handle);
    }
}
