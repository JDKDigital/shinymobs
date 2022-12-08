package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.PhantomShinyEyesLayer;
import cy.jdkdigital.shiny.client.renderer.entity.layers.PhantomShinyLayer;
import cy.jdkdigital.shiny.client.renderer.entity.layers.SpiderShinyEyesLayer;
import net.minecraft.client.model.SpiderModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PhantomRenderer;
import net.minecraft.client.renderer.entity.layers.PhantomEyesLayer;
import net.minecraft.client.renderer.entity.layers.SpiderEyesLayer;
import net.minecraft.world.entity.monster.Phantom;

public class ShinyPhantomRenderer extends PhantomRenderer
{
    public ShinyPhantomRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PhantomShinyLayer(this));
        this.layers.removeIf(layer -> layer instanceof PhantomEyesLayer<Phantom>);
        this.addLayer(new PhantomShinyEyesLayer<>(this));
    }
}
