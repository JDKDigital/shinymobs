package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.SpiderShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SpiderRenderer;
import net.minecraft.world.entity.monster.Spider;

public class ShinySpiderRenderer<T extends Spider> extends SpiderRenderer<T>
{
    public ShinySpiderRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SpiderShinyLayer(this));
    }
}
