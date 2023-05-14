package p5;

public class NameBag {
	
	private Name [] arr;
	private int nElems;
	
	public NameBag(int maxSize) {
		arr = new Name[maxSize];
	}

	public void insert (Name n) {
		arr[nElems++] = n;
	}
}
