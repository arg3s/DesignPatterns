/**
 * Created by Konrad on 2017-05-18.
 */
public class SingletonClass {

    public static final SingletonClass INSTANCE = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return INSTANCE;
    }
}
