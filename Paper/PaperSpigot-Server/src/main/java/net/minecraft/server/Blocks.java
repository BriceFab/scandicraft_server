package net.minecraft.server;

import net.scandicraft.blocks.PyriteChest;
import net.scandicraft.blocks.RandomOre;

public class Blocks {
    static {
        if (!DispenserRegistry.a())
            throw new RuntimeException("Accessed Blocks before Bootstrap!");
    }

    public static final Block AIR = get("air");

    public static final Block STONE = get("stone");

    public static final BlockGrass GRASS = (BlockGrass) get("grass");

    public static final Block DIRT = get("dirt");

    public static final Block COBBLESTONE = get("cobblestone");

    public static final Block PLANKS = get("planks");

    public static final Block SAPLING = get("sapling");

    public static final Block BEDROCK = get("bedrock");

    public static final BlockFlowing FLOWING_WATER = (BlockFlowing) get("flowing_water");

    public static final BlockStationary WATER = (BlockStationary) get("water");

    public static final BlockFlowing FLOWING_LAVA = (BlockFlowing) get("flowing_lava");

    public static final BlockStationary LAVA = (BlockStationary) get("lava");

    public static final BlockSand SAND = (BlockSand) get("sand");

    public static final Block GRAVEL = get("gravel");

    public static final Block GOLD_ORE = get("gold_ore");

    public static final Block IRON_ORE = get("iron_ore");

    public static final Block COAL_ORE = get("coal_ore");

    public static final Block LOG = get("log");

    public static final Block LOG2 = get("log2");

    public static final BlockLeaves LEAVES = (BlockLeaves) get("leaves");

    public static final BlockLeaves LEAVES2 = (BlockLeaves) get("leaves2");

    public static final Block SPONGE = get("sponge");

    public static final Block GLASS = get("glass");

    public static final Block LAPIS_ORE = get("lapis_ore");

    public static final Block LAPIS_BLOCK = get("lapis_block");

    public static final Block DISPENSER = get("dispenser");

    public static final Block SANDSTONE = get("sandstone");

    public static final Block NOTEBLOCK = get("noteblock");

    public static final Block BED = get("bed");

    public static final Block GOLDEN_RAIL = get("golden_rail");

    public static final Block DETECTOR_RAIL = get("detector_rail");

    public static final BlockPiston STICKY_PISTON = (BlockPiston) get("sticky_piston");

    public static final Block WEB = get("web");

    public static final BlockLongGrass TALLGRASS = (BlockLongGrass) get("tallgrass");

    public static final BlockDeadBush DEADBUSH = (BlockDeadBush) get("deadbush");

    public static final BlockPiston PISTON = (BlockPiston) get("piston");

    public static final BlockPistonExtension PISTON_HEAD = (BlockPistonExtension) get("piston_head");

    public static final Block WOOL = get("wool");

    public static final BlockPistonMoving PISTON_EXTENSION = (BlockPistonMoving) get("piston_extension");

    public static final BlockFlowers YELLOW_FLOWER = (BlockFlowers) get("yellow_flower");

    public static final BlockFlowers RED_FLOWER = (BlockFlowers) get("red_flower");

    public static final BlockPlant BROWN_MUSHROOM = (BlockPlant) get("brown_mushroom");

    public static final BlockPlant RED_MUSHROOM = (BlockPlant) get("red_mushroom");

    public static final Block GOLD_BLOCK = get("gold_block");

    public static final Block IRON_BLOCK = get("iron_block");

    public static final BlockStepAbstract DOUBLE_STONE_SLAB = (BlockStepAbstract) get("double_stone_slab");

    public static final BlockStepAbstract STONE_SLAB = (BlockStepAbstract) get("stone_slab");

    public static final Block BRICK_BLOCK = get("brick_block");

    public static final Block TNT = get("tnt");

    public static final Block BOOKSHELF = get("bookshelf");

