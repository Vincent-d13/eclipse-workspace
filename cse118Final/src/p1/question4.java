package p1;

import java.util.ArrayList;
import java.util.Random;

public class question4 {

	public static void main(String[] args) {

		char[] myCharArray = new char[60];

		for (int i = 0; i < myCharArray.length; i++) {
			Random r = new Random();

			myCharArray[i] = (char) ('A' + r.nextInt(26));
			
		}
		displayChar(myCharArray);
		countUppercaseLetters(myCharArray);

	

		
	}
	
public static int[] countUppercaseLetters(char[] arr) {
		
		int count = 0;
	    char  c = ' ';
	 //   int[] amount = new int[26];
	    
		for (int i = 0; i < arr.length; i++) {
			c = arr[i];
			if (Character.isUpperCase(c)) {
				count++;
				
			}
		}

		int [] amount = {count}	;
		return amount;
	}
	
	public static void displayChar(char[] arr) {
		
		int line = 0;
		for (int i = 0; i < arr.length; i++) {
			if (line == 12) {
				System.out.println();
				line = 0;
			}
			System.out.print(arr[i] + " ");
			line++;
		}
	}
}
