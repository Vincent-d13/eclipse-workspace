package p1;

import java.util.ArrayList;

public class queueList {

	private ArrayList<String> list;

	public queueList() {
		list = new ArrayList<String>();
	}
	
	public void add (String value) {
		list.add(value);
	}
	
	public String remove () {
		return list.remove(0);
	}
	
	public String front() {
		return list.get(0);
		
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	
}
