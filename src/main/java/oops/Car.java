package oops;

import java.util.Objects;

public class Car extends Vehicle implements InterfaceToDrive { // Car 'is a' Vehicle

	public Car(String brandName, String model) {
		// creation of memory for the object
		// null will be the value of all attributes in the object
		this.brand = brandName;
		this.modelNo = model;
	}

	public Car(String brandName) {
		// creation of memory for the object
		// null will be the value of all attributes in the object
		this.brand = brandName;
	}

	public Car(Engine engineObject) {
		// creation of memory for the object
		// null will be the value of all attributes in the object
		this.engine = engineObject;
	}

	public Car() {
		// creation of memory for the object
		// null will be the value of all attributes in the object
	}

	public String brand;
	public String modelNo;
	private Steering steering; // Car 'has a' Steering -> encapsulation
	private Engine engine;

	public String driveonroad() {
		System.out.println("Driving happily");
		return "driving";
	}

	public void applybrake() {
		// TODO Auto-generated method stub

	}

	public void applybrake(boolean handBrake) {
		// TODO Auto-generated method stub

	}

	public void createSeat() {
		Seat seat = new Seat();
	}

	protected void makeSound() {
		String test = "name";
		Vehicle vehicle = new Vehicle();
		vehicle.makeSound();
//		vehicle.chasisNo;
		System.out.println("Make car's sound");
	}

	private class Seat {

		public String seatCoverColour;

	}

	public void crush() {
		engine.crush();
		steering.crush();
	}

	public Steering getSteering() {
		return steering;
	}

	public void setSteering(Steering steering) {
		this.steering = steering;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void drive() { // object of Car 'can do' drive()
		System.out.println("Vroom");
	}

	@Override
	public int hashCode() {
//		return Objects.hash(brand, modelNo);
		return brand.length() + modelNo.length();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(modelNo, other.modelNo);
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", modelNo=" + modelNo + ", hashCode=" + hashCode() + "]";
	}

}
