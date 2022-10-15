package net.kikoz.mcwfences;

import net.fabricmc.api.ModInitializer;
import net.kikoz.mcwfences.init.BlockInit;
import net.kikoz.mcwfences.util.ClientEventBusSubscriber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MacawsFences implements ModInitializer {

	public static final String MOD_ID = "mcwfences";
	public static final Logger LOGGER = (Logger) LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockInit.registerModBlocks();
	}
}
