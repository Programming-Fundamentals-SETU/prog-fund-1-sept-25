/**
 * @author mulhern 
 * @version 1.0 
 */
package display;

import java.awt.Point;

import greenfoot.*;

class ClockHand
{
    private int radius;
    private int intervals;
    private Point center;

    ClockHand(final int radius,
              final int intervals,
              final Point center)
    {
        if (radius < 0) throw new IllegalArgumentException();
        if (intervals < 0) throw new IllegalArgumentException();
        this.radius = radius;
        this.intervals = intervals;
        this.center = center;
    }

    GreenfootImage getImage(final int index)
    {
        GreenfootImage image =
            new GreenfootImage(2 * this.radius, 2 * this.radius);
        final double radians = - Math.PI / 2 + index * Math.PI * 2 / this.intervals;
        final int xOffset =
            (int)(4 * radius / 5 * Math.cos(radians));
        final int yOffset =
            (int)(4 * radius / 5 * Math.sin(radians));
        final int xShort =
            (int)(radius * Math.cos(radians + Math.PI) / 5);
        final int yShort =
            (int)(radius * Math.sin(radians + Math.PI) / 5);
        image.drawLine(this.radius + xShort,
                       this.radius + yShort,
                       this.radius + xOffset, 
                       this.radius + yOffset);
        return image;
       
    }

    Point getCenter()
    {
        return this.center;
    }

    int getWidth()
    {
        return this.radius * 2;
    }

    int getHeight()
    {
        return this.radius * 2;
    }
}
