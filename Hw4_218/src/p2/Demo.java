package p2;

public class Demo {

	public static void main(String[] args) {

		GStack stack = new GStack (10);
		
		Name n1 = new Name ("John", "Doe");
		Name n2 = new Name ("John", "Bottom");
		Name n3 = new Name ("Joe", "Shome");
		
		Student s1 = new Student ("Ham Son", 4.0);
		Student s2 = new Student ("Matt Steve", 2.0);
		Student s3 = new Student ("Alex Mcnugget", 4.0);
		
		Student [] arr2 = {s1, s2, s3};
		Name [] arr = {n1, n2, n3};
		
		stack.pushAll(arr);
		stack.pushAll(arr2);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
//		while (!stack.isEmpty()) {
//			System.out.println(stack.popAll());
//		}
//		
		
		
		
		
	}

}
