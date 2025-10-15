
/**
 * Write a description of class Maths here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maths
{
    public int timesTwo(int n){
        int val = n *2;
        return val;
    }
    
    public int timesTwo2(int n){
        return n *2;
    }
    
    public int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <=n; i++){
            fac *=i;
        }
        return fac;
    }
    public long factorialLong(int n) {
        long fac = 1;
        for (int i = 1; i <=n; i++){
            fac *=i;
        }
        return fac;
    }
    
}