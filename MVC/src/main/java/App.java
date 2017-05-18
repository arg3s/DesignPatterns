/**
 * Created by Konrad on 2017-05-18.
 */
public class App {
    public static void main(String[] args) {
        GirlModel girlModel = new GirlModel(Age.YOUNG, Look.PRETTY, Hair.LONG);
        GirlView girlView = new GirlView();
        GirlController girlController = new GirlController(girlModel, girlView);
        girlController.updateView();

        girlController.setAge(Age.OLD);
        girlController.setHair(Hair.BALD);
        girlController.setLook(Look.UGLY);

        girlController.updateView();
    }
}
