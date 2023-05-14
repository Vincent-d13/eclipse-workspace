package p2_double_ended_linklist;

public class Demo {

	public static void main(String[] args) {
		FirstLastList myList = new FirstLastList();
		myList.insertFirst(22);
		myList.insertFirst(44);
		myList.insertFirst(66);
		
		
	//	myList.displayFoward();
		//myList.displayBackwar();
		
		myList.insertBefore(44, 33);
		//myList.displayFoward();
	}

}
