package p4_Student_Comparable;

import p2_Bag_Class.Bag;
import p3_Student.Student;

public class Demo {

	public static void main(String[] args) {

		Bag sBag = new Bag();
		
		Student s1 = new Student("Colleen", 4.0);
		Student s2 = new Student("Vincent", 3.5);
		Student s3 = new Student ("John Doe", 2.0);
		
		sBag.insert(s3);
		sBag.insert(s2);
		sBag.insert(s1);
		
		
		
		
	}

}
