/**
 * A program to find the maximum of two integer numbers
 * 
 * @author John
 * @version 15 Sep 2024
 */

import java.util.Scanner;  // Below will use the Scanner class from package java.util
                                    
public class FindMax
{// begin class

    public static void main(String[] args)
    {// begin main method
        
        System.out.print("Program to compare two numbers ");
        System.out.println(" and display the maximum value entered");

        Scanner keyboard = new Scanner(System.in); // Scanner for keyboard input (System.in)

        System.out.print("Enter 1st number: ");
        int number1;                      // Create a integer local variable to store number 1
        number1 = keyboard.nextInt();     // Request Scanner object to get next integer 
                                          // and store in variable number1
                                          
        System.out.print("Enter 2nd number: ");
        int number2 = keyboard.nextInt(); // Similar for 2nd number(get & store in number2)

        int maximum;                      // Create a local variable to store maximum value
        if (number1 > number2)            // if (condition)
            maximum = number1;            // Executed when the if condition is true
        else
            maximum = number2;            // Executed when the if condition is false

        System.out.print("The maximum of numbers entered is ");
        System.out.println( maximum );    // Displays value stored in the variable maximum
        System.out.println();             // Prints a Blank line

        /*
         * Use a separate method to find the max (Read the method below).
         *
         * Review the next 4 statements carefully and try to determine what each does
         *  In println, the + concatenates the given string and the value returned by max
         *  In printf (formatted output), the %d is a format specifier for a decimal integer
         * Change the values, compile and execute, and observe output
         */
        System.out.println("Call method max(31, 11), the result is " + max(31, 11) );
        System.out.println("Call max with the two entered numbers: " + max(number1, number2) );

        System.out.printf("max(%d,%d) is %d\n", 12, 25, max(12, 25) );
        System.out.printf("max(%d,%d) is %d\n", number1, number2, max(number1, number2) );
    }// end main method

    /**
     * Method max determines and returns the maximum value of the two parameters a and b
     * @param a  the first parameter
     * @param b  the second parameter
     * @return   the maximum of a and b
     */
    public static int max(int a, int b)
    {
        int maximum;           // Create temporary variable to hold the maximum value
        if (a > b)             // Check if the value of a is greater than the value of b
            maximum = a;       // If true, assign a to maximum
        else
            maximum = b;       // If false, assign b to maximum
        return maximum;        // Return value of maximum to the method caller
    }

} // end class

/*
 * Pseudocode (An informal description of a possible solution to find the maximum)
 *
 *     1.  Display introductory text "Program to compare two numbers and display maximum"
 *         
 *     2.  Prompt the user to enter 1st number: Display "Enter 1st number:  "
 *     3.  Input and store the 1st number
 *
 *     4.  Prompt the user to enter 2nd number: Display "Enter 2nd number:  "
 *     5.  Input and store the 2nd number
 *
 *     6.  Compare the two numbers and determine the maximum
 *             If the 1st number is greater than the 2nd number 
 *             then the maximum is the 1st number 
 *             else the maximum is the 2nd number    
 *     7.  Display "The maximum of numbers entered is: " and the maximum 
 */