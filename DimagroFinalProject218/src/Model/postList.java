package Model;

import java.io.Serializable;
import java.util.LinkedList;

public class postList implements Serializable{

	private LinkedList<userLinkList> followersMessages;

	public postList() {
		followersMessages = new LinkedList<userLinkList>();
	}

	public LinkedList<userLinkList> getFollowersMessages() {
		return followersMessages;
	}

	public void setFollowersMessages(LinkedList<userLinkList> followersMessages) {
		this.followersMessages = followersMessages;
	}

	public void insert(userLinkList list) {
		followersMessages.add(list);
	}
	
	public userLinkList getUserList(User u1) {
		return u1.getFollowingMessages();
	}

	

}
