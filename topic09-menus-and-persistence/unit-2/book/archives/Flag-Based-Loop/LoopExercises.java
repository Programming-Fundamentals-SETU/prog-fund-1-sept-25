
/**
 * Write a description of class LoopExercises here.
 *
 * @author (Mairead, Siobhan )
 * @version (11/11/25
 */
public class LoopExercises
{
  public static void  main(String[] args) {
      
      if  (flagBasedLoopWithReturn() ){
       System.out.println("There is at least one odd number in the array");
       }
      else {
       System.out.println("There is NO  odd numbers in the array");
    }
          
  }
    
  
  public static void flagBasedLoopWithArray(){
      int numbers[] = {4,6,8,7,10,12};
      boolean oddNumberInArray = false;
      
      for(int i = 0; i< numbers.length; i++)
      if (numbers[i] %2 == 1) {   //check if it is odd
         oddNumberInArray = true;
      }
      
      if (oddNumberInArray) 
          System.out.println("There is at least one odd number in the array");
      else 
          System.out.println("There is NO  odd numbers in the array");
      
  }
  
  public static boolean flagBasedLoopWithReturn(){
      int numbers[] = {4,6,8,7,10,12};
      boolean oddNumberInArray = false;
      
      for(int i = 0; i< numbers.length; i++)
      if (numbers[i] %2 == 1) {   //check if it is odd
         oddNumberInArray = true;
      }
      
      return oddNumberInArray;
        
  }
}