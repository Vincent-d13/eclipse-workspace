package p5;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		GBag bag = new GBag (10);
		
		String s1 = "Hello world";
		String s2 = "Hello world";
		int x1 = 10;
		int x2 = 10;
		
		bag.insert(s1);
		bag.insert(x1);
		bag.insert(s2);
		bag.insert(x2);
		
		bag.display();
		
		Object[] o1 = bag.search((t) -> {
			return t.equals("Hello world");
		});
		
		Object[] o2 = bag.delete((t)-> {
			return t.equals(10);
		});
		
		System.out.println(Arrays.toString(o2));
		
		System.out.println("-------------");
		
		bag.display();
		
	}

}
