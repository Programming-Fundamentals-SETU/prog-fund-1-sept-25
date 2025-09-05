/** 
 * Program that demonstrates different number bases: Decimal, Octal, Hexadecimal. 
 * 
 * @author John
 * @version 9 Oct 2021
 */
import java.util.Scanner; 

public class NumberBases            
{
   public static void main( String args[ ] )
   {
      Scanner keyboard = new Scanner( System.in );
      
      System.out.print( "Enter integer: " );
      int number = keyboard.nextInt();
      
      System.out.printf( "Number entered (in decimal) is %d\n", number);    
      System.out.printf( "Number in octal (oct)       is %o\n", number);
      System.out.printf( "Number in hexadecimal (hex) is %X\n", number);
      System.out.println();
      
      int num1 = 31;          // Decimal value is 31
      int num2 = 031;         // Decimal value is 25
      int num3 = 0x31;        // Decimal value is 49
      int num4 = 0b11111;     // Decimal value is 31
     
      System.out.println("Number values can be represented in decimal, hexadecimal, octal, binary");
      System.out.printf("In code, prefix: hex 0x or 0X, oct 0, binary 0b or 0B \n\n");
      
      System.out.println("Number values can be printed using printf in decimal, hexadecimal, or octal");
      System.out.printf("\nConsider: num1=%d, num2=0%o, num3=0x%x, num4=0b11111\n", num1, num2, num3);
      
      System.out.printf("\t  num1 = 31:       Dec %d, Oct %o, Hex %x\n", num1, num1, num1 );
      System.out.printf("\t  num2 = 031:      Dec %d, Oct %o, Hex %x\n", num2, num2, num2 );
      System.out.printf("\t  num3 = 0x31:     Dec %d, Oct %o, Hex %x\n", num3, num3, num3 );
      System.out.printf("\t  num4 = 0b11111:  Dec %d, Oct %o, Hex %x\n", num4, num4, num4);
   } 
}