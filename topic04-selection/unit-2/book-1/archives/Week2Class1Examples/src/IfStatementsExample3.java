public class IfStatementsExample3 {
    public static void main(String[] args) {
        int age = 10;
        if (age <= 3) {
            System.out.println("Baby");
        }
        else if (age > 3 && age <= 12) {
            System.out.println("Child");
        }
        else if (age > 12 && age <= 19) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Adult");
        }
    }
}
