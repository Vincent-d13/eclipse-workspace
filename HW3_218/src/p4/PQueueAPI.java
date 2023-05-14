package p4;

import java.util.PriorityQueue;

public class PQueueAPI {

	private PriorityQueue<Student> PQue;

	public PQueueAPI() {
		PQue = new PriorityQueue<Student>(7);
	}

	public void insert(Student s) {
			PQue.add(s);

	}

	public boolean isFull() {
		return PQue.size() == 7;
	}
	
	public boolean isEmpty() {
		return PQue.size() == 0;
	}

	public void display() {
		while (!PQue.isEmpty()) {
			Student s = PQue.poll();
			System.out.println(s);
		}
	}
		
		public Student pol() {
			return PQue.poll();
		}

	
	
	public void remove() 	{
		PQue.remove(); //remove head of Que
	}

	

	

}
