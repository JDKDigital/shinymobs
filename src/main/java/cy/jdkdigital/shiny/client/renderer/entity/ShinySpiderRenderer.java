package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.SpiderShinyEyesLayer;
import cy.jdkdigital.shiny.client.renderer.entity.layers.SpiderShinyLayer;
import net.minecraft.client.model.SpiderModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SpiderRenderer;
import net.minecraft.client.renderer.entity.layers.SpiderEyesLayer;
import net.minecraft.world.entity.monster.Spider;

public class ShinySpiderRenderer<T extends Spider> extends SpiderRenderer<T>
{
    public ShinySpiderRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SpiderShinyLayer(this));
        this.layers.removeIf(layer -> layer instanceof SpiderEyesLayer<T, SpiderModel<T>>);
        this.addLayer(new SpiderShinyEyesLayer<>(this));
    }
}
