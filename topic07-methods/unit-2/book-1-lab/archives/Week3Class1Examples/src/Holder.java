import java.util.Scanner;

public class Holder {

    // 1️ Method with NO parameters and NO return
    public  void sayHello() {
        System.out.println("Hello! 👋");
    }

    // 2️ Method with PARAMETERS and NO return
    public  void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 3️ Method with NO parameters but WITH return
    public  int getLuckyNumber() {
        return 7;
    }

    // 4️ Method with PARAMETERS and WITH return
    public  int timesTwo(int a) {
        return a * 2;
    }

    // Main method to test them all
    public static void main(String[] args) {
        Holder me = new Holder();
        // 1 Call method with no parameters / no return
        me.sayHello();

        // 2️ Call method with parameters / no return
        me.greet("Alice");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        me.greet(name);
        // 3️ Call method with no parameters / with return
        int lucky = me.getLuckyNumber();
        System.out.println("Your lucky number is: " + lucky);

        // 4️ Call method with parameters / with return
        int sum = me.timesTwo(5);
        System.out.println("5 * 2 = " + sum);
    }
}
