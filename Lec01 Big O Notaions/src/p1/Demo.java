package p1;

public class Demo {

	public static void main(String[] args) {
		BasicSorts a = new BasicSorts(10);
		a.insert(4);
		a.insert(9);
		a.insert(2);
		a.insert(7);
		a.insert(3);
		a.insert(5);
		a.insert(8);
		a.insert(6);
		a.insert(1);
		a.insert(10);
		
		a.display();
		a.selectionSort();
		System.out.println("--------");
		a.display();
		
	}

}
