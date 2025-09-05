package display;

import java.awt.Color;
import java.awt.Point;

import greenfoot.*;

final class CoinSlot extends MachineComponent
{
    CoinSlot(MachineComponent parent)
    {
        super(parent);
    }

    public GreenfootImage getImage()
    {
        GreenfootImage image =
            new GreenfootImage(this.getWidth(), this.getHeight());
        image.setColor(Color.BLACK);
        image.fill();
        return image;
    }

    int getWidth()
    {
        return this.parent.getWidth() / 16;
    }

    int getHeight()
    {
        return this.parent.getHeight() / 2;
    }

    Point getCenter()
    {
        return new Point(-this.parent.getWidth() / 4, 0);
    }
}
