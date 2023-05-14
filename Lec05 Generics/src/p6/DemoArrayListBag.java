package p6;

import java.util.ArrayList;

public class DemoArrayListBag {

	public static void main(String[] args) {

		Bag<Name> bag = new Bag<>();
		bag.insert(new Name ("A", "A"));
		bag.insert(new Name ("Z", "X"));
		bag.insert(new Name ("M", "M"));
		bag.insert(new Name ("B", "C"));
		ArrayList<Name> arr = bag.search(s -> s.equals(new Name ("A", "X")));
		//ArrayList<Name> arr2 = bag.search(s -> ((Name)s).getLastName().equals("M"));
		ArrayList<Name> arr3 = bag.search(s -> s.equals(new Name ("Z", "C")));
		
		
		System.out.println(arr);
		
		

	}

}
