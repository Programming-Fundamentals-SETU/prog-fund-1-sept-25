import java.util.Scanner;
/**
 * Write a description of class ProductDouble here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductDouble
{
    
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    System.out.printf("product is %f" ,number1 * number2);
    
    }
}
