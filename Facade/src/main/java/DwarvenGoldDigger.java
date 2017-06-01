import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Konrad on 2017-05-18.
 */

/**
 * Jeden z podsystemów kopalni, kopacz złota.
 */
public class DwarvenGoldDigger extends DwarvenMineWorker {

    private static final Logger LOGGER = LoggerFactory.getLogger(DwarvenGoldDigger.class);

    @Override
    public void work() {
        LOGGER.info("{} digs for gold.", name());
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }
}
