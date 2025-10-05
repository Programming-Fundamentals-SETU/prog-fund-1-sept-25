
/**
 * Write a description of class DrivingLicence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrivingLicence
{
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) {
            System.out.println("You can drive!");
        } else {
            System.out.println("You cannot drive.");
        }

    }
}