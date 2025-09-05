/** 
 * Program that displays the square of a number (in file NumberSquared.java)
 * 
 * @author John
 * @version 4 Oct 2020
 * 
 *  1. Declare a class NumberSquared
 *  2. Declare the main method
 *  3. Input and Store an integer number in a variable number
 *  4. Output the square of the number
 */
import java.util.Scanner; // will use class Scanner for input

// 1. Declare a class NumberSquared
public class NumberSquared          
{
    // 2. Declare the main method
    public static void main( String args[ ] )
    {
        // 3. Input and Store an integer number in a variable number
        Scanner keyboard = new Scanner( System.in );
        
        System.out.print( "Enter integer to square: " );
        int number = keyboard.nextInt();
        
        // 4. Output the square of the number
        System.out.printf( "Square of %d is %d\n", number, number*number);
    } 
}