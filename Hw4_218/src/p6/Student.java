package p6;

public class Student {
	
	private String name;
	private String id;
	private double gpa;
	
	private static int idCount = 0;
	
	public Student (String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
		this.id = String.valueOf(idCount++);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
	}
	
	

}
