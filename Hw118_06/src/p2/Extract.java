package p2;

import java.util.Scanner;

public class Extract {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		String str1 = sc.nextLine();

		char char1 = str1.charAt(0);
		char char2 = str1.charAt(str1.length()-1);
		
		StringBuilder sb = new StringBuilder(str1);
		sb.setCharAt(0, char2);
		sb.setCharAt(str1.length()-1, char1);
		
		System.out.println(sb);
		
	}

}
