package p1;

public class DemoFactorial {

	public static void main(String[] args) {

		
		System.out.println(factorial(1));
	}

	private static double factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	}

}
