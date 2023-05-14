package p3;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter ounces: ");
		
		int ounces;
		int tempOz;
		int pounds;
		int temp;
		
		
		ounces = sc.nextInt();
		tempOz = ounces;
		temp = ounces;
		ounces = temp % 16;
		
		pounds = temp / 16;
		
		System.out.println(pounds + " pounds " + " = " + ounces + " ounces");
		
		double oz = (int) tempOz;
		double temp2 = oz;
		oz = temp2 % 16;
		
		double pounds2 = temp2 / 16;
		System.out.println(pounds2 + " " + "pounds");
		
		DecimalFormat df = new DecimalFormat ("00.000");
		df.setRoundingMode(RoundingMode.UP);
		double pounds3 = Double.valueOf(df.format(pounds2));
		System.out.println(pounds3 + " " + "pounds");
		
		
	}

}
