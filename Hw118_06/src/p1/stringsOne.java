package p1;

import java.util.Scanner;

public class stringsOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		//length of the string 
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println("---------");
		//last and first letter
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(str1.length()-1));
	
		System.out.println(str2.charAt(0));
		System.out.println(str2.charAt(str2.length()-1));
		
		System.out.println("--------");
		//compare string
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		System.out.println("------");
		//check which string is smaller case insensitive
		if (str1.compareTo(str2) == 1) {
			System.out.println("string 2 is bigger");
			System.out.println(str1);
			System.out.println(str2);
		} else {
			System.out.println("string 1 is bigger or equal to");
		System.out.println(str2);
		System.out.println(str1);
		}
		
		//check which string is smaller case sensitive
		if (str1.toLowerCase().compareTo(str2.toLowerCase()) == 1 ){
			System.out.println("string 2 is bigger");
			System.out.println(str1);
			System.out.println(str2);
		} else {
			System.out.println("string 1 is bigger or equal to");
		System.out.println(str2);
		System.out.println(str1);
		}
		
		//convert to upper case
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		//extract
		char char1 = str1.charAt(0);
		char char2 = str1.charAt(str1.length()-1);
		
		char char3 = str2.charAt(1);
		char char4 = str2.charAt(str2.length()-2);
		
		char [] ca = {char1, char2, char3, char4};
		String str3 = String.valueOf(ca);
		
		System.out.println(str3);
		
		//extract white space
		String str1words[] = str1.split(" ");
		String str2words[] = str2.split(" ");
		String newString2 = str1words[0]+" "+str1words[str1words.length-1]+" "+str2words[0]+" "+str2words[str2words.length-1];
		System.out.println(newString2);
	}

}
