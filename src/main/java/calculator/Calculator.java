package calculator;

import java.util.Scanner;

public class Calculator extends SuperCalculator {

    private String resultAsText;

    private Object currentPrint;

    public final static int MULTIPLIER = 10;

    public double addition(double a, double b) {
        return a + b;
    }

    public double multiplication(double a, double b, double c) {
        return a * b;
    }

    public double multiplication(double a, double b) { return multiplication(a, b, 42); }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public void main() {
        // get numbers
        print("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1;
        int num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();

        // get operation
        print("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();

        // calculate and print result
        switch (choose){
            case 1:
                print(addition( num1,num2));
                break;
            case 2:
                print(subtraction( num1,num2));
                break;
            case 3:
                print(multiplication( num1,num2));
                break;
            case 4:
                print(division( num1,num2));
                break;
            default:
                print("Illegal Operation");
        }

        inp.close();
    }

    private void print(Object object) {
        // prints the given object
        this.currentPrint = object;
        return;
    }
}



