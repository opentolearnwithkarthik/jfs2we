package heavy_vehicles;

import oops.Vehicle;

public class Lorry extends Vehicle {

	public Lorry() {
		super();
		System.out.println("Lorry Constructor");
	}

	public void testMakeSound() throws Exception {
//		Vehicle v1 = new Vehicle();
//		v1.makeSound();
	}

	@Override
	protected void makeSound() {
		// TODO Auto-generated method stub
		super.makeSound();
	}

}
