package smells.incorrectorderofmodifiers;

/**
 * According to the Java Language Specification (JLS), a certain order for
 * modifiers must be adhered to. Otherwise, it makes the code more difficult to
 * read, since most developers are used to this order.
 */
public class IncorrectOrderOfModifiers {

	/**
	 * expected: private static final int
	 */
	private final static int MULTIPLIER = 10;

	/**
	 * 
	 * @return
	 */
	protected int getMultiplier() {
		return MULTIPLIER;
	}

}
