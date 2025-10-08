import java.util.Scanner;

public class ChalExercise1
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even");
                evenCount++;
            } else {
                System.out.println(number + " is odd");
            }
        }

        System.out.println("You entered " + evenCount + " even numbers.");
    }
}
