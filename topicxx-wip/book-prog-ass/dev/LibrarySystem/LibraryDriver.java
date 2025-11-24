import java.util.Scanner;

/**
 * Class LibraryDriver - provides a menu-driven interface to test the Library system.
 * 
 * @author 
 * @version 1.0
 */
public class LibraryDriver
{
    Scanner input ;
    String libraryName;
    Library lib;
    
    LibraryDriver(){
 
        input = new Scanner(System.in);
        System.out.print("Enter in the name of the Library: ");
        String libraryName = input.nextLine();
        
        System.out.print("Enter the maximum number of books that the library can hold : ");
        int maxBooks = input.nextInt();
        
        lib = new Library(libraryName, maxBooks);
        runMenu();  

    }
    public static void main(String[] args)
    {
        new LibraryDriver();
    }
        
   
    
    
    private void runMenu(){
        int option = chooseOption();
        
        while (option != 0) {
            

            switch (option) {
                case 1 -> {
                    input.nextLine();
                    System.out.print("Enter title: ");
                    String title = input.nextLine();
                    System.out.print("Enter author: ");
                    String author = input.nextLine();
                    System.out.print("Enter ISBN (13 digits): ");
                    String isbn = input.nextLine();
                    Book b = new Book(title, author, isbn);
                    lib.addBook(b);
                }

                case 2 -> {
                    System.out.print("Enter ISBN to borrow: ");
                    String isbn = input.nextLine();  //todo
                    if (lib.borrowBook(isbn)) System.out.println("Book sucessfully borrowed");
                    else System.out.println("Book already on loan.");
        
                    }

                case 3 -> {
                    System.out.print("Enter ISBN to return: ");
                    String isbn = input.nextLine();
                    Book b = lib.findBook(isbn);
                    if (b != null && b.isOnLoan()){
                        b.returnBook();
                         System.out.println("Book sucessfully out on loan");
                        }
                    else
                        System.out.println("Book not found or not out on loan");
                    }

                case 4 -> {
                    System.out.print("Enter ISBN to rate: ");
                    String isbn = input.nextLine();
                    Book b = lib.findBook(isbn);
                    if (b != null) {
                        System.out.print("Enter rating (0–5): ");
                        int rating = input.nextInt();
                        b.setRating(rating);
                    } else
                        System.out.println("Book not found.");
                    }

                case 5 -> 
                    System.out.println(lib.listAllBooks());
                   

                case 6-> 
                    System.out.println(lib.listAvailableBooks());
                   

                case 7-> 
                    System.out.println("Average rating: "+  lib.calculateAverageRating());
                  

                case 8 -> {
                    Book best = lib.findHighestRatedBook();
                    if (best != null)
                        System.out.println("Highest-rated book:\n" + best);
                    else
                        System.out.println("No rated books.");
                    }

                case 9-> 
                    System.out.println("Goodbye!");
                  

                default -> 
                    System.out.println("Invalid option. Try again.");
            }
            option = chooseOption();
        }

         System.out.println("Goodbye");
    }
    private int chooseOption(){
        System.out.println("\n==== Library Menu ====");
            System.out.println("1. Add new book");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Rate a book");
            System.out.println("5. List all books");
            System.out.println("6. List available books");
            System.out.println("7. Show average rating");
            System.out.println("8. Show highest-rated book");
            System.out.println("9. Quit");
            System.out.print("Enter option: ");

            int option = input.nextInt();
            return option;
    }
}
