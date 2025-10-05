public class DrivingLicense {

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
