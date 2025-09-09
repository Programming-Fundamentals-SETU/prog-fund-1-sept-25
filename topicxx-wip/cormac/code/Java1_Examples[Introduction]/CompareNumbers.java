/**
 * Request two numbers, compare for equality and the relationship between them
 *  
 * @author John
 * @version 3 Oct 2024
 * 
 * Print "Program to request and compare two numbers"
 * Prompt for first number, input and store
 * Prompt for second number, input and store
 * Compare the numbers using equality and relational operators 
 *   == is Equals      != is Not Equals     < > <= >= relational
 * System.out.printf used for formatted output (more details later).
 */
import java.util.Scanner; 

public class CompareNumbers 
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner( System.in );

        System.out.print( "Enter first integer: " ); 
        int number1 = keyboard.nextInt(); 

        System.out.print( "Enter second integer: " ); 
        int number2 = keyboard.nextInt(); 

        if ( number1 == number2 ) 
            System.out.printf( "%d == %d   %s\n", number1, number2, "Equals" );

        if ( number1 != number2 )
            System.out.printf( "%d != %d   %s\n", number1, number2, "Not Equals" );

        if ( number1 < number2 )
            System.out.printf( "%d < %d    %s\n", number1, number2, "Less than" );

        if ( number1 > number2 )
            System.out.printf( "%d > %d    %s\n", number1, number2, "Greater than" );

        if ( number1 <= number2 )
            System.out.printf( "%d <= %d   %s\n", number1, number2, "Less than or equal" );

        if ( number1 >= number2 )
            System.out.printf( "%d >= %d   %s\n", number1, number2, "Greater than or equal" );
    } 
} 
