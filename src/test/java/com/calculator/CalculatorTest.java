package com.calculator;

import org.junit.*;

import java.io.IOException;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() throws IOException {
        double a = 15;
        double b = 20;
        double expectedResult = 35;
        double result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);;
    }

    @Test
    public void testSubtract() throws IOException {
        double a = 25;
        double b = 20;
        double expectedResult = 5;
        double result = calculator.subtract(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);;
    }

    @Test
    public void testMultiply() throws IOException {
        double a = 10;
        double b = 25;
        double expectedResult = 250;
        double result = calculator.multiply(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);;
    }

    @Test
    public void testDivide() throws IOException {
        double a = 56;
        double b = 10;
        double expectedResult = 5.6;
        double result = calculator.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }
}