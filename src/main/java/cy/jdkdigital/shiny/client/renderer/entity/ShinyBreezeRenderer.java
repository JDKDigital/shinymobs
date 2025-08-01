package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.BlazeShinyLayer;
import cy.jdkdigital.shiny.client.renderer.entity.layers.BreezeShinyLayer;
import net.minecraft.client.renderer.entity.BlazeRenderer;
import net.minecraft.client.renderer.entity.BreezeRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyBreezeRenderer extends BreezeRenderer
{
    public ShinyBreezeRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new BreezeShinyLayer(this));
    }
}
