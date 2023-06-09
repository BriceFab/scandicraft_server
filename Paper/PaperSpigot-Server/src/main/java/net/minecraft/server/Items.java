package net.minecraft.server;

import net.scandicraft.items.ScandiumBow;
import net.scandicraft.items.ScepterFalling;
import net.scandicraft.items.ScepterRepair;
import net.scandicraft.items.ScepterSpawnCreeper;

public class Items {
    static {
        if (!DispenserRegistry.a())
            throw new RuntimeException("Accessed Items before Bootstrap!");
    }

    public static final Item IRON_SHOVEL = get("iron_shovel");

    public static final Item IRON_PICKAXE = get("iron_pickaxe");

    public static final Item IRON_AXE = get("iron_axe");

    public static final Item FLINT_AND_STEEL = get("flint_and_steel");

    public static final Item APPLE = get("apple");

    public static final ItemBow BOW = (ItemBow) get("bow");

    public static final Item ARROW = get("arrow");

    public static final Item COAL = get("coal");

    public static final Item DIAMOND = get("diamond");

    public static final Item IRON_INGOT = get("iron_ingot");

    public static final Item GOLD_INGOT = get("gold_ingot");

    public static final Item IRON_SWORD = get("iron_sword");

    public static final Item WOODEN_SWORD = get("wooden_sword");

    public static final Item WOODEN_SHOVEL = get("wooden_shovel");

    public static final Item WOODEN_PICKAXE = get("wooden_pickaxe");

    public static final Item WOODEN_AXE = get("wooden_axe");

    public static final Item STONE_SWORD = get("stone_sword");

    public static final Item STONE_SHOVEL = get("stone_shovel");

    public static final Item STONE_PICKAXE = get("stone_pickaxe");

    public static final Item STONE_AXE = get("stone_axe");

    public static final Item DIAMOND_SWORD = get("diamond_sword");

    public static final Item DIAMOND_SHOVEL = get("diamond_shovel");

    public static final Item DIAMOND_PICKAXE = get("diamond_pickaxe");

    public static final Item DIAMOND_AXE = get("diamond_axe");

    public static final Item STICK = get("stick");

    public static final Item BOWL = get("bowl");

    public static final Item MUSHROOM_STEW = get("mushroom_stew");

    public static final Item GOLDEN_SWORD = get("golden_sword");

    public static final Item GOLDEN_SHOVEL = get("golden_shovel");

    public static final Item GOLDEN_PICKAXE = get("golden_pickaxe");

    public static final Item GOLDEN_AXE = get("golden_axe");

    public static final Item STRING = get("string");

    public static final Item FEATHER = get("feather");

    public static final Item GUNPOWDER = get("gunpowder");

    public static final Item WOODEN_HOE = get("wooden_hoe");

    public static final Item STONE_HOE = get("stone_hoe");

    public static final Item IRON_HOE = get("iron_hoe");

    public static final Item DIAMOND_HOE = get("diamond_hoe");

    public static final Item GOLDEN_HOE = get("golden_hoe");

    public static final Item WHEAT_SEEDS = get("wheat_seeds");

    public static final Item WHEAT = get("wheat");

    public static final Item BREAD = get("bread");

    public static final ItemArmor LEATHER_HELMET = (ItemArmor) get("leather_helmet");

    public static final ItemArmor LEATHER_CHESTPLATE = (ItemArmor) get("leather_chestplate");

    public static final ItemArmor LEATHER_LEGGINGS = (ItemArmor) get("leather_leggings");

    public static final ItemArmor LEATHER_BOOTS = (ItemArmor) get("leather_boots");

    public static final ItemArmor CHAINMAIL_HELMET = (ItemArmor) get("chainmail_helmet");

    public static final ItemArmor CHAINMAIL_CHESTPLATE = (ItemArmor) get("chainmail_chestplate");

    public static final ItemArmor CHAINMAIL_LEGGINGS = (ItemArmor) get("chainmail_leggings");

    public static final ItemArmor CHAINMAIL_BOOTS = (ItemArmor) get("chainmail_boots");

    public static final ItemArmor IRON_HELMET = (ItemArmor) get("iron_helmet");

