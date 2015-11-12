package com.calculator;

public class Calculator {
    public double add(double a, double b)
    {
        double result = a+b;
        check(result);
        return result;
    }
    public double subtract(double a, double b)
    {
        double result = a-b;
        check(result);
        return result;
    }
    public double multiply(double a, double b)
    {
        double result = a*b;
        check(result);
        return result;
    }
    public double divide(double a, double b)
    {
        if(b == 0.0)
            return Double.POSITIVE_INFINITY;
        double result = a/b;
        check(result);
        return result;
    }
    public double calculate(double a, double b, char operation)
    {
        double result;
        switch (operation)
        {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = subtract(a, b);
                break;
            case '*':
                result = multiply(a, b);
                break;
            case '/':
                result = divide(a, b);
                break;
            default:
                throw new IllegalArgumentException("Illegal operation");
        }
        return result;
    }
    private void check(double result)
    {
        if (Math.abs(result) > Double.MAX_VALUE) {
            throw new RuntimeException("Error runtime");
        }

    }
}
