package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.MushroomCowShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MushroomCowRenderer;

public class ShinyMushroomCowRenderer extends MushroomCowRenderer
{
    public ShinyMushroomCowRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new MushroomCowShinyLayer(this));
    }
}
