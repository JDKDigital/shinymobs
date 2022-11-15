package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.EvokerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EvokerRenderer;
import net.minecraft.world.entity.monster.Evoker;

public class ShinyEvokerRenderer<T extends Evoker> extends EvokerRenderer<T>
{
    public ShinyEvokerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new EvokerShinyLayer(this));
    }
}
