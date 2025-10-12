
/**
 * Write a description of class  here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class IfStatementsExample3 {
    public static void main(String[] args) {
        int age = 5;
        if (age < 4) {
            System.out.println("Baby");
        }
        else if (age >= 4 &&age <=12) {
            System.out.println("Child");
        }
        else if (age >12 && age < 20) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Adult");
        }
    }
}

