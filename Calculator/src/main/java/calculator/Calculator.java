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
        if (b !=0) {
            return a/b;
        }

        else {
            throw new ArithmeticException(null);
        }


    }

    public int power(int a, int b) {
        Object obj1 = b;
        Object obj2 =a;



        if(obj1 instanceof Integer[] ||a>=-1){
            return (int) Math.pow(a, b);
        }
        else {
            throw new ArithmeticException(null);
        }

    }

    enum OperationType {
        MULTIPLY,
        DIVISION,
        POWER;
    }
}
