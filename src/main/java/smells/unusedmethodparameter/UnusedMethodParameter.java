package smells.unusedmethodparameter;

/**
 * Unused method parameters confuse developers and should therefore be removed.
 */
public class UnusedMethodParameter {

	/**
 * 
 * @param a
 * @param c
 * @return
 */
	protected int calculateSomething(int a, int c) {
		int result = (a + c) * 0;
		result = result + 1;
		return result;
	}

	/**
	 * This method contains a method call to the method with an unused parameter.
	 * When removing the unused parameter, the argument should be removed as well.
	 * 
	 * @return
	 */
	protected int calculateSomethingElse() {
		return calculateSomething(1, 3);
	}

}

