/**
 * @author mulhern 
 * @version 1.0
 */
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
        return this.ticketPrice;
    }
    
    int getTotal()
    {
        assert (this.ticketPrice >= 0 && this.total >= 0 && this.balance >= 0);
        return this.total;
    }
    
    int getBalance()
    {
        assert (this.ticketPrice >= 0 && this.total >= 0 && this.balance >= 0);        
        return this.balance;
    }
    
    int dispenseChange()
    {
        assert (this.ticketPrice >= 0 && this.total >= 0 && this.balance >= 0);
        final int change = this.balance - this.ticketPrice;
        if (change >= 0) {
            this.balance = 0;
            this.total = this.total + this.ticketPrice;
        }
        return change;
    }
    
    int dispenseRefund()
    {
        assert (this.ticketPrice >= 0 && this.total >= 0 && this.balance >= 0);
        final int refund = this.balance;
        this.balance = 0;
        return refund;
    }
    
    void insertCoin(int amount)
    {
        assert (this.ticketPrice >= 0 && this.total >= 0 && this.balance >= 0);
        if (amount <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.balance = this.balance + amount;
    }
}
