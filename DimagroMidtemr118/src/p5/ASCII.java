package p5;

public class ASCII {

	public static void main(String[] args) {


		
		char char1 = rndChar();
		int charACSII = char1 - 0 ;
		
		int char2 = char1 - 1;	
		char ascii = (char) char2;
		
		System.out.println(char1 + " ascii = " + charACSII);
		System.out.println("The letter before is " + ascii);
		
		if (Character.isLetter(ascii)) {
			System.out.println("it is a letter");
		} else 
			System.out.println("the character is not a letter");
	}
	private static char rndChar () {
	    int rnd = (int) (Math.random() * 52); 
	    char base = (rnd < 26) ? 'A' : 'a';
	    return (char) (base + rnd % 26);

	}

}
