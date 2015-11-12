package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);

        double a, b;
        char operation;

        boolean flag = true;

        while(flag){

            System.out.print("Enter first number: ");
            a = in.nextDouble();

            System.out.print("Enter operation: ");
            operation = in.next().charAt(0);

            System.out.print("Enter second number: ");
            b = in.nextDouble();

            System.out.println(a + " " + operation + " " + b + " = " + calculator.calculate(a, b, operation));

            System.out.print("Do you want to continue? ('y' or 'n')");
            char quit = in.next().charAt(0);
            if(quit == 'n')
                flag = false;
        }
        in.close();
    }

}
