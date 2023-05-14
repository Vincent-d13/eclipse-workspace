package p2;

import java.util.Arrays;

import p2.Utilities;

public class Demo {

	public static void main(String[] args) {

	//	int[][] array = Utilities.obtainData();
		//int[][] numbersToSearch = Utilities.getNumbersToSearch(array);
		
		int [] search = new int [10];
		int count = 10;
		
		for(int i = 0; i < count; i++) {
			search[i] = (int)(Math.random()* 1000000);
		}
	//	System.out.println(Arrays.toString(search));
		
		int[] data = Arrays.copyOf(search, count);
		
		
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] == (int)(Math.random()*data.length)) {
				break;
			}
		}
		//System.out.println(timeStart1);
		long timeStart1 = System.nanoTime();
		Utilities.seqSearch(data, data[(int)(Math.random()* data.length)]);
		System.out.println("Time took for sequential search: " + (System.nanoTime() - timeStart1));
		
		
		  long start = System.nanoTime();
          int index = Utilities.seqSearch(data, data[(int)(Math.random()* data.length)]);
          long end = System.nanoTime();
          long diff = end - start;
          double avg = 0.0;
          avg += diff;
       
       avg /= 20;
       System.out.println("Sequential Search average " + avg + " nano secs");
       
       System.out.println("----------");
       long timeStart2 = System.nanoTime();
       Arrays.binarySearch(data, data[(int) (Math.random() * data.length)]);
       System.out.println("Time took for binary search: " + (System.nanoTime() - timeStart2) + " nano sec");
       
       long start2 = System.nanoTime();
       int index2 = Utilities.seqSearch(data, data[(int)(Math.random()* data.length)]);
       long end2 = System.nanoTime();
       long diff2 = end2 - start2;
       double avg2 = 0.0;
       avg2 += diff2;
       
       
    
    avg /= 20;
    System.out.println("binary Search average " + avg + " nano secs");
       
       
       
       
		
		
	

}
}
