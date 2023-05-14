package Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;

import Boot.Main;
import Model.Applicant;
import View.loginView;

public class criteria {

	private int Ai = 0;

	public criteria() {
		this.Ai = Ai;

	}

	public double getAiGpaScore() {
		Applicant app = Main.appMap.getValue(loginView.getUserName());
		double gpa = app.getGpa();
		double AiGpaScore = 0.0;

		double pointOne = gpa / .1;
		AiGpaScore = pointOne * 2;

//		System.out.println(AiGpaScore + " gpa score");
		return AiGpaScore;

	}

	public double getFlecshScore() {
		Applicant app = Main.appMap.getValue(loginView.getUserName());
		double essayScore = spellCheck.fleschScore(app.getEssay());
		double AiFlecshScore = 0.0;

		double tenPoints = essayScore / 10;
		AiFlecshScore = tenPoints * -1;

//		System.out.println(AiFlecshScore + " flecshScore");

		return Double.valueOf(df.format(AiFlecshScore));
	}

	public double getTypos() {
		Applicant app = Main.appMap.getValue(loginView.getUserName());
		int typos = Main.dic.numOfTypos();
		double AiTypoScore = 0.0;

		double num = typos / 100;

//		System.out.println(typos + " typos");
		return num;

	}

	public double getFamilyIncomeScore() {
		Applicant app = Main.appMap.getValue(loginView.getUserName());
		double famIncome = app.getFamilyIncome();
		double AiFamIncomeScore = 0.0;

		AiFamIncomeScore = famIncome / 10000;

//		System.out.println(AiFamIncomeScore + " fam income");
		return AiFamIncomeScore;

	}

	public double getSATScore() {
		Applicant app = Main.appMap.getValue(loginView.getUserName());
		int SAT = app.getSATScore();
		int AiSATScore = 0;

		AiSATScore = SAT / 100;

//		System.out.println(AiSATScore + " SAT SCORE");

		return AiSATScore;

	}

	private static final DecimalFormat df = new DecimalFormat("0.0");
	private static final DecimalFormat df2 = new DecimalFormat("0.0");

	public double getAi() {
		double ai = 0.0;
		Applicant app = Main.appMap.getValue(loginView.getUserName());
		ai = getFlecshScore() + getAiGpaScore() + getFamilyIncomeScore() + getSATScore() + getTypos();
		app.setAiScore(ai);
		System.out.println(ai + " complete score");

		return Double.valueOf(df.format(ai));
	}

	public File returnDecision(Applicant app) {
		File appFile = null;
		try {
			String name = "decisions/" + app.getFirstName() + "." + app.getLastName() + ".decision" + ".txt";
			appFile = new File(name);
			if (appFile.createNewFile()) {
				System.out.println("File created: " + appFile.getName());
				writeToFile(name, decider(app));
				return appFile;
			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return appFile;

	}

	public String decider(Applicant app) {
		String msg = "";
		if (app.getGpa() >= 3.5 && spellCheck.fleschScore(app.getEssay()) < 60 && Main.dic.numOfTypos() < 3
				&& app.getFamilyIncome() >= 100000 && app.getSATScore() >= 1200) {
			msg = "You've been admitted into this college" + System.lineSeparator()
					+ "You're AI score was beyond satisfactory " + Main.ai.getAi() + System.lineSeparator()
					+ "You've been graded based on your Gpa score " + Main.ai.getAiGpaScore() + System.lineSeparator()
					+ "You've been graded based on your Fletch score " + spellCheck.fleschScore(app.getEssay())
					+ System.lineSeparator() + "You've been graded based on typos in your essay which were "
					+ Main.dic.numOfTypos() + System.lineSeparator()
					+ "You've been graded on family income " + Main.ai.getFamilyIncomeScore() + System.lineSeparator()
					+ "You're SAT score was " + Main.ai.getSATScore();

		} else if (app.getGpa() < 2.5 && spellCheck.fleschScore(app.getEssay()) > 70 && Main.dic.numOfTypos() > 10
				&& app.getFamilyIncome() < 10000 && app.getSATScore() < 800) {
			msg = "You've been denied admissions to this college" + System.lineSeparator()
					+ "You're AI score wasnt satisfactory " + Main.ai.getAi() + System.lineSeparator()
					+ "You've been graded based on your Gpa score " + Main.ai.getAiGpaScore() + System.lineSeparator()
					+ "You've been graded based on your Fletch score " + spellCheck.fleschScore(app.getEssay())
					+ System.lineSeparator() + "You've been graded based on typos in your essay which were "
					+ Main.dic.numOfTypos() + System.lineSeparator()
					+ "You've been graded on family income " + Main.ai.getFamilyIncomeScore() + System.lineSeparator()
					+ "You're SAT scorewas " + Main.ai.getSATScore();
		} else {
			msg = "You've been waitlisted." + System.lineSeparator() + "You're AI score wasnt satisfactory "
					+ Main.ai.getAi() + System.lineSeparator() + "You've been graded based on your Gpa score "
					+ Main.ai.getAiGpaScore() + System.lineSeparator()
					+ "You've been graded based on your Fletch score " + spellCheck.fleschScore(app.getEssay())
					+ System.lineSeparator() + "You've been graded based on typos in your essay which were "
					+ Main.dic.numOfTypos() + System.lineSeparator()
					+ "You've been graded on family income " + Main.ai.getFamilyIncomeScore() + System.lineSeparator()
					+ "You're SAT score was " + Main.ai.getSATScore();
			;

			Main.appTree.insert(app);
			// Main.appTree.display();

		}

		return msg;
	}

	public static void writeToFile(String fileName, String s) {
		Path file = Path.of(fileName);
		try {
			Files.writeString(file, s);
		} catch (IOException e) {

		}
	}

	public void setAi(int ai) {
		Ai = ai;
	}

}
