
class Calculator {
    //Method 1: Add two integers
    int add(int a, int b) {
        return a+b;
    }
    //Method 2: Add two doubles
    double add(double a, double b) {
        return a+b;
    }
    //Method 3: Add three integers
    int add(int a, int b, int c) {
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (int, int) : " + calc.add(2,3));
        System.out.println("Sum (double, double) : " + calc.add(2.5, 3.5));
        System.out.println("Sum (int, int, int) : " + calc.add(2,3,5));
        
    }
}
