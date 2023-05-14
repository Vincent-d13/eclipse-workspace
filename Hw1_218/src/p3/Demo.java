package p3;

import java.util.Arrays;

import p1.Author;
import p1.Book;
import p2.BookBag;

public class Demo {

	public static void main(String[] args) {

		BookBag bag = new BookBag(100);
		Author name = new Author ("John", "Doe");
		Author name2 = new Author ("Freddy", "FazBear");
		Book b1 = new Book ("Book", "1234", name, 150.00);
		Book b2 = new Book ("Book1", "1233", name2, 200.00);
		Book b3 = new Book ("Book2", "4321", name2, 100.00);
		Book b4 = new Book ("Book 4", "12212", name2, 250.00);
		
		bag.insert(b1);
		bag.insert(b2);
		bag.insert(b3);
		bag.insert(b4);
		
//	    System.out.println(bag.seqentialSearchByISBN("123"));
//		System.out.println(Arrays.toString(bag.seqentialSearchByLastName("Doe")));
		

//		System.out.println(bag.binarySearchByISBN("4321"));

	//	bag.selectionSortByPrice();
	//	bag.display();
		System.out.println(Arrays.toString(bag.deleteByLastName("Doe")));
	//	System.out.println(bag.deleteByLastName("Doe"));
		
	}

}
