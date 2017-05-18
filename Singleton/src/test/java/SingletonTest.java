import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Konrad on 2017-05-18.
 */
public class SingletonTest {
    @Test
    public void testSingleton(){
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1 = SingletonClass.INSTANCE;
        SingletonClass singletonClass2 = SingletonClass.getInstance();

        assertEquals(singletonClass, singletonClass1);
        assertEquals(singletonClass, singletonClass2);
        assertEquals(singletonClass1, singletonClass2);
        assertNotNull(singletonClass);
        assertNotNull(singletonClass1);
    }
}
