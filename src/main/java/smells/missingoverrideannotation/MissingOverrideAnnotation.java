package smells.missingoverrideannotation;

/**
 * Methods should indicate that they override other methods to improve
 * readability and to ensure that a method is actually overridden.
 */
public class MissingOverrideAnnotation extends MissingOverrideAnnotationSuperClass {

	/**
	 * This method is missing an @Override annotation.
	 */
	public double addition(double a, double b) {
		return a + b;
	}

}
