package p1_merge;

public class DemoMergeSort {

	public static void main(String[] args) {

		MergeSortArray arr = new MergeSortArray(10);
		arr.insert(4);
		arr.insert(7);
		arr.insert(2);
		arr.insert(0);
		arr.insert(6);
		arr.insert(1);
		arr.insert(3);
		arr.insert(5);
		arr.display(); // unsorted
		
		arr.mergeSort();
		arr.display();
		
		//copy: n
		//comparisons: n
		// Big O of merging: n
		//Something about n log n somewhere probably merge sorting itself not merge 
	}

}
