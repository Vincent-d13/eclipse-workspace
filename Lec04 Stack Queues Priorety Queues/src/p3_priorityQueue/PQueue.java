package p3_priorityQueue;

public class PQueue {
	
	private long[] queArray;
	private int nElems;
	private int maxSize;
	
	public PQueue(int maxSize) {
		queArray = new long[maxSize];
		this.maxSize = maxSize;
		nElems = 0;
	}
	
	public void insert(long value) {
		int j;
		if (nElems == 0) {
			queArray[0] = value;
		} else {
			for ( j = nElems - 1; j >= 0; j--) {
				if (value > queArray[j]) {
					queArray[j+1] = queArray[j];
				} else {
					break;
				}
			}
			queArray[j+1] = value;
			
		}
		nElems++;
	}
	
	public long remove() {
		return queArray[--nElems];
	}
	
	public long peekMin() {
		return queArray[nElems - 1];
	}
	
	public int size() {
		return nElems;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}

	public boolean isEmpty	() {
		return nElems == 0;
	}
	
}
