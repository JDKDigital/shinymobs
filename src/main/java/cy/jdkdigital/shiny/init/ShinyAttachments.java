package cy.jdkdigital.shiny.init;

import com.mojang.serialization.Codec;
import cy.jdkdigital.shiny.ShinyMod;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ShinyAttachments
{
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, ShinyMod.MODID);

    // Marks a genuine vanilla entity as shiny; client renders it fullbright when set. Synced manually via ShinyDragonPayload.
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Boolean>> SHINY = ATTACHMENT_TYPES.register(
            "shiny", () -> AttachmentType.<Boolean>builder(() -> false).serialize(Codec.BOOL).build()
    );
}
