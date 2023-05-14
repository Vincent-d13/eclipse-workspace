package Model;

import java.util.TreeMap;

public class applicantMapStorage {
	
	private TreeMap<String, Applicant> theMap;

	public applicantMapStorage () {
		theMap = new TreeMap<String, Applicant>();
	}
	
	public void insert(String userName, Applicant app) {
		theMap.put(userName, app);
	}
	
	
	public boolean searchByUserNameAndPassword(String userName, String passWord) {
		if (theMap.containsKey(userName) && theMap.get(userName).getPassWord().equals(passWord)) {
			return true;
		}
		return false;
	}
	
	public Applicant getValue(String userName) {
		return theMap.get(userName);
	}
	
	public void display() {
		theMap.forEach((key, value) -> System.out.println(key + " " + value));
	}

}



