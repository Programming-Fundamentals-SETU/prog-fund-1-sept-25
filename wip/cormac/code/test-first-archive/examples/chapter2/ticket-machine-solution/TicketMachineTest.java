

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TicketMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TicketMachineTest
{
    /**
     * Default constructor for test class TicketMachineTest
     */
    public TicketMachineTest()
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
    public void testGetTicketPrice()
    {
        TicketMachine ticketMa1 = new TicketMachine(2, 1);
        assertEquals(2, ticketMa1.getTicketPrice());
    }

    @Test
    public void testGetTotal()
    {
        TicketMachine ticketMa1 = new TicketMachine(2, 1);
        assertEquals(1, ticketMa1.getTotal());
    }

    @Test
    public void testGetBalance()
    {
        TicketMachine ticketMa1 = new TicketMachine(2, 1);
        assertEquals(0, ticketMa1.getBalance());
    }

    @Test
    public void testInsertCoin()
    {
        TicketMachine ticketMa1 = new TicketMachine(2, 1);
        ticketMa1.insertCoin(3);
        assertEquals(3, ticketMa1.getBalance());
    }


    @Test
    public void testDispenseRefund()
    {
        TicketMachine ticketMa1 = new TicketMachine(5, 2);
        ticketMa1.insertCoin(10);
        assertEquals(10, ticketMa1.dispenseRefund());
        assertEquals(0, ticketMa1.getBalance());
        assertEquals(5, ticketMa1.getTicketPrice());
        assertEquals(2, ticketMa1.getTotal());
    }

    @Test
    public void testDispenseChange()
    {
        TicketMachine ticketMa1 = new TicketMachine(1, 2);
        ticketMa1.insertCoin(32);
        assertEquals(31, ticketMa1.dispenseChange());
        assertEquals(0, ticketMa1.getBalance());
        assertEquals(1, ticketMa1.getTicketPrice());
        assertEquals(3, ticketMa1.getTotal());
        TicketMachine ticketMa2 = new TicketMachine(1, 2);
        ticketMa2.insertCoin(32);
        assertEquals(31, ticketMa2.dispenseChange());
        assertEquals(0, ticketMa2.getBalance());
        assertEquals(1, ticketMa2.getTicketPrice());
        assertEquals(3, ticketMa2.getTotal());
        TicketMachine ticketMa3 = new TicketMachine(2, 0);
        assertEquals(-2, ticketMa3.dispenseChange());
        assertEquals(0, ticketMa3.getBalance());
        assertEquals(2, ticketMa3.getTicketPrice());
        assertEquals(0, ticketMa3.getTotal());
        TicketMachine ticketMa4 = new TicketMachine(5, 0);
        ticketMa4.insertCoin(3);
        assertEquals(-2, ticketMa4.dispenseChange());
        assertEquals(3, ticketMa4.getBalance());
        assertEquals(5, ticketMa4.getTicketPrice());
        assertEquals(0, ticketMa4.getTotal());
    }
}










