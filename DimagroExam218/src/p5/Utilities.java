package p5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Utilities {

	public static String[] convertText2Array(String str) {
		File file = new File(str);
		Scanner sc;
		try {
			sc = new Scanner(file);
			String lyrics = sc.nextLine();
			String[] arr = lyrics.split(" ");
			return arr;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static String fileToString(String fileName) {
		StringBuilder build = new StringBuilder();
		try (Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)) {
			stream.forEach(s -> build.append(s).append("\n"));
		} catch (IOException e) {

		}
		return build.toString();
	}
}
