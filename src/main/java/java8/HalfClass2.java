package java8;

public class HalfClass2 implements Half {

	@Override
	public double getHalf(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dummyDefaultMethod() {
//		Half.super.dummyDefaultMethod();
		System.out.println("Hello from HalfClass2 and not the interface");
	}
}
