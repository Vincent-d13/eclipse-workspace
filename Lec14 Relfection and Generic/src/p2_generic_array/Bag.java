package p2_generic_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class Bag<E> {

	private E[] arr;
	private int nElems;

	public Bag(Class<E> clazz, int maxSize) {
	//	arr = (E[]) (new Object[maxSize]);
		arr = (E[]) Array.newInstance(clazz, maxSize);
		nElems = 0;
	}

	public void insert(E value) {
		arr[nElems++] = value;
	}

	public void display() {

		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public E[] search(Class<E> clazz, Predicate<E> predicate) {
		E[] tempArr = (E[]) Array.newInstance(clazz, nElems);
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[count++] = arr[i];
				
			}
		}
		return Arrays.copyOf(tempArr, count);
	}
}
