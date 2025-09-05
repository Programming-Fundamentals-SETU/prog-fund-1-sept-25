package display;

import java.awt.Point;

import greenfoot.*;

/**
 * @author mulhern 
 * @version 1.0
 */
final public class MachineDisplay extends MachineComponent 
{
    private CoinWell coinWell;
    private CoinSlot coinSlot;
    private DisplayArea displayArea;
    private CoinReturnButton coinReturnButton;
    private int x;
    private int y;
    private int width;
    private int height;
   
    
    public MachineDisplay(int width, int height, int x, int y)
    {
        super(null);
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.coinWell = new CoinWell(this);
        this.coinSlot = new CoinSlot(this);
        this.displayArea = new DisplayArea(this);
                                           
        this.coinReturnButton =
            new CoinReturnButton(this, new GreenfootImage("beeper.png"));
                                                     
    }

    public GreenfootImage getImage()
    {
        GreenfootImage image =
            new GreenfootImage(this.getWidth(), this.getHeight());
        this.coinWell.draw(image);
        this.coinSlot.draw(image);
        this.displayArea.draw(image);
        this.coinReturnButton.draw(image);
        return image;
    }

    int getHeight()
    {
        return this.height;
    }

    int getWidth()
    {
        return this.width;
    }

    Point getCenter()
    {
        return new Point(this.width / 2, this.height / 2);
    }
    
    int getX() {
        return this.x;
    }
    
    int getY() {
        return this.y;
    }
    
    public Point slotTarget()
    {
        return new Point(this.coinSlot.getX(), this.coinSlot.getY());
    }
    
    public Point ticketReturnLocation()
    {
        return new Point(this.getX() + width / 4, this.getY());
    }
    
    public Point coinReturnLocation()
    {
        return new Point(this.getX() + width / 4, this.getY() + height / 4);
    }
    
    public boolean buttonClicked(MouseInfo info)
    {
        return info.getClickCount() > 0 &&
               this.coinReturnButton.contains(info.getX(), info.getY());
    }
    
    public boolean displayAreaClicked(MouseInfo info)
    {
        return !this.buttonClicked(info) &&
               info.getClickCount() > 0 &&
               this.displayArea.contains(info.getX(), info.getY());
    }
    
    public boolean inWell(Actor actor)
    {
        return this.coinWell.contains(actor);
    }

    public boolean inSlot(Actor actor)
    {
        return this.coinSlot.contains(actor);
    }
}
