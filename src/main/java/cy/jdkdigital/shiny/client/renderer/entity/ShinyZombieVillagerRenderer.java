package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.ZombieVillagerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieVillagerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.ZombieVillager;

public class ShinyZombieVillagerRenderer extends ZombieVillagerRenderer
{
    private static final ResourceLocation ZOMBIE_VILLAGER_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/zombie_villager/zombie_villager.png");

    public ShinyZombieVillagerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ZombieVillagerShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(ZombieVillager p_116559_) {
        return ZOMBIE_VILLAGER_LOCATION;
    }
}
