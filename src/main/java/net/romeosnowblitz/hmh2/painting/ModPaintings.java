package net.romeosnowblitz.hmh2.painting;

import net.romeosnowblitz.hmh2.Hmh2;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {
    public static final PaintingMotive IGLOO = registerPainting("igloo", new PaintingMotive(64, 32));
    public static final PaintingMotive HORSE = registerPainting("horse", new PaintingMotive(128, 64));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(Hmh2.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings() {
        Hmh2.LOGGER.info("Registering Paintings for " + Hmh2.MOD_ID);
    }
}
