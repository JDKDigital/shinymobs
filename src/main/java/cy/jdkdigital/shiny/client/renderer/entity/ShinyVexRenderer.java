package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.VexShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.VexRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Vex;

public class ShinyVexRenderer extends VexRenderer
{
    private static final ResourceLocation VEX_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/illager/vex.png");
    private static final ResourceLocation VEX_CHARGING_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/illager/vex_charging.png");

    public ShinyVexRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new VexShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Vex p_116292_) {
        return p_116292_.isCharging() ? VEX_CHARGING_LOCATION : VEX_LOCATION;
    }
}
