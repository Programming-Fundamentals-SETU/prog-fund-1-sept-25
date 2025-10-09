public class ScopeExample {
    public static void main(String[] args) {
        int myAge = 21;
        String details;
        if (myAge >= 18) {
             details = myAge + " years old - Get ready to vote";
        }
        else{
             details = myAge + " years old - Ah you can't vote yet!";

        }
        System.out.println(details);
    }

}
