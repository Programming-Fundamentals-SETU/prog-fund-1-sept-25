import java.util.Scanner;   // Import a class Scanner for input
/**
 * Request two numbers, add them and print the sum 
 *  
 * @author Mairead & Siobhan
 * @version Sem 1 25
 * 
 * Print "Program to request and add two numbers"
 * Prompt for first number, input and store
 * Prompt for second number, input and store
 * Sum the numbers
 * Print "The sum is " and the sum
 */

public class AddNumbers 
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner( System.in );

        System.out.println("Program to request and add two integer numbers");

        int number1;     
        int number2;        
        int sum;            

        System.out.print( "Enter the first number: " );   // prompt user
        number1 = keyboard.nextInt();                     // read first number 

        System.out.print( "Enter the second number: " );  // prompt user
        number2 = keyboard.nextInt();                     // read second number

        sum = number1 + number2; 
        System.out.println( "The sum is: "+  sum );      // display the sum
    }   
} 
