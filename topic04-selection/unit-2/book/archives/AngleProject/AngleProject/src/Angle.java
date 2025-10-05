import java.util.Scanner;
/**
 * This class asks the user to enter an angle.  If the angle is:
 *     less than 90, print out acute angle
 *     exactly 90, print out right angle
 *     more than 90 but less than 180, print out obtuse angle
 *     exactly 180, print out straight angle
 *     otherwise, print out reflex angle
 *
 * @version (1.0)
 */

public class Angle
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Angle angle = new Angle();

        System.out.print("Enter the size of the angle: ");
        int enteredAngle = sc.nextInt();
        //determines whether the angle is acute, right, obtuse, straight or reflex.
        if (enteredAngle < 90)
        {
            System.out.println("The angle " + enteredAngle + ", is an acute angle!");
        }
        else if (enteredAngle == 90)
        {
            System.out.println("The angle " + enteredAngle + ", is a right angle!");
        }
        else if ((enteredAngle > 90) && (enteredAngle < 180))
        {
            System.out.println("The angle " + enteredAngle + ", is an obtuse angle!");
        }
        else if (enteredAngle == 180)
        {
            System.out.println("The angle " + enteredAngle + ", is a straight angle!");
        }
        else
        {
            System.out.println("The angle " + enteredAngle + ", is a reflex angle!");
        }
    }





}