    public static final ItemArmor IRON_CHESTPLATE = (ItemArmor) get("iron_chestplate");

    public static final ItemArmor IRON_LEGGINGS = (ItemArmor) get("iron_leggings");

    public static final ItemArmor IRON_BOOTS = (ItemArmor) get("iron_boots");

    public static final ItemArmor DIAMOND_HELMET = (ItemArmor) get("diamond_helmet");

    public static final ItemArmor DIAMOND_CHESTPLATE = (ItemArmor) get("diamond_chestplate");

    public static final ItemArmor DIAMOND_LEGGINGS = (ItemArmor) get("diamond_leggings");

    public static final ItemArmor DIAMOND_BOOTS = (ItemArmor) get("diamond_boots");

    public static final ItemArmor GOLDEN_HELMET = (ItemArmor) get("golden_helmet");

    public static final ItemArmor GOLDEN_CHESTPLATE = (ItemArmor) get("golden_chestplate");

    public static final ItemArmor GOLDEN_LEGGINGS = (ItemArmor) get("golden_leggings");

    public static final ItemArmor GOLDEN_BOOTS = (ItemArmor) get("golden_boots");

    public static final Item FLINT = get("flint");

    public static final Item PORKCHOP = get("porkchop");

    public static final Item COOKED_PORKCHOP = get("cooked_porkchop");

    public static final Item PAINTING = get("painting");

    public static final Item GOLDEN_APPLE = get("golden_apple");

    public static final Item SIGN = get("sign");

    public static final Item WOODEN_DOOR = get("wooden_door");

    public static final Item SPRUCE_DOOR = get("spruce_door");

    public static final Item BIRCH_DOOR = get("birch_door");

    public static final Item JUNGLE_DOOR = get("jungle_door");

    public static final Item ACACIA_DOOR = get("acacia_door");

    public static final Item DARK_OAK_DOOR = get("dark_oak_door");

    public static final Item BUCKET = get("bucket");

    public static final Item WATER_BUCKET = get("water_bucket");

    public static final Item LAVA_BUCKET = get("lava_bucket");

    public static final Item MINECART = get("minecart");

    public static final Item SADDLE = get("saddle");

    public static final Item IRON_DOOR = get("iron_door");

    public static final Item REDSTONE = get("redstone");

    public static final Item SNOWBALL = get("snowball");

    public static final Item BOAT = get("boat");

    public static final Item LEATHER = get("leather");

    public static final Item MILK_BUCKET = get("milk_bucket");

    public static final Item BRICK = get("brick");

    public static final Item CLAY_BALL = get("clay_ball");

    public static final Item REEDS = get("reeds");

    public static final Item PAPER = get("paper");

    public static final Item BOOK = get("book");

    public static final Item SLIME = get("slime_ball");

    public static final Item CHEST_MINECART = get("chest_minecart");

    public static final Item FURNACE_MINECART = get("furnace_minecart");

    public static final Item EGG = get("egg");

    public static final Item COMPASS = get("compass");

    public static final ItemFishingRod FISHING_ROD = (ItemFishingRod) get("fishing_rod");

    public static final Item CLOCK = get("clock");

    public static final Item GLOWSTONE_DUST = get("glowstone_dust");

    public static final Item FISH = get("fish");

    public static final Item COOKED_FISH = get("cooked_fish");

    public static final Item DYE = get("dye");

    public static final Item BONE = get("bone");

    public static final Item SUGAR = get("sugar");

    public static final Item CAKE = get("cake");

    public static final Item BED = get("bed");

    public static final Item REPEATER = get("repeater");

    public static final Item COOKIE = get("cookie");

    public static final ItemWorldMap FILLED_MAP = (ItemWorldMap) get("filled_map");

    public static final ItemShears SHEARS = (ItemShears) get("shears");

    public static final Item MELON = get("melon");

    public static final Item PUMPKIN_SEEDS = get("pumpkin_seeds");

    public static final Item MELON_SEEDS = get("melon_seeds");

    public static final Item BEEF = get("beef");

    public static final Item COOKED_BEEF = get("cooked_beef");

