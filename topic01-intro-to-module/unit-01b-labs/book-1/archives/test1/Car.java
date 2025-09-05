
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    private int chassisNo;
    private int colour;

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        // initialise instance variables
        chassisNo = 1005;
        colour = 3;
    }

      public Car(int newValue)
    {
        // initialise instance variables
        chassisNo = newValue;
        colour = 3;
    }
    
    public Car(int newValueCN, int newValueCl)
    {
        // initialise instance variables
        chassisNo = newValueCN;
        colour = newValueCl;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return chassisNo;
    }
}
