package p6;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string with 3 words seperated by spaces");
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		System.out.println("The length of the String is " + s1.length());
		System.out.println("The first char of the String is " + s1.charAt(0));
		System.out.println("The last char of the String is " + s1.charAt(s1.length()-1));
		
		String [] arr = s1.split(" ");
		String test1 = arr[0];
		String test2 = arr[arr.length-1];
		
		System.out.println("The first word is " + arr[0]);
		System.out.println("The last word is " + arr[arr.length-1]);
		
		
		
		if (test1.equals(test2)) {
			System.out.println("the word is the same");
		} else 
			System.out.println("the words are not the same");
		
		if (test1.length() > test2.length()) {
			System.out.println("the first word is larger");
		} else if (test2.length() > test1.length()){
			System.out.println("the last word is larger");
		} else 
			System.out.println("they are the same length");
		
			
		
		
		
		
	}

}
