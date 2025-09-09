package display;

import java.awt.Color;
import java.awt.Point;

import greenfoot.*;

/*
 * @author mulhern
 * @version 1.0 
 */

class ClockDial extends ClockComponent
{

    private int radius;
    private int intervals;
    private Point center;

    ClockDial(final int radius,
              final int intervals,
              final Point center,
              final ClockComponent parent)
    {
        super(parent);

        if (radius < 0) throw new IllegalArgumentException();
        if (intervals < 0) throw new IllegalArgumentException();
        this.radius = radius;
        this.intervals = intervals;
        this.center = center;

    }

    int getRadius()
    {
        return this.radius;
    }

    int getIntervals()
    {
        return this.intervals;
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

    int getMarkerRadius()
    {
        return 3 * this.radius / 4;
    }

    GreenfootImage getImage()
    {
        GreenfootImage image = new GreenfootImage(this.getWidth(),
                                                  this.getHeight());
        image.setColor(Color.BLACK);
        image.fillOval(0,
                       0,
                       this.getWidth(),
                       this.getHeight());

        image.setColor(Color.WHITE);
        image.fillOval(5,
                       5,
                       this.getWidth() - 10,
                       this.getHeight() - 10);

        final int centerRadius = this.radius / 40;
        image.setColor(Color.BLACK);
        image.fillOval(this.radius - centerRadius,
                       this.radius - centerRadius, 
		       centerRadius * 2,
 		       centerRadius * 2);

        image.setColor(Color.RED);
        for (int i = 0; i < this.intervals; i++)
        {
            final double radians = - Math.PI / 2 + i * Math.PI * 2 / this.intervals;
            final int xOffset =
                (int)(this.getMarkerRadius() * Math.cos(radians));
	    final int yOffset =
                (int)(this.getMarkerRadius() * Math.sin(radians));
	    final int pointRadius = this.radius / 30;
            image.fillOval(this.getWidth() / 2 + xOffset - pointRadius / 2,
                           this.getHeight() / 2 + yOffset - pointRadius / 2,
                           pointRadius,
                           pointRadius);
        }
        return image;
    }


}
