package p6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		

		double x = sc.nextDouble();
		
		double y = x % 1;
		DecimalFormat df = new DecimalFormat("0.000");
		DecimalFormat df2 = new DecimalFormat("000");
		
		
		System.out.println(Double.valueOf(df.format(y)));
				if (y >= .5) {
			System.out.println(df2.format(x-1));
		} else {
			System.out.println(df2.format(x));
		}
		
		
	}

}
