package cy.jdkdigital.shiny.init;

import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ShinyMod.MODID);

    public static final RegistryObject<Item> SHINY_PUFFERFISH_BUCKET = ITEMS.register("shiny_pufferfish_bucket", () -> new MobBucketItem(ModEntities.PUFFERFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_AXOLOTL, (new Item.Properties()).stacksTo(1)));
    public static final RegistryObject<Item> SHINY_SALMON_BUCKET = ITEMS.register("shiny_salmon_bucket", () -> new MobBucketItem(ModEntities.SALMON, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_AXOLOTL, (new Item.Properties()).stacksTo(1)));
    public static final RegistryObject<Item> SHINY_COD_BUCKET = ITEMS.register("shiny_cod_bucket", () -> new MobBucketItem(ModEntities.COD, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_AXOLOTL, (new Item.Properties()).stacksTo(1)));
    public static final RegistryObject<Item> SHINY_TROPICAL_FISH_BUCKET = ITEMS.register("shiny_tropical_fish_bucket", () -> new MobBucketItem(ModEntities.TROPICAL_FISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_AXOLOTL, (new Item.Properties()).stacksTo(1)));
    public static final RegistryObject<Item> SHINY_AXOLOTL_BUCKET = ITEMS.register("shiny_axolotl_bucket", () -> new MobBucketItem(ModEntities.AXOLOTL, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_AXOLOTL, (new Item.Properties()).stacksTo(1)));
}
