package p2;

public class Demo {
	private static int count = 0;
	
	public static void main(String[] args) {
		show(count);
	}

	public static void show(int c ) {
		if ( c == 5) { //base case
			return;
		}
		System.out.println("Hi");
		c++;
		show(c);
				
	}
}
