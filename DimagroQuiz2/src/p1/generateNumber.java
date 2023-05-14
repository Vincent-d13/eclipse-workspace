package p1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class generateNumber {

	public static void main(String[] args) {

		double d1 = 1111 + (double) (Math.random() * 8898);

		DecimalFormat df = new DecimalFormat("0000.000");
		df.setRoundingMode(RoundingMode.DOWN);
		 System.out.println(Double.valueOf(df.format(d1)));

	}

}
