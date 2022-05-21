package net.romeosnowblitz.hmh2.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.romeosnowblitz.hmh2.world.feature.ModPlacedFeatures;

public class ModFlowerGeneration {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.MOUNTAIN), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_SPIDER_LILY.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.POISON_GRASS.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ROSE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.TAIGA), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WOLFSBANE.getKey().get());
    }
}
