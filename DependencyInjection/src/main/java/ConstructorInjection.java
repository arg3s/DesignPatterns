/**
 * Created by Konrad on 2017-05-18.
 */

/**
 *
 * {@link ConstructorInjection} implementuje inwersję kontroli. Jest zależny od abstrakcji, która jest wstrzykiwana
 * przez jego konstruktor.
 *
 */
public class ConstructorInjection implements Wizard {

    private Tobacco tobacco;

    public ConstructorInjection(Tobacco tobacco) {
        this.tobacco = tobacco;
    }

    public void smoke() {
        tobacco.smoke(this);
    }
}
