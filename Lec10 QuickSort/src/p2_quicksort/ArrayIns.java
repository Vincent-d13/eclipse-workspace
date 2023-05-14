package p2_quicksort;

public class ArrayIns {
	//bad for inversely sorted data -> use merge sort if you can't guarantee data is not sorted inversely
	// n comparisons 
	// nlogn rounds time complexity better than merge sort
	
	private long[] theArray;
	private int nElems;
	
	public ArrayIns(int maxSize) {
		theArray = new long[maxSize];
	}
	
	public void quickSort() {
		recQuickSort(0, nElems-1);
	}
	
	private void recQuickSort(int left, int right) {
		if(right - left <= 0) {
			return;
		} else {
			long pivot = theArray[right];
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition-1);
			recQuickSort(partition+1, right);
		}
	}
	
	private int partitionIt(int left, int right, long pivot) {
			int leftPtr = -1;
			int rightPtr = right+1;
			
			while(true) {
				while(leftPtr < right && theArray[++leftPtr] < pivot	) {
					;
				}
				
				while(rightPtr > left && theArray[--rightPtr] >= pivot) {
					;
				}
				
				if (leftPtr >= rightPtr) {
					break;
				} else {
					swap(leftPtr, rightPtr);
				}
			}
			
			swap(leftPtr, right);
			return leftPtr;
	}
	
	public void swap (int dex1, int dex2 ) {
		long temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
	
	public void insert(long value) {
		theArray[nElems++] = value;
	}
	
	public void display() {
		for (int i = 0; i< nElems; i++) {
			System.out.println(theArray[i] + " ");
		}
		System.out.println();
	}
	
	public int size () {
		return nElems;
	}

}
