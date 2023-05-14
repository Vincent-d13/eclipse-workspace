import java.util.Scanner;

public class randomProblem {

	public static void main(String[] args) {

	//	Scanner in = new Scanner (System.in);
	//	double x = in.nextDouble();
		
		
	//	double fx = (1.0/2) * Math.pow(x, 2) + 1.0/3 * x + 1.0/4;
	//	System.out.print(fx);
		
		int a = 3;
		int b = 1;
		b *= a - 2;  
	//	b -= a + 30;
		
//		System.out.println(b);
	//	int c = a++; // -> 10 b change to 11 nut returns original value
		// y = x++ + ++X -> 10 + 12 postinc returns 10 but is saved ass 11, when you preinc its 11 + 1 = 12 
		// y = x++ + x++ -> 10 + 11
		//y = ++x + x++ -> x is changed from 10 to 12 bc inc twice -> pre inc return 11 post returns 11 
		//++x will change x and return new value, x++ change x return orignal value when on same line 
		//++x runs more effient 
//		System.out.println(a);
		System.out.println(b);
		System.out.println(a);
	}

}
