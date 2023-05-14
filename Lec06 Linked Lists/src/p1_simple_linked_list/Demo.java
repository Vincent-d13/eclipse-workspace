package p1_simple_linked_list;

public class Demo {

	public static void main(String[] args) {
		LinkList myList = new LinkList();
		myList.insertFirst(1, 1.1);
		myList.insertFirst(2, 2.2);
		myList.insertFirst(3, 3.3);
		myList.insertFirst(4, 4.4);
		
		myList.delete(2);
		myList.displayList();
	}

}
