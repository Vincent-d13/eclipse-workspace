package p3;

public class palindrome {

	public static void main(String[] args) {

		String s1 = "racecar";
		String s2 = "abcd";
		
		System.out.println(isPalindrome(s1));
		System.out.println(isPalindrome(s2));
	}
	
	 public static boolean isPalindrome(String str)
	    {
	       
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

}
