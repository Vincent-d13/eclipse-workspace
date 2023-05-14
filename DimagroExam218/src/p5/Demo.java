package p5;

public class Demo {

	public static void main(String[] args) {

		wordList list = new wordList();
		String word = Utilities.fileToString("words.txt/words.txt");
		String[] arr = word.split("\\s+");

		list.add(arr);

		list.display();

	}
}
