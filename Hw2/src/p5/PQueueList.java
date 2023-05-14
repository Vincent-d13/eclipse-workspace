package p5;

import java.util.ArrayList;

public class PQueueList {
	
	private ArrayList<Student> que;
	
	
	public PQueueList() {
		que = new ArrayList<Student>();
	}
	
	public void add (Student value) {
		int index = 0;
		while (index < que.size()) {
			if (value.compareTo(que.get(index)) <0 ) {
				break;
			}
			index++;
		}
		que.add(index, value);
	}
	
	public Student remove () {
		return que.remove(0);
	}
	
	public Student peekMin() {
		return que.get(0);
	}
	
	public boolean isEmpty() {
		return que.isEmpty();
	}

}
