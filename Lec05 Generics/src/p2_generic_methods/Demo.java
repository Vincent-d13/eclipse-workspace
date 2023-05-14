package p2_generic_methods;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		Name[] nameArr = {new Name("M", "MM"), new Name("Z", "BB"), new Name ("A", "XX")};
		Student[] studentArr = {new Student("M", 4.0), new Student("Z", 2.0), new Student ("A", 3.0)};
		display(nameArr);
		display(studentArr);
	}

	//overloaded
//	private static void display(Student[] studentArr) {
//		System.out.println(Arrays.toString(studentArr));
//	}
//
//	private static void display(Name[] nameArr) {
//		System.out.println(Arrays.toString(nameArr));
//	
//	}
	
	public static <E> void display(E[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	//for (E e : a) { System.out.println( e + " ")};
	


	//ram -> jvm -> byte code 
	// source code.java -< compiler -> byte code.class .jar
}
