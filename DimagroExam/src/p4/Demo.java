package p4;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		Student s1 = new Student ("Vincent" , 4.0);
		Student s2 = new Student ("Joe", 1.0);
		Student s3 = new Student ("John Doe", 3.5);
		
		Bag newBag = new Bag(Student.class, 10);
		newBag.insert(s1);
		//newBag.display();
		newBag.insert(s2);
		newBag.insert(s3);
		
	
	Object[] b = newBag.search(Student.class, n -> ((Student)n).getGpa() >= 3.5);
	//System.out.println(Arrays.toString(b));
	//b = newBag.delete(Student.class, d -> ((Student)d).getGpa() == 1.0);
	System.out.println(Arrays.toString(b));
	
	
	
	}

}
