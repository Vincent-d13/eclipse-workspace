package p1;

import java.io.FileWriter;
import java.io.IOException;

public class Utilities {

	public static int[][] obtainData() {
		int[][] mainArray = new int[20][1000];
		int count = 50;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < count; j++) {
				mainArray[i][j] = getRandomNumber();
			}
			count += 50;
		}
		return mainArray;
	}
	
	public static int[][] getNumbersToSearch(int[][] mainArray) {
		int[][] numbersToSearch = new int[20][20];
		int count = 50;
		for(int i = 0; i < 20; i++) {
			
			for(int j = 0; j < 20; j++) {
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
	
	public static void convertToFile(int[] arr) {
		try {
			FileWriter writer = new FileWriter("data/info.txt");
			for (int i=0; i<arr.length; i++) {
				writer.write(arr[i] + "\n");
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("no file");
			e.printStackTrace();
		}
		
	}
}
