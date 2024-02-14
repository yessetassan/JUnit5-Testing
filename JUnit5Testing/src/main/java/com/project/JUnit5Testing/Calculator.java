package com.project.JUnit5Testing;

public class Calculator {

    public int division(int a, int b) throws ArithmeticException  {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }

    public int integerSubtraction(int minuend, int subtrahend){
        return minuend - subtrahend;
    }
}
