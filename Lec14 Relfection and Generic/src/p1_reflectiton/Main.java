package p1_reflectiton;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) { 

		try {
			
			Class c = Class.forName(args[0]); //gets class
			Method[] m = c.getDeclaredMethods(); //get methods acossiated with class
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString());
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		
//		for (int i = 0; i < args.length; i++) {
//			System.out.println("Hello " + args[i]);
//		}
		
	}

}
