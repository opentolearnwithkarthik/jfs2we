package java8;

@FunctionalInterface
public interface Half extends MyMarker{

	double getHalf(int a);
	
	default void dummyDefaultMethod() {
		System.out.println("Hello there half of " + getHalf(100));
	}
	
	static void myStaticMethod() {
		System.out.println("Static method in Half");
	}

//	public void dummyMethod() {
//		System.out.println("Hello there");
//	}

}
