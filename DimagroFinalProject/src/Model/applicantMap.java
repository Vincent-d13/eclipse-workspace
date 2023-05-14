package Model;

import java.io.Serializable;
import java.util.TreeMap;


public class applicantMap implements Serializable{
	
	private TreeMap<String, Applicant> theMap;

	public applicantMap () {
		theMap = new TreeMap<String, Applicant>();
	}
	
	public void insert(String userName, Applicant app) {
		theMap.put(userName, app);
	}
	
	
	public boolean searchByUserNameAndPassword(String userName, String passWord) {
		if (theMap.containsKey(userName) && theMap.get(userName).getPassword().equals(passWord)) {
			return true;
		}
		return false;
	}
	
	public Applicant getValue(String userName) {
		return theMap.get(userName);
	}

}

	
