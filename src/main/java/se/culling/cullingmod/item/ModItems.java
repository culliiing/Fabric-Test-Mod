package se.culling.cullingmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import se.culling.cullingmod.CullingMod;

public class ModItems {

    public static final Item CUSTOM_ITEM = registerItem("custom_item",
            new Item(new FabricItemSettings()
                    .group(ItemGroup.MISC)
                    .maxCount(16)
                    /*.food(new FoodComponent(3,
                                            3f,
                                            true,
                                            false,
                                            false,
                                            null))*/));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CullingMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CullingMod.LOGGER.debug("Registering Mod Items for " + CullingMod.MOD_ID);
    }
}
