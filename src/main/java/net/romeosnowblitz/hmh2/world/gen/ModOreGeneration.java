package net.romeosnowblitz.hmh2.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.romeosnowblitz.hmh2.world.feature.ModPlacedFeatures;
import net.romeosnowblitz.hmh2.world.feature.jewels.ModJewelPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        //Ores
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BEEF.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CHICKEN.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRAPHITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIFE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LUCKY_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RAW_PLATINUM.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RAW_TITANIUM.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.RAW_GENERATION, ModPlacedFeatures.MARBLE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PUMICE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SALT.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SILVER.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TIN.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.NETHER), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.HELLSTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.THEEND), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUAERITE.getKey().get());


        //Jewels
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.DIOPSIDE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.OPAL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.BEACH), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.DIOPSIDE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.BEACH), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.OPAL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.EXTREME_HILLS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.RUBY.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.EXTREME_HILLS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ZIRCON.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.MOUNTAIN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.RUBY.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.MOUNTAIN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ZIRCON.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ANDALUSITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.AQUAMARINE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.RIVER), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ANDALUSITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.RIVER), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.AQUAMARINE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TSAVORITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPESSARITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.MESA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SMOKY_QUARTZ.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.MESA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.HESSONITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CHARCOAL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPHENE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CITRINE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPINEL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.ICY), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SAPPHIRE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.ICY), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.PERIDOT.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.MUSHROOM), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TORMALINE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.MUSHROOM), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.MOONSTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SAVANNA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.GARNET.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SAVANNA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.MALICHITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SWAMP), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.AMBER.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SWAMP), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.PREHNITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TOPAZ.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TANZANITE.getKey().get());
    }
}
