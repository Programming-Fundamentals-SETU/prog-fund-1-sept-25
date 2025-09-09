public class TicketMachine
{

    private int ticketPrice;
    private int total;
    private int balance;


    TicketMachine(final int ticketPrice, final int total)
    {
        if (ticketPrice < 0)
        {
            throw new IllegalArgumentException();
        }
        if (total < 0)
        {
            throw new IllegalArgumentException();
        }
        this.ticketPrice = ticketPrice;
        this.total = total;
        this.balance = 0;
    }
    
    int getTicketPrice()
    {
        assert (this.ticketPrice >= 0 && this.total >= 0 && this.balance >= 0);
        return 0;
    }
    
    int getTotal()
    {
        assert (this.ticketPrice >= 0 && this.total >= 0 && this.balance >= 0);
        return 0;
    }
    
    int getBalance()
    {
        assert (this.ticketPrice >= 0 && this.total >= 0 && this.balance >= 0);
        return 0;
    }
    
    int dispenseRefund()
    {
        assert (this.ticketPrice >= 0 && this.total >= 0 && this.balance >= 0);
        return 0;
    }
    
    int dispenseChange()
    {
        assert (this.ticketPrice >= 0 && this.total >= 0 && this.balance >= 0);
        return 0;
    }
    
    void insertCoin(final int amount)
    {
        assert (this.ticketPrice >= 0 && this.total >= 0 && this.balance >= 0);
        if (amount <= 0)
        {
            throw new IllegalArgumentException();
        }
    }
}
