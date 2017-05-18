/**
 * Created by Konrad on 2017-05-18.
 */
public abstract class Tobacco {

    public void smoke(Wizard wizard) {
        System.out.println(wizard.getClass().getSimpleName() + " smoking " +
                this.getClass().getSimpleName());
    }
}
