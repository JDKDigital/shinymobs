package cy.jdkdigital.shiny.common.entity;

import cy.jdkdigital.shiny.init.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ShinyAxolotl extends Axolotl
{
    public ShinyAxolotl(EntityType<? extends Axolotl> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public ItemStack getBucketItemStack() {
        return new ItemStack(ModItems.SHINY_AXOLOTL_BUCKET.get());
    }
}
