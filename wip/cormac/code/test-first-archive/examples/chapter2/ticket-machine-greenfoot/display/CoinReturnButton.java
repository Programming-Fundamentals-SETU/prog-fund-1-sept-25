package display;

import java.awt.Point;

import greenfoot.*;

final class CoinReturnButton extends MachineComponent
{
    
    private GreenfootImage image;

    CoinReturnButton(MachineComponent parent,
                     GreenfootImage image)
    {
        super(parent);
        this.image = image;
    }

    public GreenfootImage getImage()
    {
        return this.image;
    }

    int getWidth()
    {
        return this.image.getWidth();
    }

    int getHeight()
    {
        return this.image.getHeight();
    }

    Point getCenter()
    {
        return new Point(3 * (this.parent.getWidth() / 8),
	                 3 * (this.parent.getHeight() / 8));
    }
}
