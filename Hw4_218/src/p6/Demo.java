package p6;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		Student s1 = new Student ("Joe hah", 4.0);
		Student s2 = new Student ("Mike longHang", 3.0);
		Student s3 = new Student ("Sven Eight", 2.5);
		Student s4 = new Student ("kevin money", 4.0);
		Student s5 = new Student ("yomi joeseph", 3.5);
		
		GBag<Student> bag = new GBag<> (Student.class, 10);
		
		bag.insert(s1);
		bag.insert(s2);
		bag.insert(s3);
		bag.insert(s4);
		bag.insert(s5);
		
		Student [] temp = bag.search(Student.class, (t) -> {
			
			return t.getId().equals("1");
				
		});
		
		Student[] delete = bag.delete(Student.class, (t) -> {
			return t.getGpa() < 3;
		});
		
	//	System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(delete));
		
		System.out.println("-------------");
		
		bag.display();
	}

}
