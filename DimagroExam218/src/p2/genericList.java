package p2;

public class genericList <E extends Number>{
	
private genericLink first;
	
	public genericList() {
		first = null;
		
	}
	
	public void displayList() {
		genericLink current = first;
		while(current != null) {
			current.displayGenericLink();
			current = current.getNext();
		}
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	
	public genericLink pop() { 
		genericLink temp = first;
		first = first.getNext();
		return temp;
	}
	
	public void push(E dData) { 
		genericLink newgenericLink = new genericLink(dData); 
		if (first == null) {
			first = newgenericLink;
		} else {
			newgenericLink.setNext(first);
			first = newgenericLink;
		}
		
	}

	

}
