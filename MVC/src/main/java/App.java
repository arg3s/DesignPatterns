/**
 * Created by Konrad on 2017-05-18.
 */

/**
 * Model-View-Controller, czyli Model-Widok-Kontroler jest wzorcem do implementowania UI. Dzieli aplikację na
 * współzależne ze sobą klasy, o w/w nazwach.
 *
 * <p>
 *     W tym przypadku tworzymy sobie wymarzoną dziewczynę za pomocą modelu {@link GirlModel} posiadającą szczególne
 *     cechy, takie jak Wiek - {@link Age}, Wygląd - {@link Look} oraz Włosy - {@link Hair}
 * </p>
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
