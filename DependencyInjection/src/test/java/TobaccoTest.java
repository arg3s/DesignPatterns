import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Konrad on 2017-05-18.
 */
public class TobaccoTest {

    @Test
    public void testSmokeEveryThing(){
        //Array of tobaccos.
        final Tobacco[] tobaccos = {
                new MarlboroTobacco(), new PallMallTobacco(), new RuskieTobacco()
        };
        int i = 0;
        for (final Tobacco tobacco : tobaccos) {
            final ConstructorInjection constructorInjection = new ConstructorInjection(tobacco);
            constructorInjection.smoke();
            // Check if ConstructorInjection smokes right Tobacco.
            assertEquals("ConstructorInjection smoking " + tobacco.getClass().getSimpleName(), "ConstructorInjection smoking " + tobaccos[i].getClass().getSimpleName());
            i++;
        }

        // Check if no other objects are added.
        assertEquals(tobaccos.length, 3);

    }
}
