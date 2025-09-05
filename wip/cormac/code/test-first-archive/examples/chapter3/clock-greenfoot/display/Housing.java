package display;

import java.awt.Color;
import java.awt.Point;

import greenfoot.*;

import clock.Clock;

public class Housing extends ClockComponent {

    private int dialRadius;
    private ClockDial hourDial;
    private ClockDial minuteDial;
    private ClockHand hourHand;
    private ClockHand minuteHand;
    private int width;
    private int height;
    private Clock clock;
    private GreenfootImage cachedImage;

    public Housing(final int dialRadius,
                   final Clock clock)
    {
        super(null);
        this.dialRadius = dialRadius;
        this.clock = clock;
        this.width = 2 * dialRadius * 2 + 40;
        this.height = 2 * dialRadius + 50;

        final int offset = this.dialRadius + 10; 

        this.hourDial = new ClockDial(dialRadius,
                                      this.clock.getHoursPerCycle(), 
                                      new Point(-offset, -10),
                                      this);
        this.hourHand = new ClockHand(this.hourDial.getMarkerRadius(),
                                      this.clock.getHoursPerCycle(),   
                                      new Point(-offset, -10));
        this.minuteDial = new ClockDial(dialRadius,
                                        this.clock.getMinutesPerHour(),
                                        new Point(offset, -10),
                                        this);
        this.minuteHand = new ClockHand(this.minuteDial.getMarkerRadius(),
                                        this.clock.getMinutesPerHour(),   
                                        new Point(offset, -10));
        this.cachedImage = this.getImage();
    }

    public GreenfootImage getImageWithHands()
    {
        GreenfootImage image = new GreenfootImage(this.cachedImage);
        this.placeHand(image, this.hourHand, this.clock.getHours());
        this.placeHand(image, this.minuteHand, this.clock.getMinutes());
        return image; 
    }

    void placeHand(final GreenfootImage image,
                             final ClockHand hand,
                             final int index)
    {
        GreenfootImage curHand = hand.getImage(index);
        image.drawImage(curHand,
                        this.getCenter().x + hand.getCenter().x - hand.getWidth() / 2,
                        this.getCenter().y + hand.getCenter().y - hand.getHeight() / 2);
    }

    GreenfootImage getImage()
    {
        GreenfootImage image = new GreenfootImage(this.getWidth(),
                                                  this.getHeight());
        image.setColor(Color.BLACK);
        image.fill();
        image.setColor(Color.GRAY);
        image.fillRect(5,5,this.getWidth() - 10, this.getHeight() - 10);
        this.hourDial.draw(image);
        this.minuteDial.draw(image);
        image.setColor(Color.BLACK);
        image.drawString("Hours", 10, this.getHeight() - 20);  
        image.drawString("Minutes",
                         this.getCenter().x + 10,
                         this.getHeight() - 20);  
        return image;
    }

    public int getWidth()
    {
        return this.width;
    }

    public int getHeight()
    {
        return this.height;
    }

    public Point getCenter()
    {
        return new Point(this.getWidth() / 2, this.getHeight() / 2);
    }

}
