package net.romeosnowblitz.hmh2.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.romeosnowblitz.hmh2.world.feature.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees() {

        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BANANA_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CHERRY_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SAVANNA), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.JACARANDA_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.MOUNTAIN), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MAHOE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MANGO_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SWAMP), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WILLOW_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.MESA), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.UNBREAKABLE_TREE_PLACED.getKey().get());

    }
}
