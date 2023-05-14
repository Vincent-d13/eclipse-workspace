package p4;

public class Demo {

	public static void main(String[] args) {
		
		NumberBag<Number> bag = new NumberBag(Number.class, 10);

	Double d = new Double ("20.5");
	Integer e = new Integer ("10");
	Float f = new Float ("500.1f");
	Short s = new Short ("35");
	Byte b = new Byte ("3");
	
	NumberBag<Short> sBag = new NumberBag(Number.class, 5);
//	sBag.insert(s);
//	System.out.println(sBag.search((short) 35));
	
	//System.out.println(b);
	
		bag.insert(d);
		bag.insert(e);
		bag.insert(f);
		bag.insert(s);
		bag.insert(b);
		
	
	
		
		System.out.println("Searching bag: " + bag.search((short) 35));
		
		bag.display();
		
		System.out.println("_______");
		
		System.out.println("Removing from bag: " + bag.delete((double) 20.5));
		
		bag.display();
	}

}
