import java.util.LinkedList;

public class BabyLinkList {

	private LinkedList<String> babyLink;
	
	
	public BabyLinkList() {
		super();
		this.babyLink = new LinkedList<String>();
	}
	
	public void setBabyLink(LinkedList<String> babyLink) {
		this.babyLink = babyLink;
		
	}
	
	public LinkedList<String> getBabyLink(){
		return babyLink;
	}

	@Override
	public String toString() {
		return "BabyLinkList [babyLink=" + babyLink + "]";
	}
	
}
