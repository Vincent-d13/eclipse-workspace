package p2;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter a year: ");
//		int year = sc.nextInt();
//		
//		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//			System.out.println("It is a leap year");
//		} else {
//			System.out.println("Not a leap year");
//		}
//		sc.close();
		
		Scanner sc = new Scanner (System.in);
		//(max-min+1) + min
		Random rand = new Random();
		int randNum = rand.nextInt(99-10+1)+10;
		System.out.println(randNum);
		int d1 = randNum % 10;
		int d2 = randNum / 10;
		System.out.println("Enter Number: ");
		int userNum = sc.nextInt();
		int u1 = userNum % 10;
		int u2 = userNum / 10;
		
		if (userNum == randNum) {
			System.out.println("You've been awarded $10,000");
		} else if (u1 == d1 || u1 == d2 || u2 == d1 || u2 == d2	) {
			System.out.println("You've been awarded $3000");
		} else {
			System.out.println("You lose");
		}
		sc.close();
		
		
		// extract 3 from 35 by dividing 10 35 / 10
		// extract 5 from 35 by modular 10 35 % 10
		
	}

}
