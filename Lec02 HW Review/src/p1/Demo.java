package p1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		StudentBag b1 = new StudentBag(1000);
		for (int i = 50; i <= 1000; i = i + 50) {
			System.out.println("To fill " + i + " Students it took: ");
			b1.fill(i);
			b1.resetNElems();
		}
		b1.display();
		
		int[][] array = Utilities.obtainData();
		int[][] numbersToSearch = Utilities.getNumbersToSearch(array);
		
		for(int i = 0; i < 20; i++) {
			System.out.println(Arrays.toString(numbersToSearch[i]));
		}
			int[] a = new int[100];
			int count = 50;
			
			for(int i = 0; i < count; i++) {
				a[i] = (int)(Math.random()* 100);
			}
		
			System.out.println(Arrays.toString(a));
			
			int[] dataArr = Arrays.copyOf(a, count);
			
			long timeStart1 = System.nanoTime();
			System.out.println(timeStart1);
			for(int i = 0; i < dataArr.length; i++) {
				if(dataArr[i] == 50) {
					break;
				}
			}
			System.out.println("Time took for sequential search: " + (System.nanoTime() - timeStart1));
//			
			System.out.println(Arrays.toString(dataArr));
//			
			Arrays.sort(dataArr);
//			
			System.out.println(Arrays.toString(dataArr));
			
//			List<int[]> list = Arrays.asList(dataArr);
			long total = 0;
			long startTime = System.nanoTime();
			int index = Arrays.binarySearch(dataArr, dataArr[(int)(Math.random()* dataArr.length)]);
			System.out.println("It took: " + (System.nanoTime() - startTime));
			total += (System.nanoTime() - startTime);
			System.out.println(total/20);
			Utilities.convertToFile(dataArr);
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
	// seq the itme size gets bigger teh time increases lineranelly 
// bin seach pretty much the smae with small differnces
	


