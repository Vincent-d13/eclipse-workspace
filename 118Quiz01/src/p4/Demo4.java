package p4;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int ounces ;
		int quarts;
		int temp;
		
		 ounces = sc.nextInt();
		 temp = ounces;
		 ounces = temp % 32;
		 
		 quarts = temp / 32;
		 System.out.println("Ounces= " + ounces + " quarts= " + quarts);
		 
		
		
	}

}
