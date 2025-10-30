import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a FortuneTeller object
        FortuneTeller teller = new FortuneTeller();

        // 1. Random fortune
        teller.sayRandomFortune();

        // 2. Personal fortune
        System.out.print("\nEnter your name: ");
        String name = input.nextLine();
        teller.personalFortune(name);

        // 3. Future prediction
        System.out.print("\nEnter your age: ");
        int age = input.nextInt();
        String prediction = teller.futurePrediction(age);
        System.out.println(prediction);
    }
}

