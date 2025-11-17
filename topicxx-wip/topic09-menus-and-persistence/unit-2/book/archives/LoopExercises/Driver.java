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
        input.nextLine();
        for(int i = 0; i<num; i++){
          System.out.println("Enter a name");
          String name = input.nextLine();
          if(loops.addName(name))
              System.out.println("Sucessfully Added");
          else
              System.out.println("Error adding "+ name);
          
        }
    }
    public void findIfOdd(){
        System.out.println("How many numbers to check");
        int checkNum = input.nextInt();
        
        int[] numbers = new int[checkNum];
        for(int i = 0; i< checkNum;i++){
            System.out.println("Enter number to check");
            numbers[i] = input.nextInt();
        }
        boolean ans = loops.containsOdd(numbers);
        if(ans)
          System.out.println("Contains an odd");  
        else
          System.out.println("All Even");
    }
    public void printStars(){
        System.out.println("Enter number of stars (0 to stop)"); 
        int numStars = input.nextInt();
        while(numStars != 0){
            System.out.println(loops.printStars(numStars));
            System.out.println("Enter number of stars (0 to stop)"); 
            numStars = input.nextInt();
        }
    }
    private int mainMenu(){
        System.out.print("""
                Menu
               ---------
                  1) Simple Loop
                  2) Create the Array
                  3) Print the Names
                  4) Check Numbers for odd or even
                  5) Print Stars
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
                case 4 -> findIfOdd();
                case 5 -> printStars();
                default -> System.out.println("Invalid option entered: " + option);
            }
            //pause the program so that the user can read what we just printed to the terminal window
            System.out.println("\nPress enter key to continue...");
            input.nextLine(); //second read is required - bug in Scanner class;
            // display the main menu again
            option = mainMenu();
        }
        //the user chose option 0, so exit the program
        System.out.println("Exiting...bye");
        System.exit(0);
    }
    
    
    
    
}