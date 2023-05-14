package p2;

import java.util.Arrays;

import p1.Book;

public class BookBag {

	private Book[] arr;
	private int nElems;

	public BookBag(int maxSize) {
		arr = new Book[maxSize];
		nElems = 0;
	}

	public void insert(Book book) {
		arr[nElems++] = book;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public Book seqentialSearchByISBN(String isbn) {

		for (int i = 0; i < nElems; i++) {
			if (arr[i].getIsbn().equals(isbn)) {
				return arr[i];
			}
		}
		System.out.println("ISBN not found");
		return null;
	}

	public Book[] seqentialSearchByLastName(String lastName) {
		int n = 0;
		Book[] temp = new Book[10];
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getAuthor().getLastName().equals(lastName)) {
				System.out.println("Book added");
				temp[n++] = arr[i];
			}
		}
		return temp;
	}

	public Book binarySearchByISBN(String isbn) {
		int low = 0;
		int high = nElems - 1;
		Book[] temp = sort();
		while (high >= low) {
			int mid = (low + high) / 2;
			if (temp[mid].getIsbn().equals(isbn)) {
				System.out.println("Book found");
				return temp[mid];

			} else if (temp[mid].getIsbn().compareTo(isbn) > 0) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}
		}
		System.out.println("Book not found");
		return null;
	}

	public void bubbleSort() {
		int n = nElems;
		Book s;
		for (int j = 0; j < n - 1; j++) {
			for (int i = j + 1; i < n; i++) {
				if (arr[i].getIsbn().compareTo(arr[j].getIsbn()) > 0) {
					s = arr[i];
					arr[i] = arr[j];
					arr[j] = s;
				}
			}
		}
		System.out.println("Bubble Sort done on the basis of isbn ");
	}

	public void insertionSort() {
		int n = nElems;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j].getAuthor().getLastName().compareTo(arr[j - 1].getAuthor().getLastName()) < 0) {
					Book temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	public void selectionSortByPrice() {
		int n = nElems;
		Book s;
		for (int i = 0; i < n-1; i++) {
			int lowestIndex = i;
			s = arr[i];
			for (int j = i + 1; j < n; j++) {
				if (arr[j].getPrice() < s.getPrice()) {
					s = arr[j];
					lowestIndex = j;
				}
			}
			if (lowestIndex != i) {
				Book temp = arr[lowestIndex];
				arr[lowestIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public Book deleteByIsbn(Book b) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (arr[j] == b) 
				break;
		}
			if (j == nElems) 
				return null;
			else {
				int k;
				for (k = j; k < (nElems-1); k++) {
					arr[k] = arr[k + 1];
				}
				nElems--;
				return b;
			}
	}
	
	public Book[] deleteByLastName(String name) {
		int i;
		int n = 0;
		Book [] temp = new Book[10];
		for (i = 0; i < nElems; i++) {
			if (arr[i].getAuthor().getLastName().equals(name))
				temp[n++] = arr[i];
				break;
		}
		if (i == nElems)
			return null;
		else {
			int j;
			for (j = i; j < (nElems - 1); j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return temp;
		}
	}
	
	public Book[] sort() {
		Book[] temp = Arrays.copyOf(arr, nElems);
		Arrays.sort(temp);
		return temp;
	}

}
