package Model;

import java.text.DecimalFormat;

import Boot.Main;
import View.signUpView;

public class decider {
	
	private int Ai = 0;
	
	public decider() {
		this.Ai = Ai;
		
	}
	
	private static final DecimalFormat df = new DecimalFormat("0.0");
	private static final DecimalFormat df2 = new DecimalFormat("0.0");
	
	public double getAiGpa() {
		Applicant app = Main.appMap.getValue(signUpView.userName());
		double gpa = app.getGpa();
		double aiGpaScore = 0.0;
		
		double pointOne = gpa / .1;
		aiGpaScore = pointOne * 2;

//		System.out.println(aiGpaScore + "GPa");
		return aiGpaScore;
	}
	
	public double getFeschScore() {
		Applicant app = Main.appMap.getValue(signUpView.userName());
		double essayScore = Utilities.fleschScore(app.getEssay());
		double AiFleschScore = 0.0	;
		
		double tenPoints = essayScore / 10;
		AiFleschScore = tenPoints * -1;


//		System.out.println(AiFleschScore + " flesch");
		return Double.valueOf(df.format(AiFleschScore));
	}
	
	public double getTypos() {
		Applicant app = Main.appMap.getValue(signUpView.userName());
		int typos = Main.dic.numOfTypos();
		double AiTypoScore = 0.0;
		
		double num = typos / 100;
		
//		System.out.println(num + "typos");
		return num;
	}
	
	public double getIncome() {
		Applicant app = Main.appMap.getValue(signUpView.userName());
		double income = app.getIncome();
		double aiIncome = 0.0;
		
		aiIncome = income / 10000;
		
//		System.out.println(aiIncome + "income");
		return aiIncome;
	}
	
	public double getAi() {
		double ai = 0.0;
		
		Applicant app = Main.appMap.getValue(signUpView.userName());
		ai = getAiGpa() + getFeschScore() + getTypos() + getIncome();
		app.setAiScore(ai);
		
//		System.out.println(ai);
		
		return Double.valueOf(df2.format(ai));
		
	}
	

}
