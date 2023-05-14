package p4;

import java.lang.reflect.Array;

public class NumberBag  <T extends Number>{
	
	private T[] arr;
	private int nElems;
	

	public NumberBag(Class<T> clazz, int maxSize) {
		arr = (T[]) Array.newInstance(clazz, maxSize);
		nElems = 0;
	}
	
	public void insert(T value) {
		arr[nElems++] = value;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public T search (T value) {
	
		for (int i = 0; i< nElems; i++) {
			if (arr[i].equals(value) || arr[i] == value){
				return arr[i];
			}
		}
		System.out.println("Number not found");
		return null;
	}
	
	public T delete (T value) {
		int i;
		for ( i = 0; i < nElems; i++) {
			if (arr[i].equals(value) || arr[i] == value) {
				break;
			}
		}
		if (i == nElems) {
			System.out.println("No match found");
			return null;
		} else {
			T temp = arr[i];
			for (int j = i; j < nElems-1; j++) {
				arr[j] = arr[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
}