    public static final Block MOSSY_COBBLESTONE = get("mossy_cobblestone");

    public static final Block OBSIDIAN = get("obsidian");

    public static final Block TORCH = get("torch");

    public static final BlockFire FIRE = (BlockFire) get("fire");

    public static final Block MOB_SPAWNER = get("mob_spawner");

    public static final Block OAK_STAIRS = get("oak_stairs");

    public static final BlockChest CHEST = (BlockChest) get("chest");

    public static final BlockRedstoneWire REDSTONE_WIRE = (BlockRedstoneWire) get("redstone_wire");

    public static final Block DIAMOND_ORE = get("diamond_ore");

    public static final Block DIAMOND_BLOCK = get("diamond_block");

    public static final Block CRAFTING_TABLE = get("crafting_table");

    public static final Block WHEAT = get("wheat");

    public static final Block FARMLAND = get("farmland");

    public static final Block FURNACE = get("furnace");

    public static final Block LIT_FURNACE = get("lit_furnace");

    public static final Block STANDING_SIGN = get("standing_sign");

    public static final Block WOODEN_DOOR = get("wooden_door");

    public static final Block SPRUCE_DOOR = get("spruce_door");

    public static final Block BIRCH_DOOR = get("birch_door");

    public static final Block JUNGLE_DOOR = get("jungle_door");

    public static final Block ACACIA_DOOR = get("acacia_door");

    public static final Block DARK_OAK_DOOR = get("dark_oak_door");

    public static final Block LADDER = get("ladder");

    public static final Block RAIL = get("rail");

    public static final Block STONE_STAIRS = get("stone_stairs");

    public static final Block WALL_SIGN = get("wall_sign");

    public static final Block LEVER = get("lever");

    public static final Block STONE_PRESSURE_PLATE = get("stone_pressure_plate");

    public static final Block IRON_DOOR = get("iron_door");

    public static final Block WOODEN_PRESSURE_PLATE = get("wooden_pressure_plate");

    public static final Block REDSTONE_ORE = get("redstone_ore");

    public static final Block LIT_REDSTONE_ORE = get("lit_redstone_ore");

    public static final Block UNLIT_REDSTONE_TORCH = get("unlit_redstone_torch");

    public static final Block REDSTONE_TORCH = get("redstone_torch");

    public static final Block STONE_BUTTON = get("stone_button");

    public static final Block SNOW_LAYER = get("snow_layer");

    public static final Block ICE = get("ice");

    public static final Block SNOW = get("snow");

    public static final BlockCactus CACTUS = (BlockCactus) get("cactus");

    public static final Block CLAY = get("clay");

    public static final BlockReed REEDS = (BlockReed) get("reeds");

    public static final Block JUKEBOX = get("jukebox");

    public static final Block FENCE = get("fence");

    public static final Block SPRUCE_FENCE = get("spruce_fence");

    public static final Block BIRCH_FENCE = get("birch_fence");

    public static final Block JUNGLE_FENCE = get("jungle_fence");

    public static final Block DARK_OAK_FENCE = get("dark_oak_fence");

    public static final Block ACACIA_FENCE = get("acacia_fence");

    public static final Block PUMPKIN = get("pumpkin");

    public static final Block NETHERRACK = get("netherrack");

    public static final Block SOUL_SAND = get("soul_sand");

    public static final Block GLOWSTONE = get("glowstone");

    public static final BlockPortal PORTAL = (BlockPortal) get("portal");

    public static final Block LIT_PUMPKIN = get("lit_pumpkin");

    public static final Block CAKE = get("cake");

    public static final BlockRepeater UNPOWERED_REPEATER = (BlockRepeater) get("unpowered_repeater");

    public static final BlockRepeater POWERED_REPEATER = (BlockRepeater) get("powered_repeater");

    public static final Block TRAPDOOR = get("trapdoor");

    public static final Block MONSTER_EGG = get("monster_egg");

