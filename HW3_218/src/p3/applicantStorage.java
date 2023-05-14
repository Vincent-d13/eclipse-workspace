package p3;

import java.util.concurrent.ArrayBlockingQueue;

public class applicantStorage {
	
	private ArrayBlockingQueue<Applicant> que;
	
	public applicantStorage() {
		que = new ArrayBlockingQueue<Applicant> (5);
	}
	
	public void insert(Applicant name) {
		que.add(name);
	}
	
	public boolean isFull () {
		return que.size() == 5;
	}
	
	
}
