import java.util.Random;

public class Demo {

	public static void main(String[] args) {

		Random rand = new Random();
		int min = 10;
		int max = 99;

//		for (int i = 0; i < 25; i++) {
//			int rand1 = rand.nextInt(max - min+1) + min;
//			System.out.println(rand1);
//		}

		// (100.0 - (-100)) + (-100)

		// d2 x/100, d1 (x/10) %10, d0 = x % 10

		// (max-min+1) + min

		int rand1 = rand.nextInt(max - min + 1) + min;

		int x = 52;

		int y = x / 10;
		int z = x % 10;
		System.out.println(y);
		System.out.println(z);

		if (y > z) {
//			int temp = y;
//			y = z;
//			z = temp;
			// num = d0 * 10 + d1
			
		}
		
		int num1 = rand.nextInt(1000)+1;
		if ( num1 % 2 == 0 && num1 % 3 == 0 ) {
			
		}
		
		// 2 or 3 but not both ^

	}

}