    public static final Block STONEBRICK = get("stonebrick");

    public static final Block BROWN_MUSHROOM_BLOCK = get("brown_mushroom_block");

    public static final Block RED_MUSHROOM_BLOCK = get("red_mushroom_block");

    public static final Block IRON_BARS = get("iron_bars");

    public static final Block GLASS_PANE = get("glass_pane");

    public static final Block MELON_BLOCK = get("melon_block");

    public static final Block PUMPKIN_STEM = get("pumpkin_stem");

    public static final Block MELON_STEM = get("melon_stem");

    public static final Block VINE = get("vine");

    public static final Block FENCE_GATE = get("fence_gate");

    public static final Block SPRUCE_FENCE_GATE = get("spruce_fence_gate");

    public static final Block BIRCH_FENCE_GATE = get("birch_fence_gate");

    public static final Block JUNGLE_FENCE_GATE = get("jungle_fence_gate");

    public static final Block DARK_OAK_FENCE_GATE = get("dark_oak_fence_gate");

    public static final Block ACACIA_FENCE_GATE = get("acacia_fence_gate");

    public static final Block BRICK_STAIRS = get("brick_stairs");

    public static final Block STONE_BRICK_STAIRS = get("stone_brick_stairs");

    public static final BlockMycel MYCELIUM = (BlockMycel) get("mycelium");

    public static final Block WATERLILY = get("waterlily");

    public static final Block NETHER_BRICK = get("nether_brick");

    public static final Block NETHER_BRICK_FENCE = get("nether_brick_fence");

    public static final Block NETHER_BRICK_STAIRS = get("nether_brick_stairs");

    public static final Block NETHER_WART = get("nether_wart");

    public static final Block ENCHANTING_TABLE = get("enchanting_table");

    public static final Block BREWING_STAND = get("brewing_stand");

    public static final BlockCauldron cauldron = (BlockCauldron) get("cauldron");

    public static final Block END_PORTAL = get("end_portal");

    public static final Block END_PORTAL_FRAME = get("end_portal_frame");

    public static final Block END_STONE = get("end_stone");

    public static final Block DRAGON_EGG = get("dragon_egg");

    public static final Block REDSTONE_LAMP = get("redstone_lamp");

    public static final Block LIT_REDSTONE_LAMP = get("lit_redstone_lamp");

    public static final BlockStepAbstract DOUBLE_WOODEN_SLAB = (BlockStepAbstract) get("double_wooden_slab");

    public static final BlockStepAbstract WOODEN_SLAB = (BlockStepAbstract) get("wooden_slab");

    public static final Block COCOA = get("cocoa");

    public static final Block SANDSTONE_STAIRS = get("sandstone_stairs");

    public static final Block EMERALD_ORE = get("emerald_ore");

    public static final Block ENDER_CHEST = get("ender_chest");

    public static final BlockTripwireHook TRIPWIRE_HOOK = (BlockTripwireHook) get("tripwire_hook");

    public static final Block TRIPWIRE = get("tripwire");

    public static final Block EMERALD_BLOCK = get("emerald_block");

    public static final Block SPRUCE_STAIRS = get("spruce_stairs");

    public static final Block BIRCH_STAIRS = get("birch_stairs");

    public static final Block JUNGLE_STAIRS = get("jungle_stairs");

    public static final Block COMMAND_BLOCK = get("command_block");

    public static final BlockBeacon BEACON = (BlockBeacon) get("beacon");

    public static final Block COBBLESTONE_WALL = get("cobblestone_wall");

    public static final Block FLOWER_POT = get("flower_pot");

    public static final Block CARROTS = get("carrots");

    public static final Block POTATOES = get("potatoes");

    public static final Block WOODEN_BUTTON = get("wooden_button");

    public static final BlockSkull SKULL = (BlockSkull) get("skull");

    public static final Block ANVIL = get("anvil");

