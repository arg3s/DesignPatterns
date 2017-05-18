/**
 * Created by Konrad on 2017-05-18.
 */
public class GirlModel {
    private Age age;
    private Look look;
    private Hair hair;

    public GirlModel(Age age, Look look, Hair hair) {
        this.age = age;
        this.look = look;
        this.hair = hair;
    }

    @Override
    public String toString() {
        return "GirlModel{" +
                "age=" + age +
                ", look=" + look +
                ", hair=" + hair +
                '}';
    }

    public Age getAge() {

        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Look getLook() {
        return look;
    }

    public void setLook(Look look) {
        this.look = look;
    }

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }
}
