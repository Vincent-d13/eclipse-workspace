package p3;

public class Demo {

	public static void main(String[] args) {

		StackList list = new StackList();
		
		int x1 = 10;
		int x2 = 20;
		int x3 = 30;
		
		list.push(x1);
		list.push(x2);
		list.push(x3);
		
		list.show();
	}

}
