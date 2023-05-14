package p2;

public class question2 {

	public static void main(String[] args) {

		
		int rand = 1 + (int) (Math.random() * 9998);
		int count = 0;
		while (count < 3) {
		
			if (rand % 2 == 0) {
				count++;
			}
			if (rand % 3 == 0) {
				count++;
			}
			if (rand % 5 == 0) {
				count++;
			}
			if (rand % 7 == 0) {
				count++;
			}
			if (rand % 11 == 0) {
				count++;
			} else if (count < 3) {
				rand  = 1 + (int) (Math.random() * 9998);
			}
		}
		System.out.println(count);
		System.out.println(rand);

	}

}
