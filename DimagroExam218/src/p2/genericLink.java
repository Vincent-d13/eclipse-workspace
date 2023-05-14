package p2;

public class genericLink<E extends Number> {

	private E dData;
	private genericLink next;

	public genericLink(E dData) {
		super();
		// this.iData = iData;
		this.dData = dData;
	}

	public E getdData() {
		return dData;
	}

	public void setdData(E dData) {
		this.dData = dData;
	}

	public genericLink getNext() {
		return next;
	}

	public void setNext(genericLink next) {
		this.next = next;
	}

	public void displayGenericLink() {
		System.out.println("{ " + dData + "} ");
	}

}
