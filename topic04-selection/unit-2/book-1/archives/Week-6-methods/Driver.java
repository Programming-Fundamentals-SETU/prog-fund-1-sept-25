import java.util.Scanner;
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Maths m = new Maths();
        System.out.println("Enter number");
        int num = input.nextInt();
        System.out.println("The factorial of :" + num + "  is: " + m.factorial(num));
 
    }
    
}