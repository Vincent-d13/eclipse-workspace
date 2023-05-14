package Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Launch.Main;
import Model.User;
import View.homeHubView;
import View.loginView;

public class dictionaryHashSet implements Serializable{

	private HashSet<String> map;

	public dictionaryHashSet() {

		map = new HashSet<String>();

		Scanner in;
		try {
			in = new Scanner(new File("dictionary/dictionary.txt"));
			while (in.hasNextLine()) {
				String line = in.nextLine();
				map.add(line);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public  int numOfTypos() {
		User app = Main.userMap.getValue(loginView.getUserName());
		String post = homeHubView.spellCheck.toLowerCase();
		int count = 0;

		String pattern = "[A-Za-z]+";
		Pattern tokenSplitter = Pattern.compile(pattern);
		Matcher m = tokenSplitter.matcher(post);

		while (m.find()) {
			System.out.println(m.group());
			if (!map.contains(m.group())) {
				count++;
				System.out.println("Mispelled word");
			}
		}

		return count;

	}

}
