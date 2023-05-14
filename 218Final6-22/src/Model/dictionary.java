package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Boot.Main;
import View.signUpView;

public class dictionary {
	
	private HashSet<String> map;
	
	public dictionary() {
		
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
	
	public int numOfTypos() {
		Applicant app = Main.appMap.getValue(signUpView.userName());
		String essay = app.getEssay().toLowerCase();
		int count = 0;

		String pattern = "[A-Za-z]+";
		Pattern tokenSplitter = Pattern.compile(pattern);
		Matcher m = tokenSplitter.matcher(essay);

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
