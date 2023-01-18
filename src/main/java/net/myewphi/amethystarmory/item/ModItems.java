package net.myewphi.amethystarmory.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.myewphi.amethystarmory.AmethystArmory;
import net.myewphi.amethystarmory.toolmaterials.AmethystToolMaterial;

public class ModItems {

    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel",
            new ShovelItem(AmethystToolMaterial.INSTANCE, 1.5f, -3f, new FabricItemSettings()), ModItemGroup.AMETHYSTTAB);
    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe",
            new PickaxeItem(AmethystToolMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()), ModItemGroup.AMETHYSTTAB);
    public static final Item AMETHYST_AXE = registerItem("amethyst_axe",
            new AxeItem(AmethystToolMaterial.INSTANCE, 5, -3f, new FabricItemSettings()), ModItemGroup.AMETHYSTTAB);
    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe",
            new CustomHoeItem(AmethystToolMaterial.INSTANCE, -3, 0f, new FabricItemSettings()), ModItemGroup.AMETHYSTTAB);
    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new SwordItem(AmethystToolMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()), ModItemGroup.AMETHYSTTAB);
    public static final Item AMETHYST_GREATSWORD = registerItem("amethyst_greatsword",
            new SwordItem(AmethystToolMaterial.INSTANCE, 5, -3f, new FabricItemSettings()), ModItemGroup.AMETHYSTTAB);
    public static final Item AMETHYST_SPEAR = registerItem("amethyst_spear",
            new SwordItem(AmethystToolMaterial.INSTANCE, 5, -3f, new FabricItemSettings()), ModItemGroup.AMETHYSTTAB);
    public static final Item AMETHYST_CROSS_SPEAR = registerItem("amethyst_cross_spear",
            new SwordItem(AmethystToolMaterial.INSTANCE, 5, -3f, new FabricItemSettings()), ModItemGroup.AMETHYSTTAB);
    public static final Item DOUBLE_HEADED_AMETHYST_SPEAR = registerItem("double_headed_amethyst_spear",
            new SwordItem(AmethystToolMaterial.INSTANCE, 5, -3f, new FabricItemSettings()), ModItemGroup.AMETHYSTTAB);
    public static final Item AMETHYST_KNIFE = registerItem("amethyst_knife",
            new SwordItem(AmethystToolMaterial.INSTANCE, 2, -2f, new FabricItemSettings()), ModItemGroup.AMETHYSTTAB);

    private static Item registerItem(String name, Item item, ItemGroup itemGroup) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.add(item);
        });
        return Registry.register(Registries.ITEM, new Identifier(AmethystArmory.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AmethystArmory.LOGGER.debug("Registering Mod Items for " + AmethystArmory.MOD_ID);
    }
}
