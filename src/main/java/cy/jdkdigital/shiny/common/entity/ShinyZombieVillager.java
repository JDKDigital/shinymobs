package cy.jdkdigital.shiny.common.entity;

import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ShinyZombieVillager extends ZombieVillager
{
    public ShinyZombieVillager(EntityType<? extends ZombieVillager> entityType, Level level) {
        super(entityType, level);
    }

    @Nullable
    @Override
    public <T extends Mob> T convertTo(EntityType<T> type, boolean pickupEquipment) {
        if (type.equals(EntityType.VILLAGER)) {
            return super.convertTo((EntityType<T>) ModEntities.VILLAGER.get(), pickupEquipment);
        }
        return super.convertTo(type, pickupEquipment);
    }
}
