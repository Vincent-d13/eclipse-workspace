package p2;

public class Demo {

	public static void main(String[] args) {

		genericList myList = new genericList();
		
		Double d1 = new Double ("20.1");
		Double d2 = new Double ("10.5");
		Double d3 = new Double ("5.4");
		
		myList.push(d1);
		myList.push(d2);
		myList.push(d3);
		
		myList.displayList();
		
		myList.pop();
		
		System.out.println("________");
		
		myList.displayList();
		
	}

}
