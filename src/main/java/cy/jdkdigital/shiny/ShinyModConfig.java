package cy.jdkdigital.shiny;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ShinyModConfig
{
    private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SERVER_CONFIG;
    public static final General GENERAL = new General(SERVER_BUILDER);

    static {
        SERVER_CONFIG = SERVER_BUILDER.build();
    }

    public static class General
    {
        public final ForgeConfigSpec.DoubleValue shinySpawnChance;

        public General(ForgeConfigSpec.Builder builder) {
            builder.push("General");

            shinySpawnChance = builder
                    .comment("Chance for a mob to spawn as shiny")
                    .defineInRange("shinySpawnChance", 0.002, 0, 1);

            builder.pop();
        }
    }
}