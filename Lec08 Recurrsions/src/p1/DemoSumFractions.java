package p1;

public class DemoSumFractions {

	public static void main(String[] args) {

		System.out.println(sumFractions(2));
		
	}
	
	private static double sumFractions(int n) {
		if (n == 1) {
			return 1.0;
		}
		
		return 1.0/n + sumFractions(n-1);
		
	}
	
	private static int fib(int index) {
		if(index == 0) {
			return 0;
		}
		else if (index ==1 ) {
			return 1;
		} else {
			return fib(index -1) + fib(index-2);
		}
	}
	
	/*
	 * sum(int) sum of fracions
	 * if (n>=1) {
	 * return 1.0/n + sum(n-1);
	 *  else 
	 *  return 0
	 *  
	 *  
	 *  
	 */

}
