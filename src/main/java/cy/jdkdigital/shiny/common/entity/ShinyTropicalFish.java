package cy.jdkdigital.shiny.common.entity;

import cy.jdkdigital.shiny.init.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ShinyTropicalFish extends TropicalFish
{
    public ShinyTropicalFish(EntityType<? extends TropicalFish> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public ItemStack getBucketItemStack() {
        return new ItemStack(ModItems.SHINY_TROPICAL_FISH_BUCKET.get());
    }
}
