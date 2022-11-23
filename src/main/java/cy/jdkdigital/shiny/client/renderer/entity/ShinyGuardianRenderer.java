package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.GuardianShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.GuardianRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Guardian;

public class ShinyGuardianRenderer extends GuardianRenderer
{
    private static final ResourceLocation GUARDIAN_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/guardian.png");

    public ShinyGuardianRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new GuardianShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Guardian p_114827_) {
        return GUARDIAN_LOCATION;
    }
}
