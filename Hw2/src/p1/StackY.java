package p1;

import java.util.ArrayList;

public class StackY {
	
	private ArrayList<Long> stackList;
	
	public StackY() {
		this.stackList = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		return stackList.size() == 0;
	}
	
	public void push (Long value) {
		stackList.add(value);
	}
	
	public void show() {
		System.out.println(stackList);
	}
	
	public Long pop() {
		return stackList.remove(stackList.size()-1);
	}

}
