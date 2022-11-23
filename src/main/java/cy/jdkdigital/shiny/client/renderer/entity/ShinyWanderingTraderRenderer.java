package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.WanderingTraderShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WanderingTraderRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.WanderingTrader;

public class ShinyWanderingTraderRenderer extends WanderingTraderRenderer
{
    private static final ResourceLocation VILLAGER_BASE_SKIN = new ResourceLocation(ShinyMod.MODID, "textures/entity/wandering_trader.png");

    public ShinyWanderingTraderRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new WanderingTraderShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(WanderingTrader p_116373_) {
        return VILLAGER_BASE_SKIN;
    }
}
