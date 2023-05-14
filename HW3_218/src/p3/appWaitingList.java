package p3;

public class appWaitingList {
	
	private Applicant [] wait;
	private int maxSize;
	private int nElems;
	
	public appWaitingList () {
		this.maxSize = 2;
		nElems = 0;
		wait = new Applicant[maxSize];
	}
	
	public void insert (Applicant app) {
		wait[nElems++] = app;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	

}
