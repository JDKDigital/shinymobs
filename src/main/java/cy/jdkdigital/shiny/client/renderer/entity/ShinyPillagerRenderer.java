package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.PillagerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PillagerRenderer;

public class ShinyPillagerRenderer extends PillagerRenderer
{
    public ShinyPillagerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PillagerShinyLayer(this));
    }
}
