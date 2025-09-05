package clock;

/**
 * @author mulhern 
 * @version 1.0
 */
public class Clock
{

    private final Counter counter;
    private final int hoursPerCycle;
    private final int minutesPerHour;
    
    public Clock(final int hoursPerCycle, final int minutesPerHour)
    {
        if (hoursPerCycle < 1)
        {
            throw new IllegalArgumentException();
        }
        if (minutesPerHour < 1)
        {
            throw new IllegalArgumentException();
        }
        this.hoursPerCycle = hoursPerCycle;
        this.minutesPerHour = minutesPerHour;
        this.counter = new Counter(this.hoursPerCycle * this.minutesPerHour, 0);
        return;
    }
    
    public void increment()
    {
        this.counter.increment();
        return;
    }
    
    public int getHours()
    {
        return this.counter.getValue() / this.minutesPerHour;
    }
    
    public int getMinutes()
    {
        return this.counter.getValue() % this.minutesPerHour;
    }
    
    public int getHoursPerCycle()
    {
        return this.hoursPerCycle;
    }
    
    public int getMinutesPerHour()
    {
        return this.minutesPerHour;
    }
        
}
