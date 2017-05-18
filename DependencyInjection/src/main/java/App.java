/**
 * Created by Konrad on 2017-05-18.
 */


public class App {
    public static void main(String[] args) {

        ConstructorInjection constructorInjection = new ConstructorInjection(new MarlboroTobacco());
        constructorInjection.smoke();
    }
}
