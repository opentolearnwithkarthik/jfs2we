package java8;

public interface DoubleInterface extends MyMarker {

	int multipleByTwo(int a);

	default void dummyDefaultMethod() {
		System.out.println("Hello there twice value " + multipleByTwo(100));
	}

	static void myStaticMethod() {
		System.out.println("Static method in Double Interface");
	}

}
