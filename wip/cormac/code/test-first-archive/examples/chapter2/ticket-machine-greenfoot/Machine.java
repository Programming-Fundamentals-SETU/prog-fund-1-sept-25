import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import greenfoot.*;
import display.MachineDisplay;

final class Machine extends Actor
{
    private MachineDisplay mD;
    private TicketMachine tM;
    private GreenfootImage staticImage;
    private int ticketWidth;
    private int ticketHeight;
    private int width;
    private int height;
    private StatusInfo statusInfo;
    
    Machine(int width, int height, int ticketPrice, int machineTotal)
    {
        if (width <= 0) throw new IllegalArgumentException();
        if (height <= 0) throw new IllegalArgumentException();
        this.tM = new TicketMachine(ticketPrice, machineTotal);
        this.width = width;
        this.height = height;
        this.ticketWidth = width / 4;
        this.ticketHeight = height / 8;
        this.statusInfo = new StatusInfo(this);
    }
    
    int getWidth()
    {
        return this.width;
    }
    
    int getHeight()
    {
        return this.height;
    }
    
    
    protected void addedToWorld(World world)
    {
        this.mD = new MachineDisplay(this.width,
                                     this.height,
                                     this.getX(),
                                     this.getY());
        this.staticImage = this.mD.getImage();

        this.displayMachine();
    }
    
    int getTicketPrice()
    {
        return this.tM.getTicketPrice();
    }
    
    int getTotal()
    {
        return this.tM.getTotal();
    }
    
    int getBalance()
    {
        return this.tM.getBalance();
    }
    
    void insertCoin(int amount)
    {
        this.tM.insertCoin(amount);
    }
    
    Point slotTarget()
    {
        return this.mD.slotTarget();
    }
    
    boolean contains(Actor actor)
    {
        return this.mD.contains(actor);
    }
    
    boolean inSlot(Actor actor)
    {
        return this.mD.inSlot(actor);
    }
    
    boolean inWell(Actor actor)
    {
        return this.mD.inWell(actor);
    }
    
    private void displayMachine()
    {
        GreenfootImage image = new GreenfootImage(this.staticImage);
        image.drawImage(this.statusInfo.getImage(), 0, 0);
        this.setImage(image);
    }
    
    private void handleTicket()
    {
        int refund = this.tM.dispenseChange();
        this.displayMachine();
        if (refund >= 0)
        {
            this.getWorld().addObject(new Ticket(this.ticketWidth,
                                                 this.ticketHeight,
                                                 this.tM.getTicketPrice()),
                                                 this.mD.ticketReturnLocation().x,
                                                 this.mD.ticketReturnLocation().y);
            if (refund > 0) {
                for (int i = 0; i < refund; i++) {
                    this.getWorld().addObject(new Penny(),
                                              this.mD.coinReturnLocation().x,
                                              this.mD.coinReturnLocation().y);
                }
            }
        }
    }
    
    private void handleRefund()
    {
        MouseInfo info = Greenfoot.getMouseInfo();
        
        if (info != null &&
            info.getActor() == this &&
            this.mD.buttonClicked(info))

        {
            int refund = this.tM.dispenseRefund();
            for (int i = 0; i < refund; i++)
            {
                this.getWorld().addObject(new Penny(),
                                          this.mD.coinReturnLocation().x,
                                          this.mD.coinReturnLocation().y);
            }
        }
    }
    
    private void removeDispensedItems()
    {
        MouseInfo info = Greenfoot.getMouseInfo();
        
        
        if (info != null &&
            info.getActor() == this &&
            this.mD.displayAreaClicked(info))

        {
            for (Object o : this.getWorld().getObjects(Actor.class))
            {
                if (o instanceof Ticket || o instanceof Coin) {
                    Actor actor = (Actor) o;
                    this.getWorld().removeObject(actor);
                }
                
            }
        }
    }
    
    public void act()
    {
        this.handleTicket();
        this.handleRefund();
        this.removeDispensedItems();
    }

}
