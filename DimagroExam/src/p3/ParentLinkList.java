package p3;
import java.util.LinkedList;

public class ParentLinkList {
	
	private LinkedList<BabyLinkList> parentLink;
	private int nElems;
	
	public ParentLinkList() {
		super();
		this.parentLink = new LinkedList<BabyLinkList>();
	}

	public LinkedList<BabyLinkList> getParentLink() {
		return parentLink;
	}

	public void setParentLink(LinkedList<BabyLinkList> parentLink) {
		this.parentLink = parentLink;
	}
	
	public String wordGenerator(String keyWord, int num) {
		String input = "" + keyWord;
		String temp = keyWord;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j<parentLink.size(); j++) {
				if (parentLink.get(j).getBabyLink().get(0).equals(temp)) {
					int randWord = (int)(Math.random() * parentLink.get(j).getBabyLink().size());
					temp = parentLink.get(j).getBabyLink().get(randWord);
					parentLink.get(j).getBabyLink().remove(randWord);
					input += " " + temp;
					
				}
			}
		}
		return input;
	}
	
	public void connectList(String[] word) {
		for (int i = 0; i< word.length; i++) {
			String words = word[i];
			boolean b1 = false;
			
			for (int j = 0; j < parentLink.size(); j++) { 
				if (parentLink.get(j).getBabyLink().get(0).equals(words)) {
					b1 = true;
					if(i+1 < word.length) {
						parentLink.get(j).getBabyLink().add(word[i+1]);
					}
				}
			}
			if (b1 == false) {
				parentLink.add(new BabyLinkList());
				parentLink.get(nElems).getBabyLink().add(words);
				if( i + 1 < word.length) {
					parentLink.get(nElems).getBabyLink().add(word[i+1]);
				}
				nElems++;
			}
		}
	}

}
