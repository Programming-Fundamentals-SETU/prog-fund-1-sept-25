import java.util.List;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

abstract class Coin extends Actor
{
    private Machine machine;
    
    Coin()
    {
    }
    
    abstract int getValue();
    
    protected void addedToWorld(World world)
    {
        for (Machine m: (List<Machine>)this.getWorld().getObjects(Machine.class))
        {
            if (m.contains(this))
            {
                this.machine = m;
            }
        }
    }
    
    public void act()
    {   
        if (this.machine != null)
        {
            if (this.machine.inSlot(this))
            {
                this.getWorld().removeObject(this);
                this.machine.insertCoin(this.getValue());
            }
            else if (this.machine.inWell(this))
            {
                final int xDistance = this.getX() - this.machine.slotTarget().x;
                final int yDistance = this.getY() - this.machine.slotTarget().y;
                this.setLocation(this.machine.slotTarget().x + (7 * xDistance) / 8,
                                 this.machine.slotTarget().y + (7 * yDistance) / 8);
            }
        }
    }
}
