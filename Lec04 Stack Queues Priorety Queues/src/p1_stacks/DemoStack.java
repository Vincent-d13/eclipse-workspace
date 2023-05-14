package p1_stacks;

public class DemoStack {

	public static void main(String[] args) {

		StackX myStack = new StackX(5);
		
		while (!myStack.isFull()) {
			myStack.push((long) (Math.random()* 10));
		}
		System.out.println(myStack.peek());
		
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
		
//		myStack.push(10);
//		myStack.push(20);
//		myStack.push(30);
//		
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
	}

}
