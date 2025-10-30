import java.util.Scanner;

public class Driver
{
  // main method to test all methods  
  public static void main(String[] args){
      Scanner input = new Scanner(System.in); // create the scanner object
      MethodExamples me = new MethodExamples();// create the 'me' object.
      // 1.call method with no parameters, no return
      me.sayHello();
      // 2.call method with parameter / no return
      me.greet("Rory McIlroy", 36);
      //3. call method using input data
      System.out.println("Enter your  name: ");
      String name = input.nextLine();
      
      System.out.println("Enter your  age: ");
      int age = input.nextInt();
      
      me.greet(name, age);
  } 
}