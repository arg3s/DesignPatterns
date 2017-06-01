import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Widok dziewczyny wyświetla wszystkie informacje na temat danego modelu {@link GirlModel} dziewczyny.
 */
public class GirlView {
    private static Logger LOGGER = LoggerFactory.getLogger(GirlView.class);

    /**
     * Metoda wyświetlająca informacje n.t dziewczyny.
     * @param girlModel model dziewczyny
     */
    public void displayView(GirlModel girlModel){
        LOGGER.info(girlModel.toString());
    }



}
