package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.TurtleShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.TurtleRenderer;

public class ShinyTurtleRenderer extends TurtleRenderer
{
    public ShinyTurtleRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new TurtleShinyLayer(this));
    }
}
