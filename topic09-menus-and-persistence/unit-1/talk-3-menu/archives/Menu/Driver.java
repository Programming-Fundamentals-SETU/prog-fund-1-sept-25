import java.util.Scanner;
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
   Scanner input = new Scanner(System.in);
    
   public Driver(){
      //runMenu();
      //printMenu();
      mainMenu();
   }

// private void runMenu(){ 
    // int choice;
    // System.out.println("Choose a number between 1 and 3, 0 to exit: ");
    // choice = input.nextInt();
    
    // while (choice != 0){
        // switch (choice) {
            // case 1 -> System.out.println("You chose 1.");
            // case 2 -> System.out.println("You chose 2.");
            // case 3 -> System.out.println("You chose 3.");
            // default -> System.out.println("Invalid option entered");
        // }
        
        // System.out.println("Choose a number between 1 and 3, 0 to exit: ");
        // choice = input.nextInt();
        
        // }
        // System.out.println("Thanks and goodbye");
    // }
    // private void runMenu(){ 
    // int choice;
    // System.out.println("Choose a number between 1 and 3, 0 to exit: ");
    // choice = input.nextInt();
    
    // while (choice != 0){
        // switch (choice) {
            // case 1 -> {
                // System.out.println("You chose 1.");
                // System.out.println("You chose one.");           
            // }
            // case 2 -> System.out.println("You chose 2.");
            // case 3 -> System.out.println("You chose 3.");
            // default -> System.out.println("Invalid option entered");
        // }
        
        // System.out.println("Choose a number between 1 and 3, 0 to exit: ");
        // choice = input.nextInt();
        
        // }
        // System.out.println("Thanks and goodbye");
    // }
     private void runMenu(){ 
    int choice;
    System.out.println("Choose a number between 1 and 3, 0 to exit: ");
    choice = input.nextInt();
    
    while (choice != 0){
        switch (choice) {
            case 1 -> {
                System.out.println("You chose 1.");
                System.out.println("You chose one.");           
            }
            case 2 -> System.out.println("You chose 2.");
            case 3 -> System.out.println("You chose 3.");
            default -> System.out.println("Invalid option entered");
        }
        
        System.out.println("Choose a number between 1 and 3, 0 to exit: ");
        choice = input.nextInt();
        
        }
        System.out.println("Thanks and goodbye");
    }
    
    private void printMenu(){
        System.out.println("""
        This is a new way of writing
        many  lines in a particular 
        format""");  
    }
    private int mainMenu(){
        System.out.print("""
        Shop Menu
        ---------
            1) Add a product
            2) List the products
            ------------------------------------
            3) List the current products
            4) Display average product unit cost
            5) Display cheapest product
            6) List products that are more expensive than a given price
            -------------------------------------
            0) Exit
            ===>> """);
            int option = input.nextInt();
            return option;
        }
}