package com.kodilla.testing.kalkulator;

public class Kalkulator {
    int a;
    int b;

    public Kalkulator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int addAToB() {
        return a + b;
    }
    public int subtractBFromA() {
        return a - b;
    }
}
