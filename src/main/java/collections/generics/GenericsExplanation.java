package collections.generics;

public class GenericsExplanation {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Naresh";
		p1.age = 25;
		Person p2 = new Person();
		p2.name = "Hemachandran";
		p2.age = 24;
		Employee e1 = new Employee();
		e1.name = "Fathima";
		e1.age = 30;
		e1.salary = 50000;
		
		printAge(e1);// inheritance
		printAge(p1); 
		Dog d1 = new Dog();
		d1.dogAge = 2;
		d1.name = "Jimmy";
		
		Colour<Dog> colourDog = new Colour<Dog>();
		colourDog.colourYourself(d1);
//		colourDog.colourYourself(p1);
		
		Colour<Person> colourPerson = new Colour<Person>();
		colourPerson.colourYourself(e1);
		colourPerson.colourYourself(p1);
	}
	
	public static void printAge(Person var) {
		System.out.println(var.age);
	}

}
