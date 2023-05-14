package p3_Comparator3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		File file = new File("Test.txt");
		try {
			Scanner sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		//checked exception 
		
		Student s1 = new Student("M", 20, 4.0);
		Student s2 = new Student("A", 25, 2.0);
		Student s3 = new Student("X", 18, 3.0);
		
		Student [] arr = {s1, s2 ,s3};
		Arrays.sort(arr, new Demo().new MyComparator()); //unchecked
		System.out.println(Arrays.toString(arr));
		
	
		
	}
	
	private class MyComparator implements Comparator<Student> { //private inner class

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}

}
