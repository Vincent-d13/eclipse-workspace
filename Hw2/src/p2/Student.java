package p2;

public class Student {

	private String name;
	private String phoneNumber;
	private String major;
	private String id;
	
	public static int idCount = 0;
	
	public Student(String name, String phoneNumber, String major) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.id = String.valueOf(idCount++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phoneNumber=" + phoneNumber + ", major=" + major + ", id=" + id + "]";
	}
	
	
}
