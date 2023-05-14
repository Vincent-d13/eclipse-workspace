
public class HelloJava {

	public static void main(String[] args) {

//		System.out.print("line 1 ");
//		System.out.println("Hello Java World!");
//		System.out.println("line 3");
		
		System.out.println("I am a student");
		System.out.print("I am learning");
		System.out.print(" Java Program");
		System.out.println(" message");
		
		//Binary Number + positional notation
		//Binary number is base 2 -  1 x 2^3....
		
		// 1 x 2^4 + 0 x 2^3 + 1 x 2^2 + 0 x 2^1 + 1 x 2^0
		
		double x = Math.pow(16.0, 2.0);
		double xx = Math.pow(16, 1);
		double xxx = Math.pow(16, 0);
		
		double ans = 3*x + 12 * xx + 13 * xxx;
	//	System.out.println(ans);
		//16+4+1 =21
		
		//Hexadecimal ABCDEF 10 11 12 13 14 15 16
		
		//3CD 
		//3 x 16^2 + 12 x 16^1 + 13 x 16^0
		
		
		// Decimal to Binary Number
		// 21 -> 2 /21 = 10 r=1 -> 2/10 = 5 r=0 -> 2/5 = 2 r=1 -> 2/2 = 1 r=0  -> 2/1 r=1->>> 10101
		//89 -> 
		//for Decimal to hexadecimal  divide by 16
		double a = 179 % 16;
		double b = 179 / 16;
		System.out.println(a);
		System.out.println(b);
		
		//2022 to hexadecimal 6E7
		
		//Binary to hexadecimal
		//101101101101110 - break into 4 numbers at a time and convert only the 4 at a time to make hexadecimal
		
		
	}

}
