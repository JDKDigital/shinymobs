package cy.jdkdigital.shiny.common.entity;

import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.level.Level;

public class ShinySkeleton extends Skeleton
{
    public ShinySkeleton(EntityType<? extends Skeleton> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void doFreezeConversion() {
        this.convertTo(ModEntities.STRAY.get(), true);
        if (!this.isSilent()) {
            this.level.levelEvent(null, 1048, this.blockPosition(), 0);
        }
    }
}
