package oops;

public class DemoCar {
	
	public static void main(String[] args) {
		MarutiFactory factory = new MarutiFactory();
		Car marutiCar = factory.createMarutiCar();
		marutiCar.driveonroad();
		
		Car car1 = new Car();
		car1.brand = "Benz";
		car1.modelNo = "E Class";
		Engine engine1 = new Engine();
		engine1.shaft = new Shaft();
		engine1.cc = 10000;
		car1.engine = engine1;
		Car car2 = new Car();
		car2.brand = "Maruti";
		car2.modelNo = "800";
		Car car3 = new Car();
		car3.brand = "Tata";
		car3.modelNo = "Nixon";
		
		System.out.println();
		
		
	}

}
