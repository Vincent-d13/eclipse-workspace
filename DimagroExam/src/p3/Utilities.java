package p3;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Utilities {

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
}
