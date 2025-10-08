import java.util.Scanner;

public class ChalExercise3
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students are in the class? ");
        int numStudents = input.nextInt();

        double total = 0;
        int passCount = 0;

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter score for student " + i + ": ");
            int score = input.nextInt();

            if (score >= 50) {
                System.out.println("Pass");
                passCount++;
            } else {
                System.out.println("Fail");
            }

            total += score;
        }

        double average =  total / numStudents;
        System.out.println("Class average score: " + average);
        System.out.println("Number of students who passed: " + passCount);
    }
}
