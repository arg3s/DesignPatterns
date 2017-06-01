/**
 * Created by Konrad on 2017-05-18.
 */

/**
 * Klasa posiada finalną statyczną metodę tworzącą instancję klasy {@link SingletonClass}.
 */
public class SingletonClass {

    public static final SingletonClass INSTANCE = new SingletonClass();

    /**
     * Prywatny konstruktor.
     */
    private SingletonClass() {
    }

    /**
     * Publiczna globalna metoda,
     * @return zwraca instancję klasy.
     */
    public static SingletonClass getInstance() {
        return INSTANCE;
    }
}
