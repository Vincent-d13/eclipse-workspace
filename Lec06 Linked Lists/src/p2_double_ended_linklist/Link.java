package p2_double_ended_linklist;

public class Link {
	public double dData;
	public Link next;
	public Link previous;
	
	public Link(double dData) {
		this.dData = dData;
		next = null;
		previous = null;
	}

	public void displayLink() {
		System.out.println(dData + " ");
	}
}
