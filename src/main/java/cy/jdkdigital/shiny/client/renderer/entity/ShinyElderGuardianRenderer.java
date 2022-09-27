package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.ElderGuardianShinyLayer;
import net.minecraft.client.renderer.entity.ElderGuardianRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyElderGuardianRenderer extends ElderGuardianRenderer
{
    public ShinyElderGuardianRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ElderGuardianShinyLayer(this));
    }
}
