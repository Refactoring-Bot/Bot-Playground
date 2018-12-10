package calculator;

import java.util.Scanner;

public class Calculator extends SuperCalculator {

    private String resultAsText;

    public final static int MULTIPLIER = 10;

    public double addition(double a, double b) {
        return a + b;
    }

    public double multiplication(double a, double b, double c) {
        return a * b * c;
    }

    public double multiplication(double a, double b) { return multiplication(a, b, 1); }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public void main() {
        // get numbers
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();

        // get operation
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();

        // calculate and print result
        switch (choose){
            case 1:
                System.out.println(addition( num1,num2));
                break;
            case 2:
                System.out.println(subtraction( num1,num2));
                break;
            case 3:
                System.out.println(multiplication( num1,num2));
                break;
            case 4:
                System.out.println(division( num1,num2));
                break;
            default:
                System.out.println("Illigal Operation");
        }

    }
}



