package p1;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {

		String s1 = "racecar";
		String s2 = "something";
		
		System.out.println(isPalindrome(s1));
		System.out.println(isPalindrome(s2));
		
		System.out.println(countChar(s2, 's'));
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string: ");
		
		String str1 = sc.nextLine();
		String [] arr = str1.split(" ");
		System.out.println("The length of the string is: " + str1.length());
		System.out.println("The first char is " + str1.charAt(0) + " the last char is " + str1.charAt(str1.length()-1));
		System.out.println("The first word is " + arr[0] + " the last word is " + arr[arr.length-1]);
		
		System.out.println("Enter another String: ");
		String str2 = sc.nextLine();
		if (str1.length() > str2.length()) {
			System.out.println("The first string is greater");
		} else if (str1.length() == str2.length()) {
			System.out.println("they are equal size");
		} else {
			System.out.println("The second string is greater");
		}
		
		if (str1.equals(str2)) {
			System.out.println("The strings are the same");
		} else
			System.out.println("the strings are not the same");

		System.out.println(isPalindrome(str1));
		System.out.println(countChar(str2, ' '));
		
		
	}
	
	public static boolean isPalindrome(String str) {
    
        String rev = "";
 
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
	
	public static int countChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

}
