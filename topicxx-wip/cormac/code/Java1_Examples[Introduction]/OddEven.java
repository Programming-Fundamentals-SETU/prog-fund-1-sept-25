/**
 * Program that determines if a number is odd or even. 
 *  
 * @author John
 * @version 4 Oct 2020
 * 
 * Print "Determine if a number is odd/even"
 * Prompt for number, input and store
 * If number is even then
 *     print "Even"
 * Else
 *     print "Odd"
 */

import java.util.Scanner;
public class OddEven
{
   public static void main(String args[])
   {
       System.out.println("Determine if a number is odd/even");
       System.out.print("Enter a number: ");
       
       Scanner keyboard = new Scanner(System.in);
      
       int number;
       number = keyboard.nextInt();
       
       if (number%2==0)
          System.out.println("Even");
       else
          System.out.println("Odd");
    }
}

