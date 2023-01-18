package net.myewphi.amethystarmory;

import net.fabricmc.api.ModInitializer;
import net.myewphi.amethystarmory.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmethystArmory implements ModInitializer {
	public static final String MOD_ID = "amethystarmory";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
