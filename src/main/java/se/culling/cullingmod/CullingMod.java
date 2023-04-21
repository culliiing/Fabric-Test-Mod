package se.culling.cullingmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.culling.cullingmod.item.ModItems;

public class CullingMod implements ModInitializer {
	public static final String MOD_ID = "cullingmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		FuelRegistry.INSTANCE.add(ModItems.CUSTOM_ITEM, 300);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CUSTOM_ITEM, 0.8f);
	}
}
