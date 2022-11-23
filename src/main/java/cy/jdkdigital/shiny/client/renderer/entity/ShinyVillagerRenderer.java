package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.VillagerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.VillagerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.Villager;

public class ShinyVillagerRenderer extends VillagerRenderer
{
    private static final ResourceLocation VILLAGER_BASE_SKIN = new ResourceLocation(ShinyMod.MODID, "textures/entity/villager/villager.png");

    public ShinyVillagerRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.addLayer(new VillagerShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Villager p_116312_) {
        return VILLAGER_BASE_SKIN;
    }
}
