package p6_objects_comparison;

public class Demo {

	public static void main(String[] args) {

		Student s1 = new Student("Joe", 20, 3.5);
		Student s2 = new Student ("Joey", 22, 3.5);
		Student s3 = s1;
		
		System.out.println(s1 == s2); // memory address 
		System.out.println(s1.equals(s2)); // content 
	}

}
