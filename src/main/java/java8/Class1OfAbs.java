package java8;

public class Class1OfAbs extends AbstractHalf {

	@Override
	public double getHalf(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void dummyDefaultMethod() {
		System.out.println("From subclass1");
		
		AbstractDouble.myStaticMethod();
		AbstractHalf.myStaticMethod();
	}

}
