import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Konrad on 2017-05-18.
 */
public class GirlView {
    private static Logger LOGGER = LoggerFactory.getLogger(GirlView.class);

    public void displayView(GirlModel girlModel){
        LOGGER.info(girlModel.toString());
    }



}
