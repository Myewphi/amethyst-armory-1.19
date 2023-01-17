package net.myewphi.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.myewphi.tutorialmod.TutorialMod;
import net.myewphi.tutorialmod.toolmaterials.AmethystToolMaterial;

public class ModItems {

    public static final Item AMETHYST_KNIFE = registerItem("amethyst_knife",
            new SwordItem(AmethystToolMaterial.INSTANCE, 1, 1f, new FabricItemSettings()), ItemGroups.COMBAT);

    private static Item registerItem(String name, Item item, ItemGroup itemGroup) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.add(item);
        });
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
