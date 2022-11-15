package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.ZombieVillagerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieVillagerRenderer;

public class ShinyZombieVillagerRenderer extends ZombieVillagerRenderer
{
    public ShinyZombieVillagerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ZombieVillagerShinyLayer(this));
    }
}
