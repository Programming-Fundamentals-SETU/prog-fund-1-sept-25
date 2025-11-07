/**
 * Class Book - represents one book in the library.
 * 
 * @author 
 * @version 1.0
 */
public class Book
{
    // Instance variables
    private String title;    // 10 characters
    private String author;  // 20 characters
    private String isbn = "0000000000000";    // 13 characters
    private boolean onLoan;
    private int rating;  // 0 -> 5

    /**
     * Constructor for objects of class Book
     */
    public Book(String title, String author, String isbn)
    {
        initTitle(title);
        initAuthor(author);
        setIsbn(isbn);
        this.onLoan = false;
        this.rating = 0;
    }

    // Validation and accessors

    public void setTitle(String title)
    {
        if (title != null && title.length() <= 10)
            this.title = title;
        
    }
    public void initTitle(String title)
    {
        if (title != null && title.length() <= 10)
            this.title =title;
        else
            this.title = title.substring(0,10);
    }

    public String getTitle()
    {
        return title;
    }

    public void initAuthor(String author)
    {
        if (author != null && author.length() <= 20)
            this.author = author;
        else
            this.author = author.substring(0,20);
    }
    public void setAuthor(String author)
    {
        if (author != null && author.length() <= 20)
            this.author = author;
        
    }

    public String getAuthor()
    {
        return author;
    }
    public void initIsbn(String isbn)
    {
        if (isbn != null && isbn.length() == 13)
            this.isbn = isbn;
        else
            this.isbn = "0000000000000";
    }
    public void setIsbn(String isbn)
    {
        if (isbn != null && isbn.length() == 13)
            this.isbn = isbn;
        
    }

    public String getIsbn()
    {
        return isbn;
    }

    public boolean isOnLoan()
    {
        return onLoan;
    }
    
    public void setOnLoan(boolean onLoan){
        this.onLoan = onLoan;
    }

    public boolean borrowBook()
    {
        if (!onLoan){
            onLoan = true;
            return true;
        }
        else
            return false;
    }

    public void returnBook()
    {
        if (onLoan)
            onLoan = false;
        else
            System.out.println("Book was not on loan.");
    }

    public void setRating(int rating)
    {
        if (rating >= 0 && rating <= 5)
            this.rating = rating;
        
    }

    public double getRating()
    {
        return rating;
    }

    @Override
    public String toString()
    {
        String onLoanYesNo = (onLoan? "Yes" : "No") ;
        return ("Title: " + title +  " Author: " + author + " : ISBN: " + isbn+ " : on Loan? : " 
                + onLoanYesNo +   "  Rating : " +  rating + " Stars" ) ;
    }
}
