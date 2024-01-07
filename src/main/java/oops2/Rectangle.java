package oops2;

public class Rectangle extends Quadrilateral {

	private int length;
	private int breadth;

	public Rectangle(int lengthValue, int breadthValue) {
		super();
		this.length = lengthValue;
		this.breadth = breadthValue;
		System.out.println("Constructor of Rectangle");
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	@Override
	public double area() {
		int value = length * breadth;
		;
		System.out.println("Area of Rectangle = " + value);
		return value;
	}

	public double perimeter() {
		return 2 * (length + breadth);
	}
	
//	private Triangle toTriangle() {
//		// TODO Auto-generated method stub
//
//	}

}
