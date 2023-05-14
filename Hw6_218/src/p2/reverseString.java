package p2;

public class reverseString {

	public static void main(String[] args) {
		
		String str = "This kid in the class is sleeping";
		
		System.out.println(stringReverse(str));

	}

	public static String stringReverse(String str) {

		int currentIdx = str.length();

		if (currentIdx == 0) {
			return " ";
		} else {
			return str.charAt(currentIdx - 1) + stringReverse(str.substring(0, currentIdx - 1));
		}

	}

}
