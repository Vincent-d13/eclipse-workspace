package p3;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		int avg = (num1 + num2 + num3 + num4) / 4;
		
		System.out.println("The average of these numbers " + num1 + "," + num2 + "," + num3 + "," + num4 + " is " + avg);
	}

}
