package net.myewphi.amethystarmory.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.myewphi.amethystarmory.AmethystArmory;

public class ModItemGroup {
    public static final ItemGroup AMETHYSTTAB = FabricItemGroup.builder(
            new Identifier(AmethystArmory.MOD_ID, "amethysttab")).icon(() -> new ItemStack(ModItems.AMETHYST_SWORD)).build();
}
