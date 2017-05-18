/**
 * Created by Konrad on 2017-05-18.
 */
public class GirlController {
    GirlModel girlModel;
    GirlView girlView;

    public GirlController(GirlModel girlModel, GirlView girlView) {
        this.girlModel = girlModel;
        this.girlView = girlView;
    }

    public Age getAge() {
        return this.girlModel.getAge();
    }

    public void setAge(Age age) {
        this.girlModel.setAge(age);
    }

    public Hair getHair() {
        return this.girlModel.getHair();
    }

    public void setHair(Hair hair) {
        this.girlModel.setHair(hair);
    }

    public Look getLook() {
        return this.girlModel.getLook();
    }

    public void setLook(Look look) {
        this.girlModel.setLook(look);
    }


    public void updateView() {
        this.girlView.displayView(girlModel);
    }
}
