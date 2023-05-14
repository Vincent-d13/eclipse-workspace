package p2;

import java.util.Arrays;

public class Rec {
	
	private int	[] arr;
	private int nElems;
	private int maxSize;
	
	
	
	public Rec(int maxSize) {
		super();
		arr = new int[maxSize];
		this.maxSize = maxSize;
	}

	public static void printArray (int [] arr, int i, int n) {
		if(i>=n)
			return;
		System.out.println(arr[i] + " ");
		printArray(arr,i+1,n);
	}

	@Override
	public String toString() {
		return "Rec [arr=" + Arrays.toString(arr) + "]";
	}

	
	
}
