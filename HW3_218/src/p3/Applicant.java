package p3;

public class Applicant {
	
	private String firstName;
	public String lastName;
	private String phoneNumber;
	
	public Applicant(String firstName, String lastName, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return " Applicant firstName = " + firstName + ", lastName = " + lastName + ", phoneNumber = " + phoneNumber + "";
	}

	
	
	
	

}
