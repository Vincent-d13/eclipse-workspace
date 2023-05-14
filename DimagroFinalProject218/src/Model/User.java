package Model;

import java.io.Serializable;
import java.util.TreeMap;

public class User implements Serializable{

	private String userName;
	private String passWord;
	private int followers;
	public  int postCount ;
	private boolean followPressed;
	private userStorage followMap;
	private userLinkList messageList;
	private userLinkList followingMessages;
	private userLinkList followUsername;

	/*
	 * private int followers private int posts private int following
	 */

	public User(String userName, String passWord, int followers ,int postCount, boolean followPressed) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.followers = followers;
		this.postCount = postCount;
		this.followPressed = followPressed;
		followMap = new userStorage();
		messageList = new userLinkList();
		followingMessages = new userLinkList();
		followUsername = new userLinkList();
	}

	

	public userLinkList getFollowUsername() {
		return followUsername;
	}



	public void setFollowUsername(userLinkList followMessages) {
		this.followUsername = followMessages;
	}



	public userLinkList getFollowingMessages() {
		return followingMessages;
	}

	public void setFollowingMessages(userLinkList followingMessages) {
		this.followingMessages = followingMessages;
	}

	public userLinkList getMessageList() {
		return messageList;
	}

	public void setMessageList(userLinkList followList) {
		this.messageList = followList;
	}


	public userStorage getFollowMap() {
		return followMap;
	}



	public void setFollowMap(userStorage followMap) {
		this.followMap = followMap;
	}



	public boolean isFollowPressed() {
		return followPressed;
	}

	public void setFollowPressed(boolean followPressed) {
		this.followPressed = followPressed;
	}

	public int addPosts() {
		return postCount++;
	}

	public int getPosts() {
		return postCount;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}
	
	public int addFollowers() {
		return followers++;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + "]";
	}

	//u1.getmessages
}
