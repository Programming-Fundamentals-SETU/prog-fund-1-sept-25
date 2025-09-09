package clock;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClockTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClockTest
{
    /**
     * Default constructor for test class ClockTest
     */
    public ClockTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetMinutesPerHour()
    {
        Clock clock1 = new Clock(3, 12);
        assertEquals(12, clock1.getMinutesPerHour());
    }

    @Test
    public void testGetHoursPerCycle()
    {
        Clock clock1 = new Clock(3, 12);
        assertEquals(3, clock1.getHoursPerCycle());
    }

    @Test
    public void testGetHours()
    {
        Clock clock1 = new Clock(2, 1);
        clock1.increment();
        assertEquals(1, clock1.getHours());
        clock1.increment();
        assertEquals(0, clock1.getHours());
    }
    
    @Test
    public void testGetMinutes()
    {
        Clock clock1 = new Clock(2, 2);
        clock1.increment();
        assertEquals(1, clock1.getMinutes());
        clock1.increment();
        assertEquals(0, clock1.getMinutes());
    }
    
    @Test
    public void testIncrement()
    {
        final int minutesPerHour;
        final int hoursPerCycle;
        Clock clock1 = new Clock(2, 2);
        minutesPerHour = clock1.getMinutesPerHour();
        hoursPerCycle = clock1.getHoursPerCycle();
        clock1.increment();
        assertEquals(hoursPerCycle, clock1.getHoursPerCycle());
        assertEquals(minutesPerHour, clock1.getMinutesPerHour());
    }
}



