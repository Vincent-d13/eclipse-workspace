package p2;

import java.util.Scanner;

public class avgCalc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(convert(234));
		
		
	}
	
	public static double convert(double x) {
		
		double celcius = 5.0/9.0 * (x + 32);
		return celcius;
		
		//(max-min+1) + min
	}

}
