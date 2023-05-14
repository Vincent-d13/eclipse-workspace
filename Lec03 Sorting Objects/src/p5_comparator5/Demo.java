package p5_comparator5;

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
		Student s4 = new Student("V", 28, 4.0);
		Student s5 = new Student("B", 23, 1.5);
		Student s6 = new Student("Z", 1, 3.2);
		
		Student [] arr = {s1, s2 ,s3, s4, s5, s6};
		
		Arrays.sort(arr,  (Student o1, Student o2) -> {
			return o1.getName().compareTo(o2.getName());
		});

		int studentFound = Arrays.binarySearch(arr, s3);
		System.out.println(arr[studentFound]);
		//log(n) fast
		
		//System.out.println(Arrays.toString(arr));
		
	
		
	}
	


}
