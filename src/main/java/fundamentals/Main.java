package fundamentals;

public class Main {

	public static void main(String[] args) {
		System.out.println(sum(5, 10));
		System.out.println(sum(5, 10, 15));
		System.out.println(sum("Vanakkam", " Makkalae"));
	}

	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static String sum(String a, String b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

}
