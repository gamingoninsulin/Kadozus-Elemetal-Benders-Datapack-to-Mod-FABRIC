package me.gamingoninsulin;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElemetalBendersMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Reference.MODID);

	@Override
	public void onInitialize() {

		LOGGER.info("Starting " + Reference.MOD_NAME);
		LOGGER.info("Mod Author is " + Reference.MOD_AUTHOR);
		LOGGER.info("Datapack Owner is " + Reference.DATAPACK_OWNER);
	}
}