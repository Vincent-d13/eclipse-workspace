package p4;

public class detectorPalindrome {

	public static void main(String[] args) {

		String s1 = "racecar";
		String s2 = "apples";
		System.out.println(palindromeDetector(s1));
	}
	
	

	public static boolean palindromeDetector(String str) {

		if (str.length() == 0 || str.length() == 1) {
			return true;
		}
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return palindromeDetector(str.substring(1, str.length() - 1));
		}
		return false;
	}
	
	/*
	 * int front = 0
	 * int rear = str.length()-1
	 * 
	 * if (front >= rear)
	 * return ture 
	 * if (s.charat(front) == str.charat(rear)
	 * str = str.substring (front +1, rear
	 * return isplaindrome(str 
	 * else 
	 * return false
	 */
}
