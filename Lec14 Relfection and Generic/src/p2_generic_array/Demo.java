package p2_generic_array;

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {

		Bag<Book> bag = new Bag<>(Book.class, 5);
		
		Book b1 = new Book("A", 10);
		Book b2 = new Book("B", 30);
		Book b3 = new Book("C", 20);
		
		bag.insert(b1);
		bag.insert(b2);
		bag.insert(b3);
//		bag.display();
		

//		Book[] foundArr = bag.search(Book.class, new Predicate<Book>() {
//
//			@Override
//			public boolean test(Book t) {
//				return t.getTitle().equals("A") && t.getPrice() >= 20;
//			}
//			
//		});
		
	//	System.out.println(Arrays.toString(foundArr));
		
		Book[] foundArr = bag.search(Book.class, (t) -> {
			return t.getTitle().equals("A");
						
					});
		
		System.out.println(Arrays.toString(foundArr));
	}

}
