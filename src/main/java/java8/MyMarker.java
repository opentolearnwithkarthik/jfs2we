package java8;

public interface MyMarker {

	default void sayHello() {
		System.out.println("Hello");
	}
	
	default void sayHelloWorld() {
		System.out.println("Hello World");
	}

}
