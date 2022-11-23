package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.ZombieShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Zombie;

public class ShinyZombieRenderer extends ZombieRenderer
{
    private static final ResourceLocation ZOMBIE_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/zombie/zombie.png");

    public ShinyZombieRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ZombieShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Zombie p_113771_) {
        return ZOMBIE_LOCATION;
    }
}
