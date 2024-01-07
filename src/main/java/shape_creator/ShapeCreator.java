package shape_creator;

import oops2.InterfaceArea;
import oops2.Quadrilateral;
import oops2.Rectangle;
import oops2.Square;
import oops2.Triangle;
import oops2.TwoDimensionalShape;

public class ShapeCreator {

	public static void main(String[] args) {
		Square sq1 = new Square(5);
//		Square sq2 = new Triangle(5, 10); not possible
//		Rectangle r1 = new Rectangle(10, 8);
//		TwoDimensionalShape twod = new TwoDimensionalShape();
		sq1.area();

		printArea(new Square(5));
		printArea(new Rectangle(5, 3));
		printArea(new Quadrilateral());

		TwoDimensionalShape shape1 = new Rectangle(5, 10);
		TwoDimensionalShape shape2 = new Square(5);
		TwoDimensionalShape shape3 = new Triangle(10, 6);

		shape1.area();
		shape2.area();
		shape3.area();

		Rectangle r1 = new Rectangle(50, 20);
		TwoDimensionalShape r2 = new Rectangle(20, 30);
		TwoDimensionalShape t1 = new Triangle();
		Rectangle rr = (Rectangle) t1;
		
		
		TwoDimensionalShape r3 = new TwoDimensionalShape() {
			
			int sides = 0;
			
			@Override
			public double perimeter() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double area() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		InterfaceArea a1 = new InterfaceArea() {
			
			@Override
			public double area() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	public static void printArea(TwoDimensionalShape twoDShape) {
		twoDShape.area();
//		twoDShape.getLength(); // compilation error
	}

//	public static void printArea(Triangle tri) {
//		tri.area();
//	}
//	
//	public static void printArea(Rectangle rectangle) {
//		rectangle.area();
//	}
//	
//	public static void printArea(Square square) {
//		square.area();
//	}

}
