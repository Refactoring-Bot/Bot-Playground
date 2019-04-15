package smells.localvariableimmediatelyreturned;

/**
 * An expression should immediately be returned instead of assigning it to a
 * local variable.
 */
public class LocalVariableImmediatelyReturned {

	protected int multiply(int a, int b) {
		int result = a * b;
		return result;
	}

}
