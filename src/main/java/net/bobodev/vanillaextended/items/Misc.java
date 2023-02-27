package net.bobodev.vanillaextended.items;

import net.bobodev.vanillaextended.VanillaExtended;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Misc {

    //TURTLE CHESTPLATE
    public static final Item TURTLE_CHESTPLATE = registerItem("turtle_chestplate",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    //TURTLE LEGGINGS
    public static final Item TURTLE_LEGGINGS = registerItem("turtle_leggings",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    // Item Registration Command
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaExtended.MOD_ID, name), item);
    }

    // Item Debugger
    public static void registerMiscItems() {
        VanillaExtended.LOGGER.debug("Registering Mod Items for " + VanillaExtended.MOD_ID);
    }
}
