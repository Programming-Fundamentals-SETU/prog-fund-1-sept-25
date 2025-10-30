public class Driver {
    // Main method to test them all
    public static void main(String[] args) {
        MethodExamples me = new MethodExamples(); //create an object
        // 1 Call method with no parameters / no return
        me.sayHello();
       // 2 Call method with parameter / no return
        me.greet("Mairead", 21);
        // 3 Call method with parameters / with return
        int sum = me.timesTwo(5);
        System.out.println("5 * 2 = " + sum);
    }
}
