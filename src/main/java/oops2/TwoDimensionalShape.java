package oops2;

public abstract class TwoDimensionalShape extends Shape implements InterfaceArea, InterfacePerimeter {

	// 0 - 100% abstraction

	public TwoDimensionalShape() {

	}

//	public abstract double area();

//	public abstract double perimeter();

	// variable cannot be abstract
	private String variables;

	public void test() {
		System.out.println("not abstract methods");
	}

}
