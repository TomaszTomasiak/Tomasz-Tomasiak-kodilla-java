package com.kodilla.testing.kalkulator;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    public int add() {
        return a + b;
    }
    public int subtract() {
        return a - b;
    }
}

