package net.myewphi.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.myewphi.tutorialmod.TutorialMod;

public class ModItemGroup {
    public static final ItemGroup TUTORIALTAB = FabricItemGroup.builder(
            new Identifier(TutorialMod.MOD_ID, "tutorialtab")).icon(() -> new ItemStack(ModItems.AMETHYST_SWORD)).build();
}
