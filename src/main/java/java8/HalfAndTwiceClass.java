package java8;

public class HalfAndTwiceClass implements Half, DoubleInterface {

	@Override
	public double getHalf(int a) {
		return a / 2;
	}

	@Override
	public int multipleByTwo(int a) {
		return a * 2;
	}

	@Override
	public void dummyDefaultMethod() {
		DoubleInterface.super.dummyDefaultMethod();
		Half.super.dummyDefaultMethod();
	}

	private void myStaticMethod() {
		Half.myStaticMethod();
		DoubleInterface.myStaticMethod();
		AbstractDouble.myStaticMethod();
		AbstractHalf.myStaticMethod();
	}

}
