package p4;

public class randNum {

	public static void main(String[] args) {

		int num4 = 1000 + (int) (Math.random() * ((9999 - 1000) + 1));
		System.out.println(num4);

		int d3 = num4 / 1000;
		int d2 = (num4 / 100) % 10;
		int d1 = (num4 / 10) % 10;
		int d0 = num4 % 10;

		System.out.println("d3 = " + d3);
		System.out.println("d2 = " + d2);
		System.out.println("d1 = " + d1);
		System.out.println("d0 = " + d0);

		int count = 0;
		if (d3 % 2 == 0) {
			count++;
		}
		if (d2 % 2 == 0) {
			count++;
		}
		if (d1 % 2 == 0) {
			count++;
		}
		if (d0 % 2 == 0) {
			count++;
		}
		System.out.println("There are " + count + " even digits");

		String s1 = String.valueOf(num4);
		System.out.println(s1);

		System.out.println(isPalindrome(s1));

		if (d3 > d2 && d2 > d1 && d1 > d0) {
			System.out.println("numbers are in order");
		} else
			System.out.println("numbers are not in order");

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

}
