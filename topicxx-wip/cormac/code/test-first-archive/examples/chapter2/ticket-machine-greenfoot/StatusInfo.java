import greenfoot.*;

class StatusInfo
{
    private Machine machine;
    StatusInfo(Machine machine)
    {
        this.machine = machine;
    }
    
    GreenfootImage getImage()
    {
        GreenfootImage image = new GreenfootImage(machine.getWidth(), machine.getHeight());
        image.drawString("Price: " + this.machine.getTicketPrice(),
                         10,
                         10);
        image.drawString("Total: " + this.machine.getTotal(),
                         10,
                         30);
        image.drawString("Balance: " + this.machine.getBalance(),
                         10,
                         50);
                         
        return image;
    }
        
}
