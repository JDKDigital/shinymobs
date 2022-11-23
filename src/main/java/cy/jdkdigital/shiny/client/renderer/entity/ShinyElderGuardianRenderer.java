package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.ElderGuardianShinyLayer;
import net.minecraft.client.renderer.entity.ElderGuardianRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Guardian;
import org.jetbrains.annotations.NotNull;

public class ShinyElderGuardianRenderer extends ElderGuardianRenderer
{
    public static final ResourceLocation GUARDIAN_ELDER_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/guardian_elder.png");

    public ShinyElderGuardianRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ElderGuardianShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Guardian entity) {
        return GUARDIAN_ELDER_LOCATION;
    }
}
