import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Konrad on 2017-05-18.
 */

/**
 * Jeden z podsystemów kopalni, operator wózka.
 */
public class DwarvenCartOperator extends DwarvenMineWorker {

    private static final Logger LOGGER = LoggerFactory.getLogger(DwarvenCartOperator.class);

    @Override
    public void work() {
        LOGGER.info("{} moves gold chunks out of the mine.", name());
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}