    public static final Block TRAPPED_CHEST = get("trapped_chest");

    public static final Block LIGHT_WEIGHTED_PRESSURE_PLATE = get("light_weighted_pressure_plate");

    public static final Block HEAVY_WEIGHTED_PRESSURE_PLATE = get("heavy_weighted_pressure_plate");

    public static final BlockRedstoneComparator UNPOWERED_COMPARATOR = (BlockRedstoneComparator) get("unpowered_comparator");

    public static final BlockRedstoneComparator POWERED_COMPARATOR = (BlockRedstoneComparator) get("powered_comparator");

    public static final BlockDaylightDetector DAYLIGHT_DETECTOR = (BlockDaylightDetector) get("daylight_detector");

    public static final BlockDaylightDetector DAYLIGHT_DETECTOR_INVERTED = (BlockDaylightDetector) get("daylight_detector_inverted");

    public static final Block REDSTONE_BLOCK = get("redstone_block");

    public static final Block QUARTZ_ORE = get("quartz_ore");

    public static final BlockHopper HOPPER = (BlockHopper) get("hopper");

    public static final Block QUARTZ_BLOCK = get("quartz_block");

    public static final Block QUARTZ_STAIRS = get("quartz_stairs");

    public static final Block ACTIVATOR_RAIL = get("activator_rail");

    public static final Block DROPPER = get("dropper");

    public static final Block STAINED_HARDENED_CLAY = get("stained_hardened_clay");

    public static final Block BARRIER = get("barrier");

    public static final Block IRON_TRAPDOOR = get("iron_trapdoor");

    public static final Block HAY_BLOCK = get("hay_block");

    public static final Block CARPET = get("carpet");

    public static final Block HARDENED_CLAY = get("hardened_clay");

    public static final Block COAL_BLOCK = get("coal_block");

    public static final Block PACKED_ICE = get("packed_ice");

    public static final Block ACACIA_STAIRS = get("acacia_stairs");

    public static final Block DARK_OAK_STAIRS = get("dark_oak_stairs");

    public static final Block SLIME = get("slime");

    public static final BlockTallPlant DOUBLE_PLANT = (BlockTallPlant) get("double_plant");

    public static final BlockStainedGlass STAINED_GLASS = (BlockStainedGlass) get("stained_glass");

    public static final BlockStainedGlassPane STAINED_GLASS_PANE = (BlockStainedGlassPane) get("stained_glass_pane");

    public static final Block PRISMARINE = get("prismarine");

    public static final Block SEA_LANTERN = get("sea_lantern");

    public static final Block STANDING_BANNER = get("standing_banner");

    public static final Block WALL_BANNER = get("wall_banner");

    public static final Block RED_SANDSTONE = get("red_sandstone");

    public static final Block RED_SANDSTONE_STAIRS = get("red_sandstone_stairs");

    public static final BlockStepAbstract DOUBLE_STONE_SLAB2 = (BlockStepAbstract) get("double_stone_slab2");

    public static final BlockStepAbstract STONE_SLAB2 = (BlockStepAbstract) get("stone_slab2");

    /* ScandiCraft blocks */
    public static final Block scandium_ore = get("scandium_ore");
    public static final Block scandium_block = get("scandium_block");
    public static final Block pyrite_ore = get("pyrite_ore");
    public static final Block pyrite_block = get("pyrite_block");
    public static final Block lazurite_ore = get("lazurite_ore");
    public static final Block lazurite_block = get("lazurite_block");
    public static final PyriteChest pyrite_chest = (PyriteChest) get("pyrite_chest");
    public static final Block lazurite_ladder = get("lazurite_ladder");
    public static final Block light = get("light");
    public static final Block dungeon_spawner = get("dungeon_spawner");
    public static final RandomOre random_ore = (RandomOre) get("random_ore");

    private static Block get(String paramString) {
        return Block.REGISTRY.get(new MinecraftKey(paramString));
    }
}
