package cy.jdkdigital.shiny;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ShinyModConfig
{
    private static final ModConfigSpec.Builder SERVER_BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SERVER_CONFIG;
    public static final General GENERAL = new General(SERVER_BUILDER);

    static {
        SERVER_CONFIG = SERVER_BUILDER.build();
    }

    public static class General
    {
        public final ModConfigSpec.DoubleValue shinySpawnChance;

        public General(ModConfigSpec.Builder builder) {
            builder.push("General");

            shinySpawnChance = builder
                    .comment("Chance for a mob to spawn as shiny")
                    .defineInRange("shinySpawnChance", 0.002, 0, 1);

            builder.pop();
        }
    }
}