import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * Created by Konrad on 2017-05-18.
 */
public class BuildingTest {
    @Test(expected = IllegalArgumentException.class)
    public void testMissingFundamentals(){
        new Building.Builder(null);
    }

    @Test
    public void testBuildingBuilder(){
        final Building building = new Building
                .Builder(Fundamentals.BETONOWE)
                .withRoof(Roof.BLACHA)
                .withWalls(Walls.BETON)
                .withWindows(Windows.PLASTIKOWE)
                .build();
        assertNotNull(building);
        assertEquals(Fundamentals.BETONOWE, building.getFundamentals());
        assertEquals(Roof.BLACHA, building.getRoof());
        assertEquals(Walls.BETON, building.getWalls());
        assertEquals(Windows.PLASTIKOWE, building.getWindows());
    }

}