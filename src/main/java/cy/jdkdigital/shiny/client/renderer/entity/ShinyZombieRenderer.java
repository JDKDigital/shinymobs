package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.ZombieShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieRenderer;

public class ShinyZombieRenderer extends ZombieRenderer
{
    public ShinyZombieRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ZombieShinyLayer(this));
    }
}
