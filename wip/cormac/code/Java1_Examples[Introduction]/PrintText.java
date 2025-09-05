/**
 * Print lines of text using print and println
 * 
 * @author John
 * @version 4 Oct 2020
 * 
 * The execution of a Java application begins at the main method
 * The begin and end of a class and method are delimited with { }
 * 
 * A String represents characters strings and must be enclosed in "" 
 * print    print and remain on the same line
 * println  print and move to the start of the next line
 * \n       is an escape character indicating 
 */
public class PrintText 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World");
        
        System.out.print( "# Welcome to " );
        System.out.println( "Java Programming #" );
        
        // can use \n to insert a newline, and start at the next line
        System.out.print( "\n at the\n\nUniversity\n    of\n Limerick" );
    } 
}
