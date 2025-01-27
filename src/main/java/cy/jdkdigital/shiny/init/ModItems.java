package cy.jdkdigital.shiny.init;

import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, ShinyMod.MODID);

    public static final DeferredHolder<Item, Item> SHINY_PUFFERFISH_BUCKET = ITEMS.register("shiny_pufferfish_bucket", () -> new MobBucketItem(ModEntities.PUFFERFISH.get(), Fluids.WATER, SoundEvents.BUCKET_EMPTY_AXOLOTL, (new Item.Properties()).stacksTo(1)));
    public static final DeferredHolder<Item, Item> SHINY_SALMON_BUCKET = ITEMS.register("shiny_salmon_bucket", () -> new MobBucketItem(ModEntities.SALMON.get(), Fluids.WATER, SoundEvents.BUCKET_EMPTY_AXOLOTL, (new Item.Properties()).stacksTo(1)));
    public static final DeferredHolder<Item, Item> SHINY_COD_BUCKET = ITEMS.register("shiny_cod_bucket", () -> new MobBucketItem(ModEntities.COD.get(), Fluids.WATER, SoundEvents.BUCKET_EMPTY_AXOLOTL, (new Item.Properties()).stacksTo(1)));
    public static final DeferredHolder<Item, Item> SHINY_TROPICAL_FISH_BUCKET = ITEMS.register("shiny_tropical_fish_bucket", () -> new MobBucketItem(ModEntities.TROPICAL_FISH.get(), Fluids.WATER, SoundEvents.BUCKET_EMPTY_AXOLOTL, (new Item.Properties()).stacksTo(1)));
    public static final DeferredHolder<Item, Item> SHINY_AXOLOTL_BUCKET = ITEMS.register("shiny_axolotl_bucket", () -> new MobBucketItem(ModEntities.AXOLOTL.get(), Fluids.WATER, SoundEvents.BUCKET_EMPTY_AXOLOTL, (new Item.Properties()).stacksTo(1)));
}
