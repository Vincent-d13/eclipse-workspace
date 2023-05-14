package p3;

public class GStack <E>{ 
	
	
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
	
	public E[] popAll() {
		E[] temp = (E[]) new Object[maxSize];
		for ( int i = 0; i < maxSize; i++) {
			temp[i] = stackArray[top--];
			if ( top == -1) {
				break;
			}
		}
		return temp;
	}

}