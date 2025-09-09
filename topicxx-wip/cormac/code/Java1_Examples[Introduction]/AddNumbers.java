/**
 * Request two numbers, add them and print the sum 
 *  
 * @author John
 * @version 4 Oct 2020
 * 
 * Print "Program to request and add two numbers"
 * Prompt for first number, input and store
 * Prompt for second number, input and store
 * Sum the numbers
 * Print "The sum is " and the sum
 * 
 * Normally the code is self explanatory and // comments are omitted
 */

import java.util.Scanner;   // Import a class Scanner for input

public class AddNumbers 
{
    public static void main( String[] args )
    {
        // create a Scanner object to get input from the keyboard
        Scanner keyboard = new Scanner( System.in );

        System.out.println("Program to request and add two integer numbers");

        int number1;        // variable to store first number
        int number2;        // variable to store second number
        int sum;            // variable to store sum of number1 and number2

        System.out.print( "Enter the first number: " );   // prompt user
        number1 = keyboard.nextInt();                     // read first number 

        System.out.print( "Enter the second number: " );  // prompt user
        number2 = keyboard.nextInt();                     // read second number

        sum = number1 + number2; // add the numbers, then store in variable sum

        System.out.printf( "The sum is %d\n", sum );      // display the sum
    }   
} // end class AddNumbers
