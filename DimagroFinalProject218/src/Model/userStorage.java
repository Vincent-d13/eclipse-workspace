package Model;

import java.io.Serializable;
import java.util.TreeMap;

public class userStorage implements Serializable{
	
	private TreeMap<String, User> theMap;
	
	public userStorage () {
		theMap = new TreeMap<String, User>();
	}
	
	public void insert(String userName, User app) {
		theMap.put(userName, app);
	}
	
	
	public boolean searchByUserNameAndPassword(String userName, String passWord) {
		if (theMap.containsKey(userName) && theMap.get(userName).getPassWord().equals(passWord)) {
			return true;
		}
		return false;
	}
	
	public User getValue(String userName) {
		
		return theMap.get(userName);
	}
	
	public boolean checkIfItContains(String userName) {
		return theMap.containsKey(userName);
	}
	
	public void display() {
		theMap.forEach((key, value) -> System.out.println(key + " " + value));
	}

}
