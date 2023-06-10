package top.fairytale.world;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.fairytale.world.item.MagicBean;

public class FairytaleWorld implements ModInitializer {

	public static final String MOD_ID = "fairytaleworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier(FairytaleWorld.MOD_ID, "magic_bean"), MagicBean.MAGIC_BEAN);
		LOGGER.info("Hello Fabric world!");
	}
}
