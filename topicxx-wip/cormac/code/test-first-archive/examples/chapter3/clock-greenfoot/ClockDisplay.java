import java.awt.Point;

import greenfoot.*;

import clock.Clock;
import display.Housing;

/**
 * @author mulhern 
 * @version 1.0
 */
public class ClockDisplay extends Actor
{
    private Housing housing;
    private Clock clock;
    
    public ClockDisplay(final int dialRadius, final int hoursPerCycle, final int minutesPerHour)
    {
        this.clock = new Clock(hoursPerCycle, minutesPerHour);
        this.housing = new Housing(dialRadius, this.clock);
        this.setImage(this.housing.getImageWithHands());
        
    }
    
    public void act()
    {
        this.clock.increment();
        this.setImage(this.housing.getImageWithHands());
    }
    
}
