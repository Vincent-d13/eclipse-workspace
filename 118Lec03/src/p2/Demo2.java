package p2;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x;
		
		if (num % 2 == 0) {
			x = 1;
		} else 
			x = -1;
		
		System.out.println(x);
	//	int userYear = sc.nextInt() % 12;
	//	System.out.println(userYear);

//		switch (userYear) {
//
//		case 0:
//			System.out.println("Monkey");
//			break;
//
//		case 1:
//			System.out.println("rooster");
//			break;
//
//		case 2:
//			System.out.println("Dog");
//			break;
//
//		case 3:
//			System.out.println("pig");
//			break;
//
//		case 4:
//			System.out.println("rat");
//			break;
//
//		case 5:
//			System.out.println("fox");
//			break;
//
//		case 6:
//			System.out.println("tiger");
//			break;
//
//		case 7:
//			System.out.println("rabbit");
//
//		case 8:
//			System.out.println("dragon");
//			break;
//			
//		}
//		sc.close();

	}

}
