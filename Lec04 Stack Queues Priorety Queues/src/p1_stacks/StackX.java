package p1_stacks;

public class StackX { //big o is one (ADT) Abstract Data Type
	
	//FILO first in last out LIFO last in first out 
	
	private long[] stackArray;
	private int top;
	private int maxSize;
	
	public StackX(int maxSize) {
		this.maxSize = maxSize;
		top = -1;
		stackArray = new long[maxSize];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public long peek () {
		return stackArray[top];
	}
	
	public void push (long value) {
		stackArray[++top] = value;
	}
	
	public long pop() {
		return stackArray[top--];
	}

}
