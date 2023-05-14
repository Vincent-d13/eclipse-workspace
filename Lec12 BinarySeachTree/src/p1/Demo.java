package p1;

public class Demo {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.insert(50, 50.5);
		tree.insert(25, 25.25);
		tree.insert(75, 75.75);
		tree.insert(12, 12.12);
		tree.insert(35, 35.35);
		tree.insert(65, 65.65);
		
		System.out.println(tree.delete(35));
		tree.find(12).displayNode();
	}

}
