
/**
 * Write a description of class print1to10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Printer
{
    public void print1to10(){
        for (int i = 1; i <= 10; i++)
    System.out.println( " i is : " + i);
        
    }
    
    public void print1toN(int n) { 
        for (int i = 1; i <= n; i++)
            System.out.println( " i is : " + i);
        }
        
    public void printMtoN(int m, int n){
         for (int i = m; i <= n; i++)
            System.out.println( " i is : " + i);
    }
}