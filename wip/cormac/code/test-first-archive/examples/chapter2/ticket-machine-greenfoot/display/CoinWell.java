package display;

import java.awt.Color;
import java.awt.Point;

import greenfoot.*;

final class CoinWell extends MachineComponent
{
    
    CoinWell(MachineComponent parent)
    {
        super(parent);
    }

    public GreenfootImage getImage()
    {
        GreenfootImage image =
            new GreenfootImage(this.getWidth(), this.getHeight());
        image.setColor(Color.GRAY);
        image.fill();                                
        return image;
    }

    int getWidth()
    {
        return this.parent.getWidth() / 2;
    }

    int getHeight()
    {
        return this.parent.getHeight();
    }

    Point getCenter()
    {
        return new Point(-this.parent.getWidth() / 4, 0);
    }
    
}
