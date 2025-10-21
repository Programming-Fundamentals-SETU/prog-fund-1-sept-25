/** 
 * Program that displays the square of a number if not 0 
 * 
 * @author John
 * @version 4 Oct 2020
 * 
 *  1. Declare a class NumberSquaredNoZero
 *  2. Declare the main method
 *  3. Input and Store an integer number in a variable number
 *  4. If not zero then output the square of the number 
 *                 else display “I’m ignoring your request to square 0!”
 */
import java.util.Scanner; // will use class Scanner for input

// 1. Declare a class NumberSquaredNoZero
public class NumberSquaredNoZero 			
{
    // 2. Declare the main method
    public static void main( String args[ ] )
    {
        // 3. Input and Store an integer number in a variable
        Scanner keyboard = new Scanner( System.in );

        System.out.print( "Enter integer to square (no 0's please): " );
        int number = keyboard.nextInt();
        
        // 4. If not zero then output the square of the number 
        //                else display “I’m ignoring your request to square 0!”
        if (number != 0)
            System.out.printf( "Square of %d is %d\n", number, number*number);
        else   // Same as if (number== 0)
            System.out.println("I'm ignoring your request to square 0!");
    } 
}
