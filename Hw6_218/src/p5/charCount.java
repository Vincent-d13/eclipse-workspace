package p5;

import java.util.Scanner;

public class charCount {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        char[] test = {'T', 'h', 'e' , 'i', 's', ' ', 't', 'h', 'e', 'c', 'h', 'a', 'r'};
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);
        System.out.println("Count of " + ch + " is " + countCharacter(test, 0, ch));
    }
	

	
	public static int countCharacter(char[] array, int start, char ch) {
        if (start < array.length) {
            if (array[start] == ch) {
                return 1 + countCharacter(array, start + 1, ch);
            } else {
                return countCharacter(array, start + 1, ch);
            }
        }
        return 0;
    }
}
