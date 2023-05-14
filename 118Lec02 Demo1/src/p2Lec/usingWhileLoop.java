package p2Lec;

import java.util.Scanner;

public class usingWhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int rand = (int)(Math.random() * 9);
		int rand2 = (int)(Math.random() * 9);
		
		int ans = rand + rand2;
	
		System.out.println("what is " + rand + " + " + rand2);
		
		int userans = sc.nextInt();
		
		//System.out.println(rand);
		//System.out.println(rand2);
		
		
		while(ans != userans) {
			System.out.println("Try again");
			userans = sc.nextInt();
		}
		System.out.println("Good job");
		
		
		
		
	}

}
