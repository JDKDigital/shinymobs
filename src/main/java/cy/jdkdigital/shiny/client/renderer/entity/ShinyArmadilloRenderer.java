package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.ArmadilloShinyLayer;
import net.minecraft.client.renderer.entity.ArmadilloRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyArmadilloRenderer extends ArmadilloRenderer
{
    public ShinyArmadilloRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ArmadilloShinyLayer(this));
    }
}
