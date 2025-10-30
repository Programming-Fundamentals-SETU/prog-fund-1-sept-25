import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an object of JokeGenerator
        JokeGenerator joker = new JokeGenerator();

        // 1. Tell a joke
        joker.tellJoke();

        // 2. Ask for name and tell a story
        System.out.print("\nEnter your name: ");
        String userName = input.nextLine();
        joker.tellStory(userName);

        // 3. Ask for age and give future message
        System.out.print("\nEnter your age: ");
        int age = input.nextInt();
        String message = joker.ageInTenYears(age);
        System.out.println(message);
    }
}
