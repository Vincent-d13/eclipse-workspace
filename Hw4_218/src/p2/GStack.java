package p2;

public class GStack <E>{ //big o is one (ADT) Abstract Data Type
	
	//FILO first in last out LIFO last in first out 
	
	private E[] stackArray;
	private int top;
	private int maxSize;
	
	public GStack (int maxSize) {
		this.maxSize = maxSize;
		top = -1;
		stackArray = (E[]) new Object [maxSize];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public E peek () {
		return stackArray[top];
	}
	
	public void push (E value) {
		stackArray[++top] = value;
	}
	
	public E pop() {
		return stackArray[top--];
	}
	
	public void pushAll (E[] e) {
		for (int i =0; i < e.length; i++) {
			stackArray[++top] = e[i];
		}
	}

}