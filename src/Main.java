import Calc.Calculator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test");
        Calculator calc = new Calculator();
        double result = calc.calculate("5 3 2 * + 1 -");
        System.out.println("Result:" + result);
    }
}
