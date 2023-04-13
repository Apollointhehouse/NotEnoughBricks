package apollointhehouse.NotEnoughBricks;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NotEnoughBricks implements ModInitializer {
    public static final String MOD_ID = "notenoughbricks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("NotEnoughBricks initialized.");
    }
}
