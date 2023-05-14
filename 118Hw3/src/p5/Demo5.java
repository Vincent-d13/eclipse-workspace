package p5;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int millimeters;
		int meters;
		int centimeters;
		int temp;

		System.out.print("Enter number of millimeters: ");
		millimeters = sc.nextInt();

		temp = millimeters;

		meters = millimeters / 1000;

		millimeters = millimeters % 1000;

		centimeters = millimeters / 10;

		millimeters = millimeters % 10;

		System.out.println(temp + " millimeters = " + meters + " meters " + centimeters + " centimeters and " + millimeters
				+ " millimeters");
	}
}
