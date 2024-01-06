package oops3;

public class TestStatic {

	public static void main(String[] args) {
		StaticExample example1 = new StaticExample();
		example1.value = 100;
		StaticExample.staticValue = 1000;
		StaticExample example2 = new StaticExample();
		example2.value = 200;
		StaticExample.staticValue = 2000;
		StaticExample example3 = new StaticExample();
//		example3.value = 300;
		StaticExample.staticValue = 3000;
		
		System.out.println(example1.value);
		System.out.println(example2.value);
		System.out.println(example3.value);
		System.out.println(StaticExample.staticValue);
		System.out.println(StaticExample.staticValue);
		System.out.println(StaticExample.staticValue);
		StaticExample.incrementStaticValue();
		StaticExample.incrementStaticValue();
		StaticExample.incrementStaticValue();
		System.out.println(StaticExample.staticValue);
		
		StaticChildExample childExample1 = new StaticChildExample();
		System.out.println(childExample1.staticValue);
		StaticChildExample childExample2 = new StaticChildExample();
		System.out.println(StaticChildExample.staticValue);
	}

}
