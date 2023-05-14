package p2_queues;

import java.util.ArrayList;

public class QueueList {
	
	private ArrayList<Long> list;

	public QueueList() {
		list = new ArrayList<Long>();
	}
	
	public void add (Long value) {
		list.add(value);
	}
	
	public long remove () {
		return list.remove(0);
	}
	
	public Long front() {
		return list.get(0);
		
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
