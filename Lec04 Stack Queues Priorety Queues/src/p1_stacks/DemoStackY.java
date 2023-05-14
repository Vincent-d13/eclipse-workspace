package p1_stacks;

public class DemoStackY {

	public static void main(String[] args) {

		StackY myStack = new StackY();
		myStack.push(new Long (10));
		myStack.push(new Long (20));
	//	myStack.show();
		
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}

}
