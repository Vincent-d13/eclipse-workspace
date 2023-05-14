package p1;

import java.util.Arrays;

public class waitingList {
	
	private Student[] queArray;
	private Student[] waitArray;
	private int nElems;
	private int maxSize;
	private int waitElems;
	
	public waitingList(int maxSize) {
		queArray = new Student[maxSize];
		this.maxSize = maxSize;
		nElems = 0;
		waitElems = 0;
		waitArray = new Student[maxSize];
	}
	
	public Student [] insert(Student value) {
		int i;
		if (nElems == 0) {
			queArray[0] = value;
		} else {
			for ( i = nElems - 1;i >= 0; i--) {
				 if (value.compareTo(queArray[i]) <= 0) {
					 queArray[i+1] = queArray[i];
					}
				 else {
						break;
					}
				}
				queArray[i+1] = value;
				
			}
			nElems++;
			return waitArray;
		}
	
	public void insertGood(Student course) {
		waitArray[waitElems++] = course;
	}

	
	@Override
	public String toString() {
		return "waitingList [queArray=" + Arrays.toString(queArray) + "]";
	}

}
