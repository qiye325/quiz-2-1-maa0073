package shapes;

public class Circle extends Shape {
	private double radius;

	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below. Circles must have a positive radius.
	 */

	public Circle(double radius) throws IllegalArgumentException {

		if (radius > 0)
			this.radius = radius;
		else
			throw new IllegalArgumentException("Radius must be positive!");

	}

	/*
	 * Implement any remaining methods demanded by the superclass.
	 */

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}
}
