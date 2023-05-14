package p1;

public class Demo {

	public static void main(String[] args) {

		Student s1 = new Student ("Vincent", 3.0, "Math");
		Student s3 = new Student ("John Doe", 4.0, "English");
		Student s2 = new Student ("Josh", 2.0, "Science");
		Student s4 = new Student ("Joe", 3.5, "History");
		Student s5 = new Student ("Mike", 3.0, "Fashion");
		Student s6 = new Student ("Travis", 2.0, "Marines");
		
		waitingList arr = new waitingList (10);
		arr.insert(s1);
		arr.insert(s2);
		arr.insert(s3);
		arr.insert(s4);
		arr.insert(s5);
		arr.insert(s6);
		//System.out.println(arr.toString());
		
		
	}

}
