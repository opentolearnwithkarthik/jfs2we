package oops2;

public class Polygon extends TwoDimensionalShape {

	private int sides;

	public Polygon(int noOfSides) {
		if (noOfSides < 3) {
			throw new RuntimeException("Sides would be minimum 3 in a polygon");
		}
		this.sides = noOfSides;
		System.out.println("Constructor of Polygon");
	}

	public int getSides() {
		return sides;
	}

	@Override
	public double area() {
		System.out.println("Area of Polygon = 0");
//		throw new UnsupportedOperationException("Implementation not done");
		return 0;
	}

	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Implementation not done");
	}

}
