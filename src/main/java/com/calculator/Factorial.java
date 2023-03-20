package com.calculator;

public class Factorial implements Operation{
    @Override
    public double calculate(double a, double b) {
        double fact = 1.0;
        for (int i = 2; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
