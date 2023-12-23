package fundamentals;

import java.util.ArrayList;
import java.util.List;

public class DemoClass {

	public static void main(String[] args) {
		int a = 5;
		long b = 10;
		double d = 100.123;
		char val = 'a';

		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(val);

//		Integer i = 6;
		Long nonPrimitiveLong = new Long(123123);
		nonPrimitiveLong.longValue(); //
		MyLongDataType myOwnCustomLong = new MyLongDataType(123123);
		myOwnCustomLong.getLongValue();//
		Double doubleD = 6D;
		Character character = '6';

		System.out.println(5 + 10);
		System.out.println(a);
		System.out.println(a++); // a = a+1;
		System.out.println(a);
		System.out.println(++a); // a = a+1;
		System.out.println(a);
		System.out.println(a % 3);
		System.out.println(a == 7);
		System.out.println((a == 7) && (b == 10));

		a = 100;
		System.out.println(a);
		a += 5; // a = a+5
		System.out.println(a);
		// 5 // 101
		// 6 // 110 -> 100
		System.out.println(5 << 6);

		int[] myIntArray1 = { 312, 432, 354, 32, 12, 5, 4, 65, 23 };
		int[] myIntArray2 = new int[10];// 11,12
		int[] myIntArray3 = new int[12];
		myIntArray2[0] = 999;
		myIntArray2[1] = 888;
		myIntArray2[2] = 777;
		System.out.println(myIntArray1);
		System.out.println(myIntArray1[0]);
		System.out.println(myIntArray1[1]);
		System.out.println(myIntArray1[2]);
		System.out.println(myIntArray1[3]);
		System.out.println(myIntArray1[4]);
		/*
		 * if(condition){ true block }else{ false block }
		 */

		if (a == 7) {
			System.out.println("a is 7");
			System.out.println("second line in if");
		} else if (a == 100) {
			System.out.println("a is 100");
		} else if (a == 123) {
			System.out.println("a is 123");
		} else {
			System.out.println("inside else");
			if (a == 105) {
				System.out.println("inside nested if");
			}
//			System.out.println("a is not 7");
			System.out.println("second line in else");
		}

		System.out.println(a == 7 ? "a is 7" : "a is not 7");

		explainSwitchCase(100);

//		Thread thread1 = new Thread();
//		Thread thread2 = new Thread();
//		Thread thread3 = new Thread();

		/**
		 * while(condition){ content to be executed by the loop }
		 */

		int count = 0;
		while (count < 10) {
			System.out.println("While loop Count is " + count);
			count++;
		}
		System.out.println("existing while loop");

		/////////////////////////////////////////////////////////////////
		count = 0;
		do {
			System.out.println("Do While Loop Count is " + count);
			count++;
		} while (count < 10);
		System.out.println("existing do while loop");

		//////////////////////////////////////////////////////////////////

		do {
			System.out.println("Second - Do While Loop Count is " + count);
			count++;
		} while (count < 10);
		System.out.println("existing second do while loop");

		while (count < 10) {
			System.out.println("Second - While Loop Count is " + count);
			count++;
		}
		System.out.println("existing second while loop");

		/////////////////////////////////////////////////////////////////

		for (count = 0; count < 10; count++) {
			System.out.println("For loop Count is " + count);
		}
		System.out.println("existing for loop");

		/**
		 * 
		 * for(int_bloc;condition;increment/decrement bloc){ code to be executed
		 * repeatedly }
		 * 
		 * 
		 * init_bloc -> will get executed only for the first entry condition -> entry
		 * checked - will get executed every iteration increment/decrement bloc -> last
		 * statement of the code to be executed repeatedly (terminal bloc)
		 * 
		 * 
		 * first time - init block -> condition check -> code to be executed -> terminal
		 * block aka increment/decrement block -> condition check -> code to be executed
		 * -> terminal -> condition -> code to be executed -> ....
		 * 
		 * 
		 */

		int length = myIntArray1.length;
		int[] myNewIntArray = new int[length + 5];
		for (int i = 0; i < length; i++) {
			myNewIntArray[i] = myIntArray1[i];
		}
		myNewIntArray[length] = 123123;
		myNewIntArray[length + 1] = 234234;
		myNewIntArray[length + 2] = 345345;
		myNewIntArray[length + 3] = 456456;
		myNewIntArray[length + 4] = 567567;

		for (int eachValueInMyNewIntArray : myNewIntArray) {
			System.out.println(eachValueInMyNewIntArray);
		}

		System.out.println("Printing odd numbers of the array - method 1");
		for (int i = 0; i < myNewIntArray.length; i++) {
			if (myNewIntArray[i] % 2 != 0) {
				System.out.println(myNewIntArray[i]);
			}
		}

		System.out.println("Printing odd numbers of the array - method 2");
		for (int i = 0; i < myNewIntArray.length; i++) {
			if (myNewIntArray[i] % 2 == 0) {
				continue;
			}
			System.out.println(myNewIntArray[i]);
		}

		System.out.println("Printing elements of an array until the first number is divisible by 11");
		for (int i = 0; i < myNewIntArray.length; i++) {
			if (myNewIntArray[i] % 11 == 0) {
				break;
			}
			System.out.println(myNewIntArray[i]);
		}
		System.out.println("Exited after break");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("Outer loop iteration - "+ i + " & inner loop iteration - " + j);
			}
		}

	}

	private static void explainSwitchCase(int value) {
		// for the same above example
		switch (value) {
		case 7:
			System.out.println("Value is 7");
			break;
		case 100:
			System.out.println("Value is 100");
			break;
		case 123:
			System.out.println("Value is 123");
			break;
		case 105:
			System.out.println("Value is 105");
			break;
		case 200:
		case 1000:
			System.out.println("Vaule is 200 or 1000");
			break;
		default:
			System.out.println("Value is not 7 or 100 or 123 or 105");
			break;
		}
	}

	private static void explainSwitchCase2(String value) {
		// for the same above example
		switch (value) {
		case "welcome":
			System.out.println("Value is 7");
			break;
		case "guvi":
			System.out.println("Value is 100");
			break;
		case "zen":
			System.out.println("Value is 123");
			break;
		case "india":
			System.out.println("Value is 105");
			break;
		default:
			System.out.println("Value is not 7 or 100 or 123 or 105");
			break;
		}
	}

	public static void enrolStudents() {
		// ...
		Student s1 = new Student();
		s1.firstName = "xyz";
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
	}

}