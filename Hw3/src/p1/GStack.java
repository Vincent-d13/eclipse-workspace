package p1;

import java.util.ArrayList;

public class GStack <T extends Number>{
	
	private ArrayList<T> list;
	
	public GStack () {
		this.list = new ArrayList<>();
	}
	

	public boolean isEmpty() {
		return list.size() == 0;
	}
	
	public void push (T value) {
		list.add(value);
	}
	
	public void show() {
		System.out.println(list);
	}
	
	public T pop() {
		return list.remove(list.size()-1);
	}
	
	public ArrayList<T> popAll(){
		
		ArrayList<T> temp = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			temp.add(list.get(i));
			System.out.println("added");
		}
		if (temp.size() == list.size()) {
			for (int j = 0; j < temp.size(); j++) {
				list.remove(list.size()-1);
				System.out.println("removed");
			}
		}
		return temp;
	}
	
	public void pushAll(ArrayList<T> arr) {
		
		for (int i = 0; i< arr.size(); i++) {
			list.add(arr.get(i));
		}
	}


	@Override
	public String toString() {
		return "GStack [list=" + list + "]";
	}
	
	

}
