package Calc;

import java.util.Stack;
import java.util.StringTokenizer;

public class Calculator {
    private final Stack<Double> numbers;

    public Calculator() {
        numbers = new Stack<>();
    }
    public Double calculate(String calcInput) {
        StringTokenizer st = new StringTokenizer(calcInput);
        double firstNum;
        double secondNum;

        while (st.hasMoreTokens()) {
            String nextToken = st.nextToken();

            switch (nextToken) {
                case "*" -> {
                    secondNum = numbers.pop();
                    firstNum = numbers.pop();
                    numbers.push(firstNum * secondNum);
                    continue;
                }
                case "/" -> {
                    secondNum = numbers.pop();
                    firstNum = numbers.pop();
                    if (secondNum == 0) {
                        throw new ArithmeticException("Cannot divide by zero!");
                    }
                    numbers.push(firstNum / secondNum);
                    continue;
                }
                case "+" -> {
                    secondNum = numbers.pop();
                    firstNum = numbers.pop();
                    numbers.push(firstNum + secondNum);
                    continue;
                }
                case "-" -> {
                    secondNum = numbers.pop();
                    firstNum = numbers.pop();
                    numbers.push(firstNum - secondNum);
                    continue;
                }
            }
            double num = Double.parseDouble(nextToken);
            numbers.push(num);
        }

        return numbers.pop();
    }
}
