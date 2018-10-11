package com.example.com.testing;

public class Calculator {
    public double sum(double a, double b){
        return a + b;
    }

    public double substract(double a, double b){
        return a - b;
    }

    public double divide(double divident, double dividor){
        if(dividor == 0) throw new IllegalArgumentException("Dividor cannot be 0");
        return divident / dividor;
    }

    public double multiply(double a, double b){
        return a * b;
    }

}
