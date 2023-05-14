package p3;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double f = sc.nextDouble();
		
		double c = sc.nextDouble();
		
		
		double celcius = 5.0/9.0 * (f - 32);
		System.out.println(f + " in farenheit is "+ celcius + " in celcius");
		
		double fahrenheit =( 9.0/5.0) * c  +32;
		System.out.println( c + " in celcius is " + fahrenheit + " in farenheit");
		

	
	}

}
