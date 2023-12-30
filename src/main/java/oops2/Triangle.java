package oops2;

public class Triangle extends Polygon {

	private int base;
	private int height;

	public Triangle() {
		super(3);
	}

	public Triangle(int base, int height) {
		super(3);
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public double area() {
		double val = 0.5 * base * height;
		System.out.println("Area of triangle = " + val);
		return val;
	}

	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Not Implemented");
	}

}
