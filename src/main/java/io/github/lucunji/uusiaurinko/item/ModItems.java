package io.github.lucunji.uusiaurinko.item;

import io.github.lucunji.uusiaurinko.block.ModBlocks;
import io.github.lucunji.uusiaurinko.datagen.client.Localize;
import io.github.lucunji.uusiaurinko.fluid.ModFluids;
import io.github.lucunji.uusiaurinko.item.radiative.*;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static io.github.lucunji.uusiaurinko.UusiAurinko.MODID;

public class ModItems {
    private static final ItemGroup DEFAULT_GROUP = new ModItemGroupDefault(MODID + ".defaults");

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    @Localize(locales = {"en_us", "zh_cn"}, translations = {"Kiuaskivi", "Kiuaskivi"})
    public static final RegistryObject<ItemFireStone> FIRE_STONE = ITEMS.register("fire_stone",
            () -> new ItemFireStone(new Properties().isImmuneToFire().maxStackSize(1).rarity(Rarity.UNCOMMON).group(DEFAULT_GROUP)));
    @Localize(locales = {"en_us", "zh_cn"}, translations = {"Vuoksikivi", "Vuoksikivi"})
    public static final RegistryObject<ItemWaterStone> WATER_STONE = ITEMS.register("water_stone",
            () -> new ItemWaterStone(new Properties().isImmuneToFire().maxStackSize(1).rarity(Rarity.UNCOMMON).group(DEFAULT_GROUP)));
    @Localize(locales = {"en_us", "zh_cn"}, translations = {"Ukkoskivi", "Ukkoskivi"})
    public static final RegistryObject<ItemLightningStone> LIGHTNING_STONE = ITEMS.register("lightning_stone",
            () -> new ItemLightningStone(new Properties().isImmuneToFire().maxStackSize(1).rarity(Rarity.UNCOMMON).group(DEFAULT_GROUP)));
    @Localize(locales = {"en_us", "zh_cn"}, translations = {"Tannerkivi", "Tannerkivi"})
    public static final RegistryObject<ItemEarthStone> EARTH_STONE = ITEMS.register("earth_stone",
            () -> new ItemEarthStone(new Properties().isImmuneToFire().maxStackSize(1).rarity(Rarity.UNCOMMON).group(DEFAULT_GROUP)));
    @Localize(locales = {"en_us", "zh_cn"}, translations = {"Kakkakikkare", "Kakkakikkare"})
    public static final RegistryObject<ItemPoopStone> POOP_STONE = ITEMS.register("poop_stone",
            () -> new ItemPoopStone(new Properties().isImmuneToFire().maxStackSize(1).rarity(Rarity.UNCOMMON).group(DEFAULT_GROUP)));

    @Localize(locales = {"en_us", "zh_cn"}, translations = {"Auringonsiemen", "Auringonsiemen"})
    public static final RegistryObject<ItemSunSeed> SUN_SEED = ITEMS.register("sun_seed",
            () -> new ItemSunSeed(new Properties().isImmuneToFire().maxStackSize(1).rarity(Rarity.UNCOMMON).group(DEFAULT_GROUP)));
    @Localize(locales = {"en_us", "zh_cn"}, translations = {"Aurinkokivi", "Aurinkokivi"})
    public static final RegistryObject<ItemSunStone> SUN_STONE = ITEMS.register("sun_stone",
            () -> new ItemSunStone(new Properties().isImmuneToFire().maxStackSize(1).rarity(Rarity.UNCOMMON).group(DEFAULT_GROUP)));

    @Localize(locales = {"en_us", "zh_cn"}, translations = {"Paha Silmä", "Paha Silmä"})
    public static final RegistryObject<ItemEvilEye> EVIL_EYE = ITEMS.register("evil_eye",
            () -> new ItemEvilEye(ModArmorMaterial.EVIL_EYE, EquipmentSlotType.HEAD, new Properties().isImmuneToFire().maxStackSize(1).rarity(Rarity.UNCOMMON).group(DEFAULT_GROUP)));

    @Localize(locales = {"en_us", "zh_cn"}, translations = {"Kuu", "Kuu"})
    public static final RegistryObject<ItemMoon> MOON = ITEMS.register("moon",
            () -> new ItemMoon(new Properties().isImmuneToFire().maxStackSize(1).rarity(Rarity.UNCOMMON).group(DEFAULT_GROUP)));

    @Localize(locales = {"zh_cn"}, translations = {"翠玉石板"})
    public static final RegistryObject<ItemEmeraldTablet> EMERALD_TABLET = ITEMS.register("emerald_tablet",
            () -> new ItemEmeraldTablet(new Properties().isImmuneToFire().maxStackSize(1).rarity(Rarity.UNCOMMON).group(DEFAULT_GROUP)));

    @Localize(locales = "zh_cn", translations = "排泄物桶")
    public static final RegistryObject<BucketItem> EXCREMENT_BUCKET = ITEMS.register("excrement_bucket",
            () -> new BucketItem(ModFluids.EXCREMENT, new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    static {
        ModBlocks.itemizedBlocks().forEach(pair -> {
            RegistryObject<Block> blockRegistryObject = pair.getLeft();
            ITEMS.register(blockRegistryObject.getId().getPath(),
                    () -> new BlockItem(
                            blockRegistryObject.get(),
                            new Item.Properties().group(DEFAULT_GROUP).maxStackSize(pair.getRight().maxStackSize())
                    )
            );
        });
    }
}
