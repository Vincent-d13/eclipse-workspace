package p1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 7 numbers in range 0 - 10");

		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		int score4 = sc.nextInt();
		int score5 = sc.nextInt();
		int score6 = sc.nextInt();
		int score7 = sc.nextInt();

		int[] scores = { score1, score2, score3, score4, score5, score6, score7 };
		if (getInfoMaxCount(scores) > 1	) {
			int index = indexOfMax(scores);
			for (int i = 0 ; i < scores.length; i++) {
				scores[index] = 0;
			}
		}
		
		if (getInfoMinCount(scores) > 1	) {
			int index = indexOfMin(scores);
			for (int i = 0 ; i < scores.length; i++) {
				scores[index] = 0;
			}
		}
		System.out.println("final score is  " + average(scores));
	}
	
	public static double average(int [] arr) {
		int length = arr.length;

		double sum = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.UP);

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		double average = sum / length;
		return Double.valueOf(df.format(average));
	}

	public static int max(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}
	
	public static int indexOfMax(int [] arr) {
		int max = arr[0];
		int index = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			    index = i;
			}
		}

		return index;
	}
	
	public static int indexOfMin(int [] arr) {
		int min = arr[0];
		int index = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			    index = i;
			}
		}

		return index;
	}

	public static int min(int[] arr) {
		int min = arr[0];

		for (int i = 1; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];

		return min;
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

	public static int getInfoMinCount(int[] arr) {

		int min = arr[0];
		int count = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];

		}
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == min) {
				count++;
			}
		}

		return count;
	}

//	public static int[] removeTheElement(int[] arr, int index) {
//
//		if (arr == null || index < 0 || index >= arr.length) {
//
//			return arr;
//		}
//
//		int[] anotherArray = new int[arr.length - 1];
//
//		for (int i = 0, k = 0; i < arr.length; i++) {
//
//			if (i == index) {
//				continue;
//			}
//			anotherArray[k++] = arr[i];
//		}
//
//		return anotherArray;
//	}

}
