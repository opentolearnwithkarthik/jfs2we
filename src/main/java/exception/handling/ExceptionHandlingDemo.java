package exception.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<String> list = new ArrayList<>();
			for (int i = 1; i <= 5; i++) {
				list.add(scanner.next());
			}
			method1(list);
//			new TestDemo();
		} catch (Exception e) {
			e.printStackTrace();
//		} finally {
//			scanner.close();
//			System.out.println("Scanner closed in finally");
		}
		System.out.println("Exiting main");

	}

	public static void someIOoperation() throws IOException {
		// some IO operations
	}

	private static void method1(List<String> list) throws Exception{
		System.out.println("Method1 entry");
//		try {
		method2(list);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("Method1 exit");
	}

	private static void method2(List<String> list) throws NumberFormatException, MyCustomException, IOException, MyCustomNumberFormatException {
		System.out.println("Method2 entry");
//		try {
		method3(list);
		someIOoperation();
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		}
		System.out.println("Method2 exit");
	}

	private static void method3(List<String> list) throws NumberFormatException, MyCustomException, MyCustomNumberFormatException {
		System.out.println("Method3 entry");
		Double sum = 0.0;
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("try block entered for " + i + "th iteration");
				Integer val = Integer.parseInt(list.get(i));
				sum = sum + val;
				System.out.println("try block completed for " + i + "th iteration");
			} catch (NumberFormatException e) {
				System.out.println("catch block entered for " + i + "th iteration");
				e.printStackTrace();
				System.err.println("Input given is not an Integer");
				System.err.println(e.getMessage());
				String stringInput = list.get(i);
				System.out.println(list.get(i).getClass());
				System.out.println(list.get(i) instanceof String);
				System.out.println(((Object) list.get(i)) instanceof Double);
				// 20.5 - double
				// "20.5" - string
//				Double val = (double)  ((Object)stringInput);
				try {
					Double val = Double.parseDouble(stringInput);
					sum = sum + val;
				} catch (Exception e2) {
					System.err.println("Not an integer or double " + e.getMessage());
					e.printStackTrace();
//					throw e2;
//					throw new MyCustomException(e2);
					throw new MyCustomNumberFormatException((NumberFormatException) e2);
				}
				System.out.println("catch block completed for " + i + "th iteration");
			}
		}
		System.out.println(sum);
		System.out.println("Method3 exit");
	}

}
