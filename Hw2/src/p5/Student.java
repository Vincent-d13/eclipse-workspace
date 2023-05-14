package p5;


public class Student implements Comparable<Student>{

	private String name;
	private String phoneNumber;
	private String major;
	private String id;
	private double gpa;
	
	public static int idCount = 0;
	
	public Student(String name, String phoneNumber, String major, double gpa) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.id = String.valueOf(idCount++);
		this.gpa = gpa;
	}
	
	public double getGpa() {
		
		return gpa;
		
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
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
		return "Student [name=" + name + ", phoneNumber=" + phoneNumber + ", major=" + major + ", id=" + id + ", gpa="
				+ gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
	
			//return -Integer.compare(this.age, o.age);
			return -Double.compare(this.gpa, o.gpa);
		}
	}
	
	

