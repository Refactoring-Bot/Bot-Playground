package smells.unusedprivatefield;

/**
 * Unused private fields confuse developers and should therefore be removed.
 */
public class UnusedPrivateField {

	/**
	 * This is an unused private field. The value is never read.
	 */
	private int foo;
	
	/**
	 * However, the value could be set as in this constructor.
	 */
	public UnusedPrivateField() {
		this.foo = 42;
	}
	
}
