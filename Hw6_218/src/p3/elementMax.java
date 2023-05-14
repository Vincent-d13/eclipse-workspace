package p3;

public class elementMax {

	public static void main(String[] args) {

		int[] numbers = { 100, 43, 32, 5, 7, 89, 101 };
		System.out.println(maxElement(numbers, numbers.length));

	}

	public static int maxElement(int[] arr, int n) {

		if (n == 0) {
			return arr[n];
		}

		int max;
		max = maxElement(arr, n - 1);

		if (max < arr[n - 1]) {
			return arr[n - 1];
		}
		return max;

	}
}
