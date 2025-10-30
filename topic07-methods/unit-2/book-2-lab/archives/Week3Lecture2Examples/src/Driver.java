import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        ClassExamples ce = new ClassExamples();
        double cel = ce.farenheitToCelsius(451);
        System.out.println(cel);

        int numToBeCubed = 5;
        int cubedAns = ce.cubed(numToBeCubed);
        System.out.println(numToBeCubed + " cubed is " + cubedAns);

        double a = 20.5;
        double b = 3.5;
        System.out.println(" The product of " + a + " and " + b + " is " + ce.product(a, b));

        double c = 12;
        double d = 3.5;
        ce.addNum(c, d);

        System.out.println("factorial(5) using recursion "+ ce.factorialRecursion(5));
        System.out.println("factorial(5) using loop "+ ce.factorialLoop(5));

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an 1st number : ");
        int num1 = in.nextInt();
        System.out.println("Enter an 2nd number : ");
        int num2 = in.nextInt();
        System.out.println("Enter an 3rd number : ");
        int num3 = in.nextInt();
        System.out.println(num1 +" + "  + num2 +" + " + num3 + " = " + ce.addNum(num1, num2, num3));
        System.out.println(num1 +" * "  + num2 +"  *" + num3 + " = " + ce.product(num1, num2, num3));
        System.out.println("The max of " + num1 +" , "  + num2 +" , " + num3 + " = " + ce.max(num1, num2, num3));

    }
}
