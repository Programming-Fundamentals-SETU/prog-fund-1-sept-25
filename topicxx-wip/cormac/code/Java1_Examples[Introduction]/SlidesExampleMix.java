/**
 * A wild mixture of examples from Java Introduction slides  
 * 
 * There is no need to review this, but examples from the 
 * slides are here should you wish to explore them further.
 * 
 * @author   John
 * @version  6 Nov 2020
 */
//public
 class SlidesExampleMix
{
    public static void main(String[] args)
    {
        /*
         * Exercise 1 
         */
        {
            /*
             *   Using the print methods, each in turn:
             *   System.out.println( … )
             *   System.out.print( … )
             *   System.out.printf( format_string, … )
             *   
             *   Display three words to say hello on sequential lines
             *   e.g.   Hello     Hola    Ciao
             */
            System.out.println("Hello");
            System.out.println("Hola");
            System.out.println("Ciao");

            System.out.print("Hello\nHola\nCiao\n");

            System.out.printf("%s\n%s\n%s\n", "Hello", "Hola", "Ciao"); 
        }

        /*
         * Algebra Quadratic Expression evaluation
         */
        {
            int x = 4;
            int y = 3 * x * x + 5 * x - 8;     
            System.out.println("Evaluation of y = 3x² + 5x - 8");
            System.out.printf("y = %d, x = %d\n", y, x);
        }  
        
        /*
         * Demonstrate the ASCII codes associated with letters and digits
         * ASCII only had 128 characters, now Unicode has 1000's of characters
         */
        {
            char letter = 'A';      // Ascii (Unicode) value is 65
            char digit = '1';       // Ascii (Unicode) value is 49
            System.out.printf("%c code is %d\n", letter, (int) letter);
            System.out.printf("%c code is %d\n", digit,  (int) digit); 
            
            char nonAscii = '²';    // This is superscript 2 but only in Unicode
            System.out.printf("%c code is %d\n", nonAscii,  (int) nonAscii); 
        }
    }
}

/*
 * Show alternative Java styles in class HelloWorld1 and class HelloWorld2 
 * (classes not public as only one public class per Java source code file)
 */
class HelloWorld1           // Style one:  { on its own line.
{ 
    public static void main( String[] args ) 
    {
        System.out.println( "Hello World" );
    } 
} 

class HelloWorld2 {         // Style two:  { at end of line
    public static void main( String[] args ) {
        System.out.println( "Hello World" ); 
    } 
}

/**
 * Documentation comments, 
 * 1. File header (would be normally at top of file)
 * 2. Variable documentation
 * 3. Method documentation.
 */
/**
 *  Class to input and compare two numbers 
 *  @author  Jo McNeill
 *  @version 10 Nov 2020, 10:30
 */
class CompareMyNumbers
{
    /**
     * Description of the variable is placed here.
      */
    private int variableName;
    
    /**
      * Short one line description of what the method does.   
      *
      * A optional longer (multi-line) description can be placed here . 
      * 
      * @param  parameterName    Description text goes here  (repeat for each parameter)      
      * @return  Description of what method returns 	     ( if not of type void)
      */
}
 