/**
 * Class Library - represents a collection of books.
 * 
 * @author 
 * @version 1.0
 */
public class Library
{
    private String libraryName = "unknown";  // up to 15 characters
    private Book[] books;
    private int maxBooks; // > 0
    private int bookCount;

    /**
     * Constructor for objects of class Library
     */
    public Library(String libraryName, int maxBooks)
    {
        setLibraryName(libraryName);
        
        if (maxBooks > 0)
            this.books = new Book[maxBooks];
        else
            this.books = new Book[10];

        this.bookCount = 0;
    }
    public void setLibraryName(String libraryName){
        
        if (libraryName != null && libraryName.length() <= 15)
            this.libraryName = libraryName;
    }
    public String getLibraryName(){
        return libraryName;
    }
    
   
    public int getBookCount(){
        return bookCount;
    }
    
    public void setBooks(Book[] books){
        this.books = books;
    }
    public Book[] getBooks() { return books;}
    public boolean addBook(Book b)
    {
        if (bookCount < books.length )
        {
            books[bookCount] = b;
            bookCount++;
            return true;
        }
        else
        {
            return false;
        }
    }
    public Book findBook(String isbn)
    {
        for (int i = 0; i < bookCount; i++)
        {
            if (books[i].getIsbn().equals(isbn))
                return books[i];
        }
        return null;
    }
    
    public boolean borrowBook(String isbn){
        Book bookToBorrow = findBook(isbn);
        if (bookToBorrow != null) 
        {
            bookToBorrow.borrowBook();
            return true;
        }
        else return false;
          
        
    }

    public int countBooksOnLoan()
    {
        int count = 0;
        for (int i = 0; i < bookCount; i++)
        {
            if (books[i].isOnLoan())
                count++;
        }
        return count;
    }

    public double calculateAverageRating()
    {
        int total = 0;
        int ratedCount = 0;
        for (int i = 0; i < bookCount; i++)
        {
            if (books[i].getRating() >= 0)
            {
                total += books[i].getRating();
                ratedCount++;
            }
        }
        if (ratedCount > 0)
            return total / ratedCount;
        else
            return 0.0;
    }

    public Book findHighestRatedBook()
    {
        if (bookCount == 0)
            return null;

        Book best = books[0];
        for (int i = 1; i < bookCount; i++)
        {
            if (books[i].getRating() > best.getRating())
                best = books[i];
        }
        return best;
    }
    private boolean isEmpty(){ return (bookCount == 0);}
    private boolean isFull() { return bookCount == books.length; } 
    
    public String listAllBooks()
    {
        if (isEmpty()) 
            return "no books in the library" ;
        else{
            String allBooks = "List of books: \n";
            
            for (int i = 0; i < bookCount; i++)
                allBooks += books[i] + "\n";
            return allBooks;
        }
    }

    public String listAvailableBooks()
    {
        if (isEmpty()) 
            return "no books in the library" ;
        else {
            String availBooks = "List of Available Books: \n";
            
            for (int i = 0; i < bookCount; i++)
             {
            if (!books[i].isOnLoan())
            {
                availBooks += books[i] + "\n";
            }
             }
            if (availBooks.equals("List of Available Books: \n"))  return "There are no available books";
            else return availBooks;
        }
    }

    @Override
    public String toString()
    {
        return ("Library: " + libraryName + " Books stored: " + listAllBooks() );
    }
}
