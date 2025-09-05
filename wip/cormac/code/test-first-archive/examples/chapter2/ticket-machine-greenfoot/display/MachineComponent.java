package display;

import java.awt.Point;
import java.awt.Rectangle;
import greenfoot.*;

abstract class MachineComponent
{
    protected MachineComponent parent;
    
    MachineComponent(MachineComponent parent)
    {
        this.parent = parent;
    }

    abstract int getWidth();
    abstract int getHeight();
    public abstract GreenfootImage getImage();
    abstract Point getCenter();
    
    
    int getX() {
        return this.parent.getX() + this.getCenter().x;
    }
    
    int getY() {
        return this.parent.getY() + this.getCenter().y;
    }
    
    public boolean contains(Actor actor)
    {
        return this.contains(actor.getX(), actor.getY());
    }
    
    boolean contains(int x, int y)
    {
        return new Rectangle(this.getX() - this.getWidth() / 2,
                             this.getY() - this.getHeight() / 2,
                             this.getWidth(),
                             this.getHeight()).contains(x,y);
    }
    
    void draw(GreenfootImage image)
    {
        image.drawImage(this.getImage(),
                        this.parent.getCenter().x + this.getCenter().x - this.getWidth() / 2,
                        this.parent.getCenter().y + this.getCenter().y - this.getHeight() / 2);
    }
}
