import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Konrad on 2017-05-18.
 */
public class DwarvenGoldmineTest {
    private InMemoryAppender appender;

    @Before
    public void setUp() {
        appender = new InMemoryAppender();
    }

    @After
    public void tearDown() {
        appender.stop();
    }

    @Test
    public void testFullWorkDay() {
        final DwarvenGoldmineFacade goldMine = new DwarvenGoldmineFacade();
        goldMine.startNewDay();

        // On the start of a day, all workers should wake up ...
        assertTrue(appender.logContains("Dwarf gold digger wakes up."));
        assertTrue(appender.logContains("Dwarf cart operator wakes up."));
        assertTrue(appender.logContains("Dwarven tunnel digger wakes up."));

        // ... and go to the mine
        assertTrue(appender.logContains("Dwarf gold digger goes to the mine."));
        assertTrue(appender.logContains("Dwarf cart operator goes to the mine."));
        assertTrue(appender.logContains("Dwarven tunnel digger goes to the mine."));

        // No other actions were invoked, so the workers shouldn't have done (printed) anything else
        assertEquals(6, appender.getLogSize());

        // Now do some actual work, start digging gold!
        goldMine.digOutGold();

        // Since we gave the dig command, every worker should be doing it's job ...
        assertTrue(appender.logContains("Dwarf gold digger digs for gold."));
        assertTrue(appender.logContains("Dwarf cart operator moves gold chunks out of the mine."));
        assertTrue(appender.logContains("Dwarven tunnel digger creates another promising tunnel."));

        // Again, they shouldn't be doing anything else.
        assertEquals(9, appender.getLogSize());

        // Enough gold, lets end the day.
        goldMine.endDay();

        // Check if the workers go home ...
        assertTrue(appender.logContains("Dwarf gold digger goes home."));
        assertTrue(appender.logContains("Dwarf cart operator goes home."));
        assertTrue(appender.logContains("Dwarven tunnel digger goes home."));

        // ... and go to sleep. We need well rested workers the next day :)
        assertTrue(appender.logContains("Dwarf gold digger goes to sleep."));
        assertTrue(appender.logContains("Dwarf cart operator goes to sleep."));
        assertTrue(appender.logContains("Dwarven tunnel digger goes to sleep."));

        // Every worker should be sleeping now, no other actions allowed
        assertEquals(15, appender.getLogSize());
    }

}