    public static final Item CHICKEN = get("chicken");

    public static final Item COOKED_CHICKEN = get("cooked_chicken");

    public static final Item MUTTON = get("mutton");

    public static final Item COOKED_MUTTON = get("cooked_mutton");

    public static final Item RABBIT = get("rabbit");

    public static final Item COOKED_RABBIT = get("cooked_rabbit");

    public static final Item RABBIT_STEW = get("rabbit_stew");

    public static final Item RABBIT_FOOT = get("rabbit_foot");

    public static final Item RABBIT_HIDE = get("rabbit_hide");

    public static final Item ROTTEN_FLESH = get("rotten_flesh");

    public static final Item ENDER_PEARL = get("ender_pearl");

    public static final Item BLAZE_ROD = get("blaze_rod");

    public static final Item GHAST_TEAR = get("ghast_tear");

    public static final Item GOLD_NUGGET = get("gold_nugget");

    public static final Item NETHER_WART = get("nether_wart");

    public static final ItemPotion POTION = (ItemPotion) get("potion");

    public static final Item GLASS_BOTTLE = get("glass_bottle");

    public static final Item SPIDER_EYE = get("spider_eye");

    public static final Item FERMENTED_SPIDER_EYE = get("fermented_spider_eye");

    public static final Item BLAZE_POWDER = get("blaze_powder");

    public static final Item MAGMA_CREAM = get("magma_cream");

    public static final Item BREWING_STAND = get("brewing_stand");

    public static final Item CAULDRON = get("cauldron");

    public static final Item ENDER_EYE = get("ender_eye");

    public static final Item SPECKLED_MELON = get("speckled_melon");

    public static final Item SPAWN_EGG = get("spawn_egg");

    public static final Item EXPERIENCE_BOTTLE = get("experience_bottle");

    public static final Item FIRE_CHARGE = get("fire_charge");

    public static final Item WRITABLE_BOOK = get("writable_book");

    public static final Item WRITTEN_BOOK = get("written_book");

    public static final Item EMERALD = get("emerald");

    public static final Item ITEM_FRAME = get("item_frame");

    public static final Item FLOWER_POT = get("flower_pot");

    public static final Item CARROT = get("carrot");

    public static final Item POTATO = get("potato");

    public static final Item BAKED_POTATO = get("baked_potato");

    public static final Item POISONOUS_POTATO = get("poisonous_potato");

    public static final ItemMapEmpty MAP = (ItemMapEmpty) get("map");

    public static final Item GOLDEN_CARROT = get("golden_carrot");

    public static final Item SKULL = get("skull");

    public static final Item CARROT_ON_A_STICK = get("carrot_on_a_stick");

    public static final Item NETHER_STAR = get("nether_star");

    public static final Item PUMPKIN_PIE = get("pumpkin_pie");

    public static final Item FIREWORKS = get("fireworks");

    public static final Item FIREWORK_CHARGE = get("firework_charge");

    public static final ItemEnchantedBook ENCHANTED_BOOK = (ItemEnchantedBook) get("enchanted_book");

    public static final Item COMPARATOR = get("comparator");

    public static final Item NETHERBRICK = get("netherbrick");

    public static final Item QUARTZ = get("quartz");

    public static final Item TNT_MINECART = get("tnt_minecart");

    public static final Item HOPPER_MINECART = get("hopper_minecart");

    public static final ItemArmorStand ARMOR_STAND = (ItemArmorStand) get("armor_stand");

    public static final Item IRON_HORSE_ARMOR = get("iron_horse_armor");

    public static final Item GOLDEN_HORSE_ARMOR = get("golden_horse_armor");

    public static final Item DIAMOND_HORSE_ARMOR = get("diamond_horse_armor");

    public static final Item LEAD = get("lead");

    public static final Item NAME_TAG = get("name_tag");

    public static final Item COMMAND_BLOCK_MINECART = get("command_block_minecart");

    public static final Item RECORD_13 = get("record_13");

    public static final Item RECORD_CAT = get("record_cat");

    public static final Item RECORD_BLOCKS = get("record_blocks");

