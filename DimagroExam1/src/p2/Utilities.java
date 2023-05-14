package p2;

public class Utilities {
	
		public static int[][] obtainData() {
			int[][] mainArray = new int[10][1000];
			int count = 50;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < count; j++) {
					mainArray[i][j] = getRandomNumber();
				}
				count += 50;
			}
			return mainArray;
		}
		
		public static int[][] getNumbersToSearch(int[][] mainArray) {
			int[][] numbersToSearch = new int[10][10];
			int count = 50;
			for(int i = 0; i < 10; i++) {
				
				for(int j = 0; j < 10; j++) {
					int randomNumber = (int)(Math.random() * count);
					numbersToSearch[i][j] = mainArray[i][randomNumber];
				}
				count += 50;
			}
			return numbersToSearch;
		}

		public static int getRandomNumber() {
			return (int) (Math.random() * 1000000);
		}
		
		public static int seqSearch(int [] a, int n) {
			for (int i =0; i < a.length; i++) {
				if (a[i] == n) {
					return i;
				}
			}
			return -1;
		}
		
		
		


	}



