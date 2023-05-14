package p3;

import java.util.ArrayList;

public class StackList <E>{ // remove from end

private ArrayList<E> stackList;
	
	public StackList() {
		this.stackList = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		return stackList.size() == 0;
	}
	
	public void push (E value) {
		stackList.add(value);
	}
	
	public void show() {
		System.out.println(stackList);
	}
	
	public E pop() {
		return stackList.remove(stackList.size()-1);
	}
	
	public int peek() {
		return stackList.size()-1;
	}
	
	public int size() {
		return stackList.size();
	}
	
}
