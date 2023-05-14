package p3;

public class LinkList {

private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public ListIterator getIterator() {
		return new ListIterator(this);// this means the calling object currently calling the method
	}
	
	public Link getFirst() {
		return first;
	}
	
	public void setFirst(Link link) {
		this.first = link;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void display() {
		Link current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
}


