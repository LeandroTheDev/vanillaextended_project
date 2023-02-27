package net.bobodev.vanillaextended;

import net.bobodev.vanillaextended.items.Misc;
import net.fabricmc.api.ClientModInitializer;

public class VanillaExtendedClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Misc.registerMiscItems();
    }
}