package p2;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter vx value: ");
		
		double vx = sc.nextDouble();
		
		if (vx < -2) {
			double ans1 = (3.0/4) * Math.pow(vx, 2) - (7.0/4);
			System.out.println("f(" + vx + ")" + " = " + ans1);
		} else if (vx >= -2 && vx < 4) {
			System.out.println("f(" + vx + ")" + " = " +  5.0/4);
		} else if (vx >= 4){
			System.out.println(Math.pow(vx, 1.0/2) - (3.0/4));
		}
	}

}
