package oops2;

public class Square extends Rectangle {

	public Square(int size) {
		super(size, size);
		System.out.println("Constructor of Square");
	}

	@Override
	public double area() {
		double val = getLength() * getBreadth();
		System.out.println("Area of Square " + val);
		return val;
	}

}
