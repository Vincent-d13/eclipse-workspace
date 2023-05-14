package p4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class Bag <E> {
	
	private E []  arr;
	private int nElems;
	
	
	@Override
	public String toString() {
		return "Bag [arr=" + Arrays.toString(arr) + "]";
	}

	public Bag(Class<E> clazz, int maxSize) {
		arr = (E[]) new Object[maxSize];   
	}

	public E[] search(Class<E> clazz, Predicate predicate) {
		E[] tempArr = (E[])Array.newInstance(clazz, nElems);
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[count++] = arr[i];
			}
		}
		return Arrays.copyOf(tempArr, count);
	}
	
	public E[] delete(Class<E> claz, Predicate predicate) {
		E[] temp = (E[])Array.newInstance(claz, nElems);
		int count = 0;
		int i;
		for (i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				if (i == nElems) { 
					return null;
				} else { 
					 temp[count++] = arr[i];
					for (int j = i; j < nElems - 1; j++) {
						arr[j] = arr[j + 1];
					}
					
				}
			}
		}
		nElems--;
		return temp;
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
