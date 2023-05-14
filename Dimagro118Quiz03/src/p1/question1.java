package p1;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number from 6-10");
		int userNum = sc.nextInt();
		
		if (userNum < 6 || userNum > 10) {
			System.out.println("The number you entered is out of range");
		} else {
			System.out.println("*******");
			System.out.println("******");
			System.out.println("*****");
			System.out.println("****");
			System.out.println("***");
			System.out.println("**");
			System.out.println("*");
		}
		sc.close();
	}

}
