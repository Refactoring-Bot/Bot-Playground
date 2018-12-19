package calculator;

import java.util.Scanner;

public class Calculator extends SuperCalculator {

    private String resultAsText;

    public static final int MULTIPLIER = 10;

    public static void main(String[] args) {
        new Calculator().runProgram();
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public double multiplication(double a, double b, double c) {
        return a * b;
    }

    public double multiplication(double a, double b) {
        return multiplication(a, b, 42);
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public void runProgram() {
        println("The calculator is ready to calculate!");
        // get numbers
        Scanner inp = new Scanner(System.in);
        int num1;
        int num2;
        println("Enter first number:");
        num1 = inp.nextInt();
        println("Enter second number:");
        num2 = inp.nextInt();
        // get operation
        println("Enter your selection: 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        // calculate and print result
        switch(choose) {
            case 1:
                println("The result of the addition is:");
                println(addition(num1, num2));
                break;
            case 2:
                println("The result of the subtraction is:");
                println(subtraction(num1, num2));
                break;
            case 3:
                println("The result of the multiplication is:");
                println(multiplication(num1, num2));
                break;
            case 4:
                println("The result of the division is:");
                println(division(num1, num2));
                break;
            default:
                println("Illegal Operation");
        }
        inp.close();
        println("Thank you for using this awesome calculator.");
    }

    private void println(Object object) {
        // NOSONAR
        System.out.println(object);
    }
}

