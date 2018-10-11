package com.example.com.testing;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void sum() {
        assertEquals(6d,mCalculator.sum(1d,5d),0);
    }

    @Test
    public void substract() {
        assertEquals(1d, mCalculator.substract(5d, 4d), 0);
    }

    @Test
    public void divide() {
        assertEquals(4d, mCalculator.divide(20d, 5d), 0);
    }

    @Test
    public void multiply() {
        assertEquals(10d, mCalculator.multiply(2d, 5d), 0);
    }

    @Ignore("not implemented yet")
    public void testFactorial(){
    }

    @Test(expected = IllegalArgumentException.class)
    public void test(){
        mCalculator.divide(4,0);
    }


}