package calculator;

public class Calculator implements CalculatorInterface{

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
