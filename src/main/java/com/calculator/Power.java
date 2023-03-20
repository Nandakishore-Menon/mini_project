package com.calculator;
import java.lang.Math;
public class Power implements Operation{

    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }
}
