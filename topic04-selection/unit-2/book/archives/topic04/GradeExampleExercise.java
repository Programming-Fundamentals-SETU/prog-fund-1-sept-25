
/**
 * Write a description of class GradeExampleExercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeExampleExercise
{

    public static void main(String[] args) {
        int mark = 72;
        if (mark >= 60) {
            System.out.println("Upper Second");
        } else if (mark >= 70) {
            System.out.println("First Class");
        } else if (mark >= 50) {
            System.out.println("Lower Second");
        } else {
            System.out.println("Fail");
        }
    }
}