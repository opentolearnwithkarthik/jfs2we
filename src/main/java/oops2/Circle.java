package oops2;

public class Circle extends Ellipse {

	private int radius;

	public Circle(int radiusValue) {
		this.radius = radiusValue;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public double area() {
		return 3.14 * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * 3.14 * radius;
	}

}
