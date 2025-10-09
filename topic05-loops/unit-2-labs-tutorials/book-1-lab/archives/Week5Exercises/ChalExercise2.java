import java.util.Scanner;

public class ChalExercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret = 27; // you can change this value
        int guess;
        int attempts = 0;

        System.out.println("I'm thinking of a number between 1 and 50...");

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess > secret) {
                System.out.println("Too high!");
            } else if (guess < secret) {
                System.out.println("Too low!");
            } else {
                System.out.println("You got it in " + attempts + " guesses!");
            }

        } while (guess != secret); //
    }
}