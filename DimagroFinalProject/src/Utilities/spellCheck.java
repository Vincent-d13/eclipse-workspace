package Utilities;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class spellCheck {
	
	
	public static int countSyllables(String word) {
		int num = 0;
		String pattern = "[AEIOUYaeiouy]+";
		Pattern tokenSplitter = Pattern.compile(pattern);
		Matcher m = tokenSplitter.matcher(word);

		String lastToken = "";
		while (m.find()) {
			num++;
			lastToken = m.group();
		}
		if (lastToken.equals("e") && num > 1 && word.charAt(word.length() - 1) == 'e') {
			num--;
		}
		return num;
	}

	public static int countSentences(String str) {
		int num = 0;
		String pattern = "[^.?!]+";
		Pattern tokenSplitter = Pattern.compile(pattern);
		Matcher m = tokenSplitter.matcher(str);
		while (m.find()) {
			num++;
		}
		return num;
	}

	public static int countWords(String str) {
		int num = 0;

		String pattern = "[A-Za-z]+";
		Pattern tokenSplitter = Pattern.compile(pattern);
		Matcher m = tokenSplitter.matcher(str);

		while (m.find()) {
			num++;
		}
		return num;

	}

	private static final DecimalFormat df = new DecimalFormat("0.0");
	
	public static double fleschScore(String sentances) {
		
		double totalSentances = countSentences(sentances);
		double totalWords = countWords(sentances);
		double totalSyyl = countSyllables(sentances);
		
		double score =  206.835 - 1.015 * (totalWords / totalSentances) - 84.6 * (totalSyyl / totalWords);
		if (score >= 100.00) {
			 return score = 100;
		} else if (score < 0) {
			return score = 100;
		}
		System.out.println(score + "F Score");
		return Double.valueOf(df.format(score));

}
}