    public static final Item RECORD_CHIRP = get("record_chirp");

    public static final Item RECORD_FAR = get("record_far");

    public static final Item RECORD_MALL = get("record_mall");

    public static final Item RECORD_MELLOHI = get("record_mellohi");

    public static final Item RECORD_STAL = get("record_stal");

    public static final Item RECORD_STRAD = get("record_strad");

    public static final Item RECORD_WARD = get("record_ward");

    public static final Item RECORD_11 = get("record_11");

    public static final Item RECORD_WAIT = get("record_wait");

    public static final Item PRISMARINE_SHARD = get("prismarine_shard");

    public static final Item PRISMARINE_CRYSTALS = get("prismarine_crystals");

    public static final Item BANNER = get("banner");

    /* ScandiCraft */
    public static final Item scandium = get("scandium");
    public static final Item pyrite = get("pyrite");
    public static final Item lazurite = get("lazurite");
    public static final Item scandium_sword = get("scandium_sword");
    public static final Item scandium_shovel = get("scandium_shovel");
    public static final Item scandium_pickaxe = get("scandium_pickaxe");
    public static final Item scandium_axe = get("scandium_axe");
    public static final Item scandium_hoe = get("scandium_hoe");
    public static final Item pyrite_sword = get("pyrite_sword");
    public static final Item pyrite_shovel = get("pyrite_shovel");
    public static final Item pyrite_pickaxe = get("pyrite_pickaxe");
    public static final Item pyrite_axe = get("pyrite_axe");
    public static final Item pyrite_hoe = get("pyrite_hoe");
    public static final Item lazurite_sword = get("lazurite_sword");
    public static final Item lazurite_shovel = get("lazurite_shovel");
    public static final Item lazurite_pickaxe = get("lazurite_pickaxe");
    public static final Item lazurite_axe = get("lazurite_axe");
    public static final Item lazurite_hoe = get("lazurite_hoe");
    public static final Item scandium_helmet = (ItemArmor) get("scandium_helmet");
    public static final Item scandium_chestplate = (ItemArmor) get("scandium_chestplate");
    public static final Item scandium_leggings = (ItemArmor) get("scandium_leggings");
    public static final Item scandium_boots = (ItemArmor) get("scandium_boots");
    public static final Item pyrite_helmet = (ItemArmor) get("pyrite_helmet");
    public static final Item pyrite_chestplate = (ItemArmor) get("pyrite_chestplate");
    public static final Item pyrite_leggings = (ItemArmor) get("pyrite_leggings");
    public static final Item pyrite_boots = (ItemArmor) get("pyrite_boots");
    public static final Item lazurite_helmet = (ItemArmor) get("lazurite_helmet");
    public static final Item lazurite_chestplate = (ItemArmor) get("lazurite_chestplate");
    public static final Item lazurite_leggings = (ItemArmor) get("lazurite_leggings");
    public static final Item lazurite_boots = (ItemArmor) get("lazurite_boots");
    public static final Item bloody_helmet = (ItemArmor) get("bloody_helmet");
    public static final Item bloody_chestplate = (ItemArmor) get("bloody_chestplate");
    public static final Item bloody_leggings = (ItemArmor) get("bloody_leggings");
    public static final Item bloody_boots = (ItemArmor) get("bloody_boots");
    public static final Item bloody_sword = get("bloody_sword");
    public static final Item scepter_creeper = (ScepterSpawnCreeper) get("scepter_creeper");
    public static final Item scepter_repair = (ScepterRepair) get("scepter_repair");
    public static final Item scepter_falling = (ScepterFalling) get("scepter_falling");
    public static final Item pyrite_pie = get("pyrite_pie");
    public static final Item lazurite_bread = get("lazurite_bread");
    public static final Item scandium_bow = (ScandiumBow) get("scandium_bow");
    public static final Item scandivote = get("scandivote");
    public static final Item scandibox = get("scandibox");
    public static final Item bloody_drip = get("bloody_drip");
    public static final Item scepter_capacity = get("scepter_capacity");

    private static Item get(String paramString) {
        return Item.REGISTRY.get(new MinecraftKey(paramString));
    }
}
