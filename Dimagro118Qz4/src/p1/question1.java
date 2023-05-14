package p1;

public class question1 {

	public static void main(String[] args) {

		int[] arr = new int[30];

		for (int i = 0; i < arr.length; i++) {
			int rand = -99 + (int) (Math.random() * 199);
			arr[i] = rand;

		}
		displayOdd(arr);
		System.out.println("\n");
		displayEven(arr);
		System.out.println("\n");
		System.out.println(getInfoMax(arr) + " largest element");
		System.out.println(getInfoSmall(arr) + " smallest element");
		System.out.println(getInfoMaxCount(arr) + " amount of largest element");
		System.out.println(getInfoSmallCount(arr) + " amount of smallest element");
		System.out.println(getInfoAverage(arr) + " average value");

	}

	public static void displayOdd(int[] arr) {
		int line = 0;
		for (int i = 0; i < arr.length; i++) {
			if (line == 5) {
		        System.out.println();
		        line = 0;
		      }
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
				line ++;
				
			}
		}
	}

	public static void displayEven(int[] arr) {
		int line = 0;
		for (int i = 0; i < arr.length; i++) {
			if (line == 5) {
				System.out.println();
				line = 0;
			}
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
				line++;
				
			}
		}

	}

	public static int getInfoMax(int[] arr) {

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];

		}

		return max;
	}

	public static int getInfoMaxCount(int[] arr) {

		int max = arr[0];
		int count = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			
		}
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] == max) {
				count++;
			}
		}

		return count;
	}

	public static int getInfoSmall(int[] arr) {
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}

		return min;
	}

	public static int getInfoSmallCount(int[] arr) {
		int min = arr[0];
		int count = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
			if (arr[i] == min) {
				count++;
			}
		}

		return count;
	}

	public static double getInfoAverage(int[] arr) {

		int sum = 0;
		int length = arr.length;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}
		double average = sum / length;
		return average;
	}
}
