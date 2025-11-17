import java.util.Scanner;
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    // public static void main(String[] args) {
        // int i = 0;
        // while (i <10) {
            // System.out.println(i + ": Hello");
            // i++;
        // }
    // }
    
    // public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int[] numbers = new int[10];
        // int sum = 0;
        
        // for (int i = 0; i< 5 ; i++) {
            // System.out.print("Please enter a number: ");
            // numbers[i] = input.nextInt();
            // sum+= numbers[i];
        // }
        
        // System.out.print("The sum of all the entered numbers is : " + sum);
        
    // }
     // public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int[] numbers;
        // int numNumbers = 0;
        // int sum = 0;
        // System.out.print("Please enter the number of numbers you want to enter: ");
        // numNumbers = input.nextInt();
        // numbers = new int[numNumbers];
        
        // for (int i = 0; i< numNumbers ; i++) {
            // System.out.print("Please enter a number: ");
            // numbers[i] = input.nextInt();
            // sum+= numbers[i];
        // }
        
        // System.out.print("The sum of all the entered numbers is : " + sum);
        
    // }
    
    // public static void main(String[] args) { //sentinel while loop
        // Scanner input = new Scanner(System.in);

        // int sum = 0;
        // System.out.print("Please enter the number, -1 ends input: ");
        // int n = input.nextInt();
    
        
        // while (n != -1) {

             // sum+= n;
             // System.out.print("Please enter the number, -1 ends input: ");
             // n = input.nextInt();
        // }
        
        // System.out.print("The sum of all the entered numbers is : " + sum);
        
    // }
    // public static void main(String[] args) { //sentinel while loop
        // Scanner input = new Scanner(System.in);

        // int sum = 0;
        // int counter= 0;
        // System.out.print("Please enter the number, -1 ends input: ");
        // int n = input.nextInt();
    
        
        // while (n != -1) {
             // counter++;
             // sum+= n;
             // System.out.print("Please enter the number, -1 ends input: ");
             // n = input.nextInt();
        // }
        
        // System.out.println("The sum of all the entered numbers is : " + sum);
        // System.out.println("The number of entered numbers is : " + counter);
        
    // }
        public static void main(String[] args) { //storing input
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int counter= 0;
        int numbers[] = new int[100];
        System.out.print("Please enter the number, -1 ends input: ");
        int n = input.nextInt();
    
        
        while (n != -1 && counter < 100) {
             numbers[counter] = n;
             sum+= n;
             counter++;
             System.out.print("Please enter the number, -1 ends input: ");
             n = input.nextInt();
        }
        
        System.out.println("The sum of all the entered numbers is : " + sum);
        System.out.println("The number of entered numbers is : " + counter);
        
        for (int i = 0; i < counter; i++){
            System.out.println(i + "     Number entered: " + numbers[i]);
        }
    }
}