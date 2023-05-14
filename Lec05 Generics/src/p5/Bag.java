package p5;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Bag <E> implements Serializable{
	
	private E []  arr;
	private int nElems;
	
	public Bag (int maxSize) {
		arr = (E[]) new Object[maxSize];
		nElems = 0;
	}
	
	public Bag(Class<E> clazz, int maxSize) {
		arr = (E[]) Array.newInstance(clazz, maxSize);   
	}

	public E[] search(Class<E> claz, E value) {
		E[] temp = (E[])Array.newInstance(claz, nElems);
		int count = 0;
		for (int i = 0; i< nElems; i++) {
			if (arr[i].equals(value)) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public void insert(E value) {
		arr[nElems++] = value;
		
	}
	
	public void display() {
		for (int i = 0; i< nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
