package calculator;

public class Calculator extends SuperCalculator{

	private String resultAsText;

	public double addition(double a, double b) {
		return a + b;
	}

	public double multiplikation(double a, double b) {
		return a * b;
	}

	public double subtraction(double a, double b) {
		return a - b;
	}

	public double division(double a, double b) {
		return a / b;
	}
}
