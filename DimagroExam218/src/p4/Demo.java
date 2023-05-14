package p4;

public class Demo {

	public static void main(String[] args) {
		
		linkListGeneric myList = new linkListGeneric();
		
		Book b1 = new Book ("Title1", 199.99);
		Book b2 = new Book ("Title2", 299.99);
		Book b3 = new Book ("Title3", 99.99);
		
		myList.add(b1);
		myList.add(b2);
		myList.add(b3);
		
		myList.display();
		

	}

}
