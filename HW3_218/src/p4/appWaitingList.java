package p4;

public class appWaitingList {
	
	private Student [] wait;
	private int maxSize;
	private int nElems;
	
	public appWaitingList () {
		this.maxSize = 2;
		nElems = 0;
		wait = new Student[maxSize];
	}
	
	public void insert (Student app) {
		wait[nElems++] = app;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
}
