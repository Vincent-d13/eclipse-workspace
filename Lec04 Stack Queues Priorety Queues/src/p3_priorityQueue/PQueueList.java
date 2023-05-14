package p3_priorityQueue;

import java.util.ArrayList;

public class PQueueList {
	
	private ArrayList<Long> que;
	
	
	public PQueueList() {
		que = new ArrayList<Long>();
	}
	
	public void add (Long value) {
		int index = 0;
		while (index < que.size()) {
			if (value.compareTo(que.get(index)) <0 ) {
				break;
			}
			index++;
		}
		que.add(index, value);
	}
	
	public Long remove () {
		return que.remove(0);
	}
	
	public Long peekMin() {
		return que.get(0);
	}
	
	public boolean isEmpty() {
		return que.isEmpty();
	}

}
