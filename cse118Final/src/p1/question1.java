package p1;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 int numbers");
		
		int vx = sc.nextInt();
		int vy = sc.nextInt();
		int vz = sc.nextInt();
		
		
		double davg = (vx + vy + vz) / 3.0;
		int iavg = (int) davg;
		
		System.out.println("The average of " + vx + ", " + vy + ", " + vz + " is " + davg + " its integer representation is " + iavg);
		
	}

}
