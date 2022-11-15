package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.CreeperShinyLayer;
import net.minecraft.client.renderer.entity.CreeperRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Creeper;
import org.jetbrains.annotations.NotNull;

public class ShinyCreeperRenderer extends CreeperRenderer
{
    ResourceLocation TEXTURE = new ResourceLocation(ShinyMod.MODID, "textures/entity/creeper/creeper.png");

    public ShinyCreeperRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new CreeperShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Creeper entity) {
        return TEXTURE;
    }
}
