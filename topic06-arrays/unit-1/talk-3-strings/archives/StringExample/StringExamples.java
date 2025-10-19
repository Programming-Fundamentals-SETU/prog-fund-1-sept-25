
/**
 * Write a description of class StringExamples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringExamples
{
    

    /**
     * Constructor for objects of class StringExamples
     */
    public StringExamples()
    {
        
    }
     public static void main(String[] args) {
        String message = "      HTTP 404 Not Fount Error    ";
        int originalMessageLength = message.length();
        
        String trimmedMessage = message.trim();
        int trimmedMessageLength = trimmedMessage.length();
        
        System.out.println("The original message ["+ message + "] is " 
            + originalMessageLength + " characters long");
        System.out.println("The trimmed message ["+ trimmedMessage + "] is " 
            + trimmedMessageLength + " characters long");
        }
    
    
    // public static void main(String[] args) {
        // String message = "I wonder how long this message is?";
        // System.out.println("The string in lowercase is: " + message.toLowerCase() );
    // }
    

    // public static void main(String[] args) 
    // {
        // String message = "I wonder how long this message is?";
        // System.out.println("It is " + message.length() + " characters long");
    // } 
    
    
    // public static void main(String[] args) 
    // {
        // char letter = 'A';
        // for (int i = 1; i<=26; i++){
          // System.out.println(letter);
          // letter++;
    // } 
//}
}