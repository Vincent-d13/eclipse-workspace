package Model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Utilities {
	
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
	
	public static String fileToString(String fileName) {
		StringBuilder build = new StringBuilder();
		try(Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8	)) {
			stream.forEach(s -> build.append(s).append("\n"));
		} catch(IOException e) {
			
		}
		return build.toString();
	}
	
	public static void writeToFile(String fileName, String s) {
		Path file = Path.of(fileName);
		try {
			Files.writeString(file, s);
		} catch(IOException e) {
			
		}
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


