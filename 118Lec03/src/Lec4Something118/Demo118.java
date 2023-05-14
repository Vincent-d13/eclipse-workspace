package Lec4Something118;

import java.util.Scanner;

public class Demo118 {

	public static void main(String[] args) {

		/* (int) (23.45) * 10/100.0 = 
		convert 23.45 to integer -> 23
		 23 * 10 -> 230
		230/100.0 -> 2.3 if its 100 it will be 2.0
		 * 
		 * (int)(25.45 * 10) / 100
		 * 
		 * int x=5
		 * int y = ++x
		 *  x = 6 y=6
		 * 
		 * int y = x--
		 * x=5 y=4
		 * 
		 * (int)(34.456 * 100/10) = 344
		 * 
		 */
		
		double x = (int)(26.345 * 100) / 10.0; // int wont have 344.0
		
		double f = (int) (26.345) * 10/100;
//		double a = (int) (34.456 * 100) /10;
		double b = (int) (34.456 * 100) /10.0;
//		double c = (int) (34.456) * 100.0 /10.0;
//		double d = (int) (34.456) * 10.0/100.0;
	//	double y = (int) (23.45) * 10/100.0;
	//	Scanner sx = new Scanner (System.in);
	//	double radius = sx.nextDouble();
		
//		if (radius % 2 == 0) {
//			System.out.println("number is even");
//		} else {
//			System.out.println("Number is odd");
//			
//		}
	//	System.out.println(x);
//		System.out.println(a);
		//System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		System.out.println(f);
//		System.out.println(y);
		
		Scanner sc = new Scanner(System.in);
		int n1 = (int)(Math.random() * 100);
		int n2 = (int)(Math.random() * 100);
		
		int ans = n1 + n2;
		
		System.out.println("What is " + n1 + " + " + n2 + "?");
		int userAns = sc.nextInt();
		if (userAns == ans) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect the correct answer is: " + ans);
		}
		
		double weight = sc.nextDouble();
		
		
	}

}
