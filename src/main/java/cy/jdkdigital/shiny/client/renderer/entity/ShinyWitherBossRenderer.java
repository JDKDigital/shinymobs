package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.WitherBossShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WitherBossRenderer;

public class ShinyWitherBossRenderer extends WitherBossRenderer
{
    public ShinyWitherBossRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new WitherBossShinyLayer(this));
    }
}
