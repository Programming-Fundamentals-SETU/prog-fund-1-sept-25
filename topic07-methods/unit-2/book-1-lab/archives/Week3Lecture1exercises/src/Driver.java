public class Driver {
    public static void main(String[] args) {
        Welcome w = new Welcome();  // create an object of Welcome class
        //exercise 1
        w.printWelcome();
        w.printGoodbye();  // optional
        //exercise 2
        RectangleCalculator calc = new RectangleCalculator();
        calc.printArea(5.0, 3.0);
        calc.printPerimeter(5.0, 3.0);

    }
}
