/**
 * Created by Konrad on 2017-05-18.
 */
public class App {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1 = SingletonClass.getInstance();

        System.out.println(singletonClass + ", " + singletonClass1);
    }
}
