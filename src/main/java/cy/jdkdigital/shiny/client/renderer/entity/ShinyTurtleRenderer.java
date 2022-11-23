package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.TurtleShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.TurtleRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Turtle;

public class ShinyTurtleRenderer extends TurtleRenderer
{
    private static final ResourceLocation TURTLE_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/turtle/big_sea_turtle.png");

    public ShinyTurtleRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new TurtleShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Turtle entity) {
        return TURTLE_LOCATION;
    }
}
