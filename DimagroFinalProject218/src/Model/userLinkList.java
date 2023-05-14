package Model;

import java.io.Serializable;
import java.util.LinkedList;

import View.homeHubView;

public class userLinkList implements Serializable{

	private LinkedList<String> list;
	private int count;

	public userLinkList() {
		this.list = new LinkedList<String>();

	}
	
	public void removeFirst() {
		list.remove(0);
	}

	public LinkedList<String> getList() {
		return list;
	}

	public void setList(LinkedList<String> list) {
		this.list = list;
	}

	public void insert(String text) {
		list.add(text);
	}

	public LinkedList<String> returnList() {
		return list;
	}
	
	public boolean willBeEmpty() {
		return list.isEmpty();
	}

	public void printList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " = " + list.get(i));
		}
	}

	public int getSize() {
		return list.size();
	}

	public String getLink(int link) {
		for (int i = 0; i < list.size(); i++) {
			return list.get(link);
		}
		return "0";
	}

	public void getPop() {
		 list.pop();
	}
	
	

}
