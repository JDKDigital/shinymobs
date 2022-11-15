package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.SheepShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SheepRenderer;

public class ShinySheepRenderer extends SheepRenderer
{
    public ShinySheepRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SheepShinyLayer(this));
    }
}
