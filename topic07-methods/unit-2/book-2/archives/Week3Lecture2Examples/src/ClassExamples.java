public class ClassExamples {

    double farenheitToCelsius (double farenheit)
    {
        double result = (farenheit - 32.0) * (5.0/9.0);
        return result;
    }

    int cubed(int num){
        return num * num * num;
    }

    double product(double num1, double num2){
        return num1 * num2;
    }

    void addNum(double num1, double num2){
        double result = num1 + num2;
        System.out.println("This is double addNum " + result);
    }
    void addNum(int num1, int num2){
        int result = num1 + num2;
        System.out.println("This is int addNum " + result);;
    }
    int addNum(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
    }

    public int factorialRecursion(int n) {
        if (n == 0) return 1;
        return n * factorialRecursion(n - 1);
    }

    public int factorialLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method with parameters and return
    public int product(int a, int b, int c) {
        return a * b*c;
    }

    // Method with parameters and return
    public int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if(b > c && b > a) {
            return b;
        }
        else return c;
    }


}
