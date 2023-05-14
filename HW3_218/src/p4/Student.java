package p4;

public class Student implements Comparable<Student>{

	private String firstName;
	private String lastName;
	private double gpa;

	public Student(String firstName, String lastName, double gpa) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(this.gpa, o.gpa);
	}

	
}
