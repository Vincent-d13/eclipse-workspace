package p3_generic_classes;


//upper bound constraint top and below is good nothing above 
public class Point <T extends Number, S extends Number>{

	private T x ;
	private S y;
	
	
	public Point(T x, S y) {
		super();
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public S getY() {
		return y;
	}

	public void setY(S y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public static void display(Point<? super Integer, ? super Integer> point) {
		System.out.println(point);
	}
	
	//super lower bound
	//extends upper bound
}
