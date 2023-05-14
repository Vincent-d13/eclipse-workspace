package p6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class GBag <E>{
	
	private E[] arr;
	private int nElems;
	
	public GBag(int maxSize) {
		arr = (E[]) new Object[maxSize];
		nElems = 0;
	}
	
	public GBag (Class<E> clazz, int maxSize) {
		arr = (E[]) Array.newInstance(clazz, maxSize);
		nElems = 0;
	}
	
	public void insert (E value) {
		arr[nElems++] = value;
	}
	
	public E[] search(Class<E> clazz, Predicate<E> predicate) {
		int count = 0;
//		E[] tempArr = (E[]) new Object[nElems];
		E[] tempArr = (E[]) Array.newInstance(clazz, nElems);
		for (int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[count++] = arr[i];
				
			}
		}
		return Arrays.copyOf(tempArr, count);
	}
	
	public E[] delete (Class<E> clazz, Predicate<E> predicate ) {
		int count = 0;
		E[] tempArr = (E[]) Array.newInstance(clazz, nElems);
	//	E[] tempArr = (E[]) new Object[nElems];
		for (int i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				tempArr[count++] = arr[i];
				E value = arr[i];
				for (int j = i; j < nElems - 1; j++) {
					arr[j] = arr[j+1];
				}
				nElems--;
			}
		}
		return Arrays.copyOf(tempArr, count);
	}
	
	
	public void display() {
		for (int i = 0; i< nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	

}
