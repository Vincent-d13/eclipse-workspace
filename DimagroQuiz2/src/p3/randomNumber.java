package p3;

public class randomNumber {

	public static void main(String[] args) {

		int randNum = 100 + (int) (Math.random() * 899);
		System.out.println("The random number = " + randNum);

		if (randNum % 9 == 0 && randNum % 11 == 0) {
			System.out.println("The number is divisable by 9 and 11");
		} else
			System.out.println("The number is not divisbale by 9 and 11");

		if (randNum % 11 == 0 ^ randNum % 13 == 0) {
			System.out.println("This number is divisable by 11 or 13 but not both");
		} else {
			System.out.println("This number is divisable by neither");
		}

		int d3 = randNum / 100;

		int d2 = randNum / 10;
		d2 = d2 % 10;

		int d1 = randNum % 10;

		System.out.println(d3);
		System.out.println(d2);
		System.out.println(d1);

		if (d3 > d2 && d3 > d1) {
			System.out.println("hundreds is the greatest");
		} else if (d2 > d3 && d2 > d1) {
			System.out.println("The tens is bigger");
		} else {
			System.out.println("The ones is bigger");
		}

	}

}
