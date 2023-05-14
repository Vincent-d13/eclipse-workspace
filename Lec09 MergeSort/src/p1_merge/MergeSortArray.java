package p1_merge;

public class MergeSortArray {
	
	private long[] theArray;
	private int nElems;
	
	public MergeSortArray(int maxSize) {
		theArray = new long[maxSize];
		nElems = 0;
		
	}
	
	public void mergeSort() {
		long[] workspace = new long[nElems];
		recMergeSort(workspace, 0, nElems-1);
		
	}
	
	public void recMergeSort(long[] workspace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound) {
			return;
		} else {
			int mid = (lowerBound + upperBound)/2;
			recMergeSort(workspace, lowerBound, mid); //sort lower half adjusting middle 
			recMergeSort(workspace, mid+1, upperBound); // sort high half 
			merge(workspace, lowerBound, mid+1, upperBound);
		}
	}
	
	private void merge(long[] workspace, int lowPtr, int highPtr, int upperBound) {
		int j = 0; // workspace index
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1; // number of data items
		
		//lowPtr is aIndex, highPtr is bIndex, j is cIndex
		
		while (lowPtr <= mid && highPtr <= upperBound) { //neither sub array is done 
			if (theArray[lowPtr] < theArray[highPtr]) {
				workspace[j++] = theArray[lowPtr++];
			} else {
				workspace[j++] = theArray[highPtr++];
			}
		}
		
		while (lowPtr <= mid) { //high half is finished
			workspace[j++] = theArray[lowPtr++];
		}
		
		while (highPtr <= upperBound) { //low half is gone 
			workspace[j++] = theArray[highPtr++];
		}
		
		for (j = 0; j < n; j++) {
			theArray[lowerBound + j] = workspace[j];
		}
	}

	public void insert(long value) {
		theArray[nElems++] = value;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(theArray[i] + " ");
		}
		System.out.println();
	}

}
