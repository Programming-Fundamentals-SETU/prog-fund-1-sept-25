
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class T{
//fields
private int balance;

public int refundBalance(){
     int amountToRefund;
     amountToRefund = balance; 
     balance = 0; 
     return amountToRefund;
}
}