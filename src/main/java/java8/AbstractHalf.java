package java8;

public abstract class AbstractHalf {

	public abstract double getHalf(int a);

	void dummyDefaultMethod() {
		System.out.println("Hello there half of " + getHalf(100));
	}
	
	static void myStaticMethod() {
		System.out.println("Static method in Abstract Half");
	}

}
