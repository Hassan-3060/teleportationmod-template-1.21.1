package net.first.teleportation;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeleportationModClient implements ClientModInitializer {
    public static final String MOD_ID = "teleportationmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
    }
}
