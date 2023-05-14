package p4;

public class Student {
	
	private String name;
	private String id;
	private double gpa;
	
	private static int idCount = 0;
	
	public Student (String name, double gpa) {
		this.name = name;
		this.id = String.valueOf(++idCount);
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
	}
	
	
	

}
