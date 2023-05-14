package p5;

import java.util.LinkedList;

public class wordList {
	
	private LinkedList<String> list;
	
	public wordList() {
		
		list = new LinkedList<String>();
	}
	
	
	
	public void add (String[] word) {
		
		for (int i = 0; i < word.length; i++) {
			String words = word[i].toLowerCase();
			boolean b1 = false;
			
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).equals(words)) {
					b1 = true;
					// dont add words
					
				} 
					
			}
			
			if (b1 == false) {
				list.add(words);
			}
		}
	}
	
	public void display() {
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	

}
