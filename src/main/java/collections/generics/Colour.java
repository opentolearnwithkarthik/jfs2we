package collections.generics;

public class Colour<T extends Age> {
//public class Colour<T extends Age> {
//public class Colour<T extends Person> {

	public void colourYourself(T var) {
		System.out.println("Colouring a " + var.getClass() + " object");
//		System.out.println("Colouring someone or something with age " + var.age + " object");
		System.out.println("Colouring someone or something with age " + var.getAge() + " object");
	}

}
