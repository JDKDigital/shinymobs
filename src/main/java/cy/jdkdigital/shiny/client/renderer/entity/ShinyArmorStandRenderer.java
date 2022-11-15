package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.ArmorStandShinyLayer;
import net.minecraft.client.renderer.entity.ArmorStandRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyArmorStandRenderer extends ArmorStandRenderer
{
    public ShinyArmorStandRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ArmorStandShinyLayer(this));
    }
}
