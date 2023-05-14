package p1;

import java.util.ArrayList;

public class StackList {

private ArrayList<String> stackList;
	
	public StackList() {
		this.stackList = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		return stackList.size() == 0;
	}
	
	public void push (String value) {
		stackList.add(value);
	}
	
	public void show() {
		System.out.println(stackList);
	}
	
	public String pop() {
		return stackList.remove(stackList.size()-1);
	}
	
	public int peek() {
		return stackList.size()-1;
	}
	
	public int size() {
		return stackList.size();
	}
	
}
