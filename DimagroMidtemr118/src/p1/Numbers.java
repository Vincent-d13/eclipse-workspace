package p1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two double numbers: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		DecimalFormat df = new DecimalFormat ("0.00");
		df.setRoundingMode(RoundingMode.DOWN);
		
		num2 = Double.valueOf(df.format(num2));
		System.out.println(num2);
		
		int var3 = 0;
		if (num1 > num2) {
			var3 = (int) num1;
		} else 
			var3 = (int) num2;
		
		System.out.println(var3);
		
		if (var3 % 3 == 0 && var3 % 7 == 0) {
			System.out.println("divisable by 7 and 3");
		} else 
			System.out.println("not divisable by 3 and 7");
		
		if (var3 % 5 == 0 ^ var3 % 7 == 0) {
			System.out.println("divisable by 5 or 7");
		} else 
			System.out.println("divisable by neither");
		
	}

}
