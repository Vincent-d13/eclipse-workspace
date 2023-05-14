package p5;

import java.util.Arrays;

import p6.Name;

public class DemoBag {

	public static void main(String[] args) {

		Name name = new Name("Z", "Z");
		Bag<Name> bag = new Bag<>(Name.class, 10);
		
		//Bag myBag = new Bag(5); BAD
		bag.insert(new Name ("a", "a"));
		bag.insert(new Name ("b", "b"));
		bag.insert(name);
		//bag.display();
		
	//	Name [] a = bag.search(Name.class, s -> s.equals(new Student ("Vincnet", 4.0)));
		//System.out.println(Arrays.toString(a));
		
	}

}
