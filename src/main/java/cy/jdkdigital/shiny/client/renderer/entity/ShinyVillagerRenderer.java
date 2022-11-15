package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.VillagerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.VillagerRenderer;

public class ShinyVillagerRenderer extends VillagerRenderer
{
    public ShinyVillagerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new VillagerShinyLayer(this));
    }
}
