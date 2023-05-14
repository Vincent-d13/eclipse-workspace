package p7;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Demo7 {

	public static void main(String[] args) {

		double x  = .234567;
		
		DecimalFormat df = new DecimalFormat("000.00");
		df.setRoundingMode(RoundingMode.DOWN);
		x = x * 100 ;
		
		System.out.println(Double.valueOf(df.format(x)));
	}

}
