import java.util.Scanner;

/**
 * This class asks the user to enter their name, address, age and date of birth.
 * The entered data is then printed out to the user.
 *
 * @author (WIT)
 * @version (1.0)
 */

public class Driver {

    public static void main(String[] arg) {
         Scanner sc = new Scanner(System.in);
//obtaining the data from the user
        System.out.println("Entering details");
        System.out.println("----------------");
        System.out.print("   Enter your name:          ");
        String name = sc.nextLine();
        System.out.print("   Enter your address:       ");
        String address = sc.nextLine();
        System.out.print("   Enter your date of birth: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("   Enter your height         ");
        double height = sc.nextDouble();
        System.out.println();
        //printing out the data to the user
        System.out.println("\n\nPrinting details");
        System.out.println("----------------");
        System.out.println(
        "User Entered {" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", height=" + height +
                '}');
    }





}

