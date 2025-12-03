
/**
 * Write a description of class Driiver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your VirtualPet's name: ");
        String name = sc.nextLine();
        System.out.print("""
                        What type of animal is it?
                        1. Rabbit
                        2. Dog
                        3. Cat
                        4. Bear
                        5. Bird""");
        int type = sc.nextInt();
        VirtualPet pet = new VirtualPet(name, type);

        int choice = 0;

        while (!pet.isDead() && choice != 6) {
            System.out.println("\n" + pet);
            System.out.println("\n1. Work\n2. Sleep\n3. Eat\n4. Play\n5. Do Nothing\n6. Quit");
            System.out.print("Choose an action: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> pet.work();
                case 2 -> pet.sleep();
                case 3 -> pet.eat();
                case 4 -> pet.play();
                case 5 -> pet.passTime();
                case 6 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice");
            }
            System.out.println(pet); //print out statistics
            pet.passTime();  // Time always passes
            
        }

        if (pet.isDead()) {
            System.out.println("\n💀 Your VirtualPet has died.");
        }
    }
}
