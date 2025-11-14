import java.util.Scanner;


public class Driver
{
    Loops loops = new Loops();
    Scanner input = new Scanner(System.in);
    public static void main(String args[]){
                new Driver();
    }
    
    public Driver(){
        System.out.println(loops.simpleWhile());
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
}