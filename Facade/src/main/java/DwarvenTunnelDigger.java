import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Konrad on 2017-05-18.
 */

/**
 * Jeden z podsystemów kopalni, kopacz tuneli.
 */
public class DwarvenTunnelDigger extends DwarvenMineWorker {

    private static final Logger LOGGER = LoggerFactory.getLogger(DwarvenTunnelDigger.class);

    @Override
    public void work() {
        LOGGER.info("{} creates another promising tunnel.", name());
    }

    @Override
    public String name() {
        return "Dwarven tunnel digger";
    }
}
