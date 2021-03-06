package net.romeosnowblitz.hmh2.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    //TREES (C3)
    //Banana Tree
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BANANA_TREE = ConfiguredFeatures.register("banana_tree", Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.BANANA_LOG), new StraightTrunkPlacer(3, 3, 2), BlockStateProvider.of(ModBlocks.BANANA_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
    public static final RegistryEntry<PlacedFeature> BANANA_CHECKED = PlacedFeatures.register("banana_checked", BANANA_TREE, PlacedFeatures.wouldSurvive(ModBlocks.BANANA_SAPLING));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BANANA_SPAWN = ConfiguredFeatures.register("banana_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(BANANA_CHECKED, 1.0f)), BANANA_CHECKED));
    //Cherry Tree
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY_TREE = ConfiguredFeatures.register("cherry_tree", Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.CHERRY_LOG), new StraightTrunkPlacer(3, 3, 2), BlockStateProvider.of(ModBlocks.CHERRY_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
    public static final RegistryEntry<PlacedFeature> CHERRY_CHECKED = PlacedFeatures.register("cherry_checked", CHERRY_TREE, PlacedFeatures.wouldSurvive(ModBlocks.CHERRY_SAPLING));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> CHERRY_SPAWN = ConfiguredFeatures.register("cherry_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(CHERRY_CHECKED, 1.0f)), CHERRY_CHECKED));
    //Mango Tree
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> MANGO_TREE = ConfiguredFeatures.register("mango_tree", Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.MANGO_LOG), new StraightTrunkPlacer(3, 3, 2), BlockStateProvider.of(ModBlocks.MANGO_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
    public static final RegistryEntry<PlacedFeature> MANGO_CHECKED = PlacedFeatures.register("mango_checked", MANGO_TREE, PlacedFeatures.wouldSurvive(ModBlocks.MANGO_SAPLING));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> MANGO_SPAWN = ConfiguredFeatures.register("mango_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(MANGO_CHECKED, 1.0f)), MANGO_CHECKED));
    //Mahoe Tree
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> MAHOE_TREE = ConfiguredFeatures.register("mahoe_tree", Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.MAHOE_LOG), new StraightTrunkPlacer(3, 3, 2), BlockStateProvider.of(ModBlocks.MAHOE_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
    public static final RegistryEntry<PlacedFeature> MAHOE_CHECKED = PlacedFeatures.register("mahoe_checked", MAHOE_TREE, PlacedFeatures.wouldSurvive(ModBlocks.MAHOE_SAPLING));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> MAHOE_SPAWN = ConfiguredFeatures.register("mahoe_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(MAHOE_CHECKED, 1.0f)), MAHOE_CHECKED));
    //Jacaranda Tree
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> JACARANDA_TREE = ConfiguredFeatures.register("jacaranda_tree", Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.JACARANDA_LOG), new StraightTrunkPlacer(3, 3, 2), BlockStateProvider.of(ModBlocks.JACARANDA_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
    public static final RegistryEntry<PlacedFeature> JACARANDA_CHECKED = PlacedFeatures.register("jacaranda_checked", JACARANDA_TREE, PlacedFeatures.wouldSurvive(ModBlocks.JACARANDA_SAPLING));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> JACARANDA_SPAWN = ConfiguredFeatures.register("jacaranda_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(JACARANDA_CHECKED, 1.0f)), JACARANDA_CHECKED));
    //Willow Tree
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> WILLOW_TREE = ConfiguredFeatures.register("willow_tree", Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.WILLOW_LOG), new StraightTrunkPlacer(3, 3, 2), BlockStateProvider.of(ModBlocks.WILLOW_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
    public static final RegistryEntry<PlacedFeature> WILLOW_CHECKED = PlacedFeatures.register("willow_checked", WILLOW_TREE, PlacedFeatures.wouldSurvive(ModBlocks.WILLOW_SAPLING));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> WILLOW_SPAWN = ConfiguredFeatures.register("willow_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(WILLOW_CHECKED, 1.0f)), WILLOW_CHECKED));
    //Unbreakable Tree
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> UNBREAKABLE_TREE =
            ConfiguredFeatures.register("unbreakable_tree", Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.UNBREAKABLE_BLOCK), new StraightTrunkPlacer(3, 3, 2),
                    BlockStateProvider.of(ModBlocks.UNBREAKABLE_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
    public static final RegistryEntry<PlacedFeature> UNBREAKABLE_TREE_CHECKED = PlacedFeatures.register("unbreakable_tree_checked", UNBREAKABLE_TREE);
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> UNBREAKABLE_TREE_SPAWN = ConfiguredFeatures.register("unbreakable_tree_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(UNBREAKABLE_TREE_CHECKED, 1.0f)), UNBREAKABLE_TREE_CHECKED));

    //FLOWERS (C1)
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> BLUE_SPIDER_LILY = ConfiguredFeatures.register("blue_spider_lily", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_SPIDER_LILY)))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> POISON_GRASS = ConfiguredFeatures.register("poison_grass", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.POISON_GRASS)))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> ROSE = ConfiguredFeatures.register("rose", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ROSE)))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> WOLFSBANE = ConfiguredFeatures.register("wolfsbane", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WOLFSBANE)))));

    //ORES (C?)
    public static final List<OreFeatureConfig.Target> OVERWORLD_BEEF = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RAW_BEEF_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.BEEF_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BEEF =
            ConfiguredFeatures.register("beef",Feature.ORE, new OreFeatureConfig(OVERWORLD_BEEF, 6));

    public static final List<OreFeatureConfig.Target> OVERWORLD_CHICKEN = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RAW_CHICKEN_NUGGET_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.CHICKEN_NUGGET_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CHICKEN =
            ConfiguredFeatures.register("chicken",Feature.ORE, new OreFeatureConfig(OVERWORLD_CHICKEN, 6));

    public static final List<OreFeatureConfig.Target> OVERWORLD_GRAPHITE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.GRAPHITE_BLOCK.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.GRAPHITE_BLOCK.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> GRAPHITE =
            ConfiguredFeatures.register("graphite",Feature.ORE, new OreFeatureConfig(OVERWORLD_GRAPHITE, 3));

    public static final List<OreFeatureConfig.Target> OVERWORLD_LIFE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LIFE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.LIFE_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LIFE_ORE =
            ConfiguredFeatures.register("life_ore",Feature.ORE, new OreFeatureConfig(OVERWORLD_LIFE_ORES, 3));

    public static final List<OreFeatureConfig.Target> OVERWORLD_LUCKY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LUCKY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.LUCKY_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LUCKY_ORE =
            ConfiguredFeatures.register("lucky_ore",Feature.ORE, new OreFeatureConfig(OVERWORLD_LUCKY_ORES, 7));

    public static final List<OreFeatureConfig.Target> OVERWORLD_RAW_PLATINUM = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RAW_PLATINUM_BLOCK.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.RAW_PLATINUM_BLOCK.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RAW_PLATINUM =
            ConfiguredFeatures.register("raw_platinum",Feature.ORE, new OreFeatureConfig(OVERWORLD_RAW_PLATINUM, 8));

    public static final List<OreFeatureConfig.Target> OVERWORLD_MARBLE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MARBLE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.MARBLE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MARBLE =
            ConfiguredFeatures.register("marble",Feature.ORE, new OreFeatureConfig(OVERWORLD_MARBLE, 12));

    public static final List<OreFeatureConfig.Target> OVERWORLD_PUMICE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PUMICE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.PUMICE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PUMICE =
            ConfiguredFeatures.register("pumice",Feature.ORE, new OreFeatureConfig(OVERWORLD_PUMICE, 8));

    public static final List<OreFeatureConfig.Target> OVERWORLD_SALT = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SALT_BLOCK.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.SALT_BLOCK.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SALT =
            ConfiguredFeatures.register("salt",Feature.ORE, new OreFeatureConfig(OVERWORLD_SALT, 16));

    public static final List<OreFeatureConfig.Target> OVERWORLD_SILVER = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SILVER =
            ConfiguredFeatures.register("silver",Feature.ORE, new OreFeatureConfig(OVERWORLD_SILVER, 8));

    public static final List<OreFeatureConfig.Target> OVERWORLD_TIN = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TIN_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TIN =
            ConfiguredFeatures.register("tin",Feature.ORE, new OreFeatureConfig(OVERWORLD_TIN, 8));


    public static final List<OreFeatureConfig.Target> OVERWORLD_RAW_TITANIUM = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RAW_TITANIUM_BLOCK.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.RAW_TITANIUM_BLOCK.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RAW_TITANIUM =
            ConfiguredFeatures.register("raw_titanium",Feature.ORE, new OreFeatureConfig(OVERWORLD_RAW_TITANIUM, 8));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> HELLSTONE =
            ConfiguredFeatures.register("hellstone",Feature.ORE,new OreFeatureConfig(new BlockMatchRuleTest(Blocks.NETHERRACK),
                    ModBlocks.HELLSTONE_BLOCK.getDefaultState(), 4));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> QUAERITE =
            ConfiguredFeatures.register("quaerite",Feature.ORE,new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.QUAERITE.getDefaultState(), 4));


    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + Hmh2.MOD_ID);
    }
}
