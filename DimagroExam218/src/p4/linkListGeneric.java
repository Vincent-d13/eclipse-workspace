package p4;

import java.util.LinkedList;

public class linkListGeneric <E>{
	
	private LinkedList<E> list;
	
	
	public linkListGeneric() {
		list = new LinkedList<E>();
	}
	
	public void add (E vaule) {
		list.add(vaule);
	}
	
	public E remove () {
		return list.remove(0);
	}
	
	public E Front() {
		return list.get(0);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	

	public void display() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}
}
