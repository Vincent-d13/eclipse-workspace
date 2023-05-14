package p4;

import java.util.Random;

public class generateHex {

	public static void main(String[] args) {

		 // Random instance
        Random r = new Random();
        int n = r.nextInt();
        
        String Hexadecimal = Integer.toHexString(n);
        StringBuilder sb = new StringBuilder(Hexadecimal);
        
        System.out.println("0x" + Hexadecimal);
        
	}

}
