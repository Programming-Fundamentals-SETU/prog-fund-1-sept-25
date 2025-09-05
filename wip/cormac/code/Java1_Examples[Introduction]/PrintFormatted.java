/**
 * Print lines of text using printf and formatters  
 *  
 * @author John
 * @version 4 Oct 2020
 * 
 * printf   print formatted where the first string contains characters to print as is
 *          and special formatters such as %s to display a String, 
 *          %7s which means to display the string a field width of 7 characters
 */
public class PrintFormatted 
{
    public static void main( String[] args )
    {
        System.out.printf( "%s\n", "Hello World" );
        
        System.out.printf( "# %s #\n", "Welcome to Java Programming" );

        System.out.printf( "\n%7s\n\n", "at the" ); 
        
        System.out.printf( "%s\n%5s\n%9s\n", "University", "of", "Limerick" );
    } 
} 

