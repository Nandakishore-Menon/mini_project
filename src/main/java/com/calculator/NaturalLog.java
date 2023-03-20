package com.calculator;
import java.lang.Math;

public class NaturalLog implements Operation{

    @Override
    public double calculate(double a, double b) {

        return Math.log(a);
    }
}
