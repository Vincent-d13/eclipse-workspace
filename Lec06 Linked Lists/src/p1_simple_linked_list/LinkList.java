package p1_simple_linked_list;

public class LinkList {

	private Link first;
	
	public LinkList() {
		first = null;
		
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.getNext();
		}
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public Link delete (int key) {
		Link current = first;
		Link previous = first;
		while (current.getiData() != key) {
			
			if (current.getNext() == null) {
				return null;
			}else {
				previous = current;
				current = current.getNext();
			}
		}
		if (current == first) {
			first = first.getNext();
		}else {
			previous.setNext(current.getNext());
		}
		return current;
	}
	
	public Link find(int key) {
		Link current = first;
		while(current.getiData() != key) {
			if(current.getNext() == null) {
				return null;
			}else {
			current = current.getNext();	
			}
		}
		return current;
	}
	
	public Link deleteFirst() { //O(1) deleteLast() O(n) 
		Link temp = first;
		first = first.getNext();
		return temp;
	}
	
	public void insertFirst(int iData, double dData) { //O(1) insertLast() O(n)  10/6 i data, title, price
		Link newLink = new Link(iData, dData); // new book(title, price)
		if (first == null) {
			first = newLink;
		} else {
			newLink.setNext(first);
			first = newLink;
		}
		
	}
	
	
}
