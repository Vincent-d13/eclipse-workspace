package p2;

import java.util.ArrayList;

public class pQueue {

	private ArrayList<Double> que;

	public pQueue() {
		que = new ArrayList<Double>();
	}

	public void add(Double value) {
		int index = 0;
		while (index < que.size()) {
			if (value.compareTo(que.get(index)) < 0) {
				break;
			}
			index++;
		}
		que.add(index, value);
	}
	
	public Double remove() {
		return que.remove(0);
	}
	
	public Double peekMin() {
		return que.get(0);
	}
	
	public boolean isEmpty() {
		return que.isEmpty();
	}
}
