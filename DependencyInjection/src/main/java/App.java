/**
 * Created by Konrad on 2017-05-18.
 */

/**
 * Wstrzykujemy zależność {@link Tobacco} poprzez konstruktor klasy {@link ConstructorInjection}.
 */

public class App {
    /**
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        ConstructorInjection constructorInjection = new ConstructorInjection(new MarlboroTobacco());
        constructorInjection.smoke();
    }
}
