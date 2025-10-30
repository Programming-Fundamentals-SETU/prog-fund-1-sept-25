import java.util.Scanner;

public class DriverScanner {

    public static void main(String[] args) {


            MethodExamples me = new MethodExamples(); //create an object

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the person: ");
            String name = sc.nextLine();
            // 2 Call method with parameter / no return
            me.greet(name, 21);
            // 3 Call method with parameters / with return
            System.out.println("Enter the number to be doubled ");
            int number = sc.nextInt();
            int sum = me.timesTwo(number);
            System.out.println(number + " * 2 = " + sum);
        }
    }

