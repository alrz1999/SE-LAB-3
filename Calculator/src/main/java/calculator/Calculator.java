package calculator;

import java.lang.Math;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    enum OperationType {
        MULTIPLY,
        DIVISION,
        POWER;
    }
}