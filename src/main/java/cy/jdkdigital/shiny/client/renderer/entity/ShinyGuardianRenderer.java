package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.GuardianShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.GuardianRenderer;

public class ShinyGuardianRenderer extends GuardianRenderer
{
    public ShinyGuardianRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new GuardianShinyLayer(this));
    }
}
