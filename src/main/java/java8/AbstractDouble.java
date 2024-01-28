package java8;

public abstract class AbstractDouble implements MyMarker{
	
	protected int value;

	public abstract int multipleByTwo(int a);

	void dummyDefaultMethod() {
		System.out.println("Hello there twice value " + multipleByTwo(100));
	}
	
	static void myStaticMethod() {
		System.out.println("Static method in Abstract Double");
	}

}
