import greenfoot.*;

/** 
 * @author mulhern
 * @version 1.0
 */
public class Canvas extends World
{
    public Canvas()
    {  
        super(Configuration.WIDTH, Configuration.HEIGHT, 1);
        this.addMachine(3,3);
    }
    
    public void addMachine(int ticketPrice, int machineTotal)
    {
        this.addObject(new Machine(Configuration.WIDTH,
                                         Configuration.HEIGHT,
                                         ticketPrice,
                                         machineTotal),
                       Configuration.WIDTH / 2,
                       Configuration.HEIGHT / 2);
    }
}
