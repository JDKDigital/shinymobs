package cy.jdkdigital.shiny.client;

import cy.jdkdigital.shiny.init.ShinyAttachments;
import cy.jdkdigital.shiny.network.ShinyDragonPayload;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;

public class ClientPayloadHandler
{
    public static void handleShinyDragon(final ShinyDragonPayload payload) {
        Minecraft minecraft = Minecraft.getInstance();
        if (minecraft.level != null) {
            Entity entity = minecraft.level.getEntity(payload.entityId());
            if (entity instanceof EnderDragon dragon) {
                dragon.setData(ShinyAttachments.SHINY.get(), payload.shiny());
            }
        }
    }
}
