package p2_Bag_Class;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Bag <E> implements Serializable{
	
	private ArrayList<E> list;

	public Bag(){
		list = new ArrayList<>();
	}

	public ArrayList<E> search(E value) {

		ArrayList<E> temp = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(value)) {
				temp.add(list.get(i));
			}
		}
		return temp;
	}
	
	public ArrayList<E> search(Predicate predicate) {

		ArrayList<E> temp = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (predicate.test(list.get(i))) {
				temp.add(list.get(i));
			}
		}
		return temp;
	}
	
	public ArrayList<E> remove(Predicate predicate) {
		ArrayList<E> temp = new ArrayList<>();
		for (int i = 0; i< list.size(); i++) {
			if (predicate.test(list.get(i))) {
				temp.remove(list.get(i));
			}
		}
		return temp;
	}
	
	public void insert(E value) {
		list.add(value);
		
	}
	
	public void display() {
		for (int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}
}
