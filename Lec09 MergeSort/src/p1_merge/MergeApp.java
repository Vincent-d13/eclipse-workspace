package p1_merge;

public class MergeApp {

	public static void main(String[] args) {

		int[] arrayA = {12, 34, 56, 57, 61, 78};
		int[] arrayB = {1, 3, 19, 36, 68};
		int[] arrayC = new int[arrayA.length + arrayB.length];
		merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		display(arrayC, arrayC.length);
	}

	public static void merge(int[] arrayA, int lengthA, int[] arrayB, int lengthB, int[] arrayC) {

		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		while(aIndex < lengthA && bIndex < lengthB) { // neither arrayA nor arrayB is finished
			if(arrayA[aIndex] < arrayB[bIndex]) {
				arrayC[cIndex++] = arrayA[aIndex++];
			} else {
				arrayC[cIndex++] = arrayB[bIndex++];
			}
		}
		
		while(aIndex < lengthA) { // arrayB is done
			arrayC[cIndex++] = arrayA[aIndex++];
		}
		
		while(bIndex < lengthB) { // arrayA is done
			arrayC[cIndex++] = arrayB[bIndex++];
		}
	}
	
	public static void display(int[] arr, int size) {
		 for (int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i] + " ");
		 }
		 System.out.println();
	}

}

// *n*logN
