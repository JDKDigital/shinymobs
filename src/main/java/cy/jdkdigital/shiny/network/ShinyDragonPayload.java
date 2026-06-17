package cy.jdkdigital.shiny.network;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.ClientPayloadHandler;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public record ShinyDragonPayload(int entityId, boolean shiny) implements CustomPacketPayload
{
    public static final CustomPacketPayload.Type<ShinyDragonPayload> TYPE = new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath(ShinyMod.MODID, "shiny_dragon"));

    public static final StreamCodec<RegistryFriendlyByteBuf, ShinyDragonPayload> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.VAR_INT, ShinyDragonPayload::entityId,
            ByteBufCodecs.BOOL, ShinyDragonPayload::shiny,
            ShinyDragonPayload::new
    );

    @Override
    public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(final ShinyDragonPayload payload, final IPayloadContext context) {
        context.enqueueWork(() -> ClientPayloadHandler.handleShinyDragon(payload));
    }
}
