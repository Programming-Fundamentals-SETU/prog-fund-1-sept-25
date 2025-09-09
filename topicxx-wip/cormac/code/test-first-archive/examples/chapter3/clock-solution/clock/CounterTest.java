package clock;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CounterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CounterTest
{
    /**
     * Default constructor for test class CounterTest
     */
    public CounterTest()
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
    public void testGetValue()
    {
        clock.Counter counter2 = new clock.Counter(2, 1);
        assertEquals(1, counter2.getValue());
    }

    @Test
    public void testGetLimit()
    {
        clock.Counter counter1 = new clock.Counter(3, 0);
        assertEquals(3, counter1.getLimit());
    }

    @Test
    public void increment()
    {
        clock.Counter counter1 = new clock.Counter(3, 2);
        counter1.increment();
        assertEquals(0, counter1.getValue());
        assertEquals(3, counter1.getLimit());
    }
}



