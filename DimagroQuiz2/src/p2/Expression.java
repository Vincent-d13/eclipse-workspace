package p2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter double number: ");
		double userNum = sc.nextDouble();
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double ans = (2.0/3) * Math.pow(userNum, 3) - (3.0/4);
		
		System.out.println("f{" + userNum + "} = " + Double.valueOf(df.format(ans)));
		
		
	}

}
