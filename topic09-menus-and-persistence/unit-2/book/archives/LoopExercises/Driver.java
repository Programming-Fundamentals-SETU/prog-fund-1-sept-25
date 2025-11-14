import java.util.Scanner;


public class Driver
{
    Loops loops = new Loops();
    Scanner input = new Scanner(System.in);
    public static void main(String args[]){
                new Driver();
    }
    
    public Driver(){
        runMenu();
    }
    
    public void createNames(){
        System.out.println("How many names to enter");
        int namesNum = input.nextInt();
        loops.sizeArray(namesNum);
        getNames(namesNum);
    }
    public void getNames(int num){
        
        for(int i = 0; i<num; i++){
          input.nextLine();
          System.out.println("Enter a name");
          
          
        }
    }
    
    private int mainMenu(){
        System.out.print("""
                Menu
               ---------
                  1) Simple Loop
                  2) Create the Array
                  3) Print the Names
                  0) Exit
               ==>> """);
        int option = input.nextInt();
        return option;
    }

    private void runMenu(){
        int option = mainMenu();
        while (option != 0){
            switch (option){
                case 1 -> System.out.println(loops.simpleWhile());
                case 2 -> createNames();
                case 3 -> System.out.println(loops.listNames());
            
                default -> System.out.println("Invalid option entered: " + option);
            }
            //pause the program so that the user can read what we just printed to the terminal window
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine(); //second read is required - bug in Scanner class;
            // display the main menu again
            option = mainMenu();
        }
        //the user chose option 0, so exit the program
        System.out.println("Exiting...bye");
        System.exit(0);
    }
    
}