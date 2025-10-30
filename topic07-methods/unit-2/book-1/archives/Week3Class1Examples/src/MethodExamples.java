import java.util.Scanner;

public class MethodExamples {
    // 1️ Method with NO parameters and NO return
    public  void sayHello() {
        System.out.println("Hello!");
    }
    // 2️ Method with PARAMETERS and NO return
    public  void greet(String name, int age) {
        System.out.println("Hello, " + name + ", you are "
                + age + " years old.");
    }
    // 3️ Method with PARAMETERS and WITH return
    public  int timesTwo(int a) {
        return a * 2;
    }

}

