package p1_partitioning;

public class ArrayPar {

	private long[] arr;
	private int nElems;
	
	public ArrayPar(int maxSize) {
		arr = new long[maxSize];
	}
	
	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = -1;
		int rightPtr = right+1;
		
		while(true) {
			while(leftPtr < right && arr[++leftPtr] < pivot	) {
				;
			}
			
			while(rightPtr > left && arr[--rightPtr] >= pivot) {
				;
			}
			
			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr, rightPtr);
			}
		}
		return leftPtr;
	}
	
	public void swap (int dex1, int dex2 ) {
		long temp = arr[dex1];
		arr[dex1] = arr[dex2];
		arr[dex2] = temp;
	}
	
	public int size() {
		return nElems;
	}
	
	public void insert(long value) {
		arr[nElems++] = value;
		
	}
	
	public void display() {
		for (int i = 0; i< nElems; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}
}

// 0(n) n/4 swaps n-1 comparison for quik sort ) 0(n logn )

