package p2;


import p1.StackList;

public class Reverse {

	public static void main(String[] args) {

		StackList myStack = new StackList();
		
		String s = "The horse is brown. The Strose is closed. The mall is open. The shoes are red. Java is cool.";
		myStack.push(s);
		String [] temp = s.split("\\.");
		myStack.pop();
		
			for (int i = temp.length - 1; i >= 0; i--) {
				String str = temp[i];
				myStack.push(str);
			}
			myStack.show();
			
			while (!myStack.isEmpty()) {
				myStack.pop();
			}
			
			String [] temp2 = s.split("");
			
			for (int i = temp2.length -1; i >= 0; i--) {
				String str2 = temp2[i];
				myStack.push(str2);
			}
		
		
		myStack.show();
			
		
		
	}
}


