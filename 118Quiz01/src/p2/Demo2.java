package p2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double num = sc.nextDouble();

		double y = num % 1;

		DecimalFormat df = new DecimalFormat("0.000");
		DecimalFormat df2 = new DecimalFormat("000");
		df.setRoundingMode(RoundingMode.DOWN);

		System.out.println(Double.valueOf(df.format(y)));

		num = Double.valueOf(df.format(num));
		System.out.println(num);

	}
}
