package p1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		GStack stack = new GStack();
		stack.push(13);
		stack.push(20);
		stack.push(10);
		stack.push(5);
		stack.push(17);
		stack.push(32);
		//stack.pop();
		//stack.popAll();
		ArrayList<Number> numb = new ArrayList<>();
		//numb.add(5);
		//stack.pushAll(numb);
		
		System.out.println(stack.popAll());
	}

}
