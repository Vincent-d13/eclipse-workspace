package p3;

public class question3 {

	public static void main(String[] args) {

		int posNum = 0;
		int negNum = 0;
		
		int posSum = 0;
		int negSum = 0;
		
		for (int i = 0; i < 300; i++) {
			
			int rand = -1000 + (int) (Math.random() * 2000);
			if (rand % 7 == 0 ^ rand % 11 == 0) {

				System.out.println(rand);
			}
			if (rand > 0) {
				posNum++;	
				posSum = i + i;
			} else {
				negNum++;
				negSum = i+ i;
			

			}
			
		}
		System.out.println("there are " + posNum + " positive numbers and " + negNum + " negative numbers generated");
		System.out.println("the sum of all the positive numbers are " + posSum);
		System.out.println("the sum of all the negative numbers are " + negSum);

		
		

	}
}
