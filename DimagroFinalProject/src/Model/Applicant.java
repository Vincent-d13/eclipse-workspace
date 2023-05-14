package Model;

import java.io.Serializable;

import Boot.Main;

public class Applicant implements Comparable<Applicant>, Serializable {

	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String phoneNumber;
	private String address;
	private double gpa;
	private int SATScore;
	private double familyIncome;
	private String id;
	private String essay;
	private double aiScore;


	public static int idCount = 0;

	public Applicant(String firstName, String lastName, String userName, String password, String phoneNumber,
			String address, double gpa, int SATScore, double familyIncome, String essay, double aiScore) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gpa = gpa;
		this.SATScore = SATScore;
		this.familyIncome = familyIncome;
		this.id = String.valueOf(idCount++);
		this.essay = essay;
		this.aiScore = aiScore;
	}
	

	public void setAiScore(double aiScore) {
		this.aiScore = aiScore;
	}

	public void setEssay(String essay) {
		this.essay = essay;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getSATScore() {
		return SATScore;
	}

	public void setSATScore(int sATScore) {
		SATScore = sATScore;
	}

	public double getFamilyIncome() {
		return familyIncome;
	}

	public void setFamilyIncome(double familyIncome) {
		this.familyIncome = familyIncome;
	}

	public String getEssay() {
		return essay;
	}

	@Override
	public String toString() {
		return "Applicant [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password="
				+ password + ", phoneNumber=" + phoneNumber + ", address=" + address + ", gpa=" + gpa + ", SATScore="
				+ SATScore + ", familyIncome=" + familyIncome + ", id=" + id + ", essay=" + essay + "]";
	}

	public double getAi() {
		aiScore = Main.ai.getAi();

		System.out.println(aiScore + "deez");
		return aiScore;

	}

	public int compareTo(Applicant o) {

		System.out.println("comapre to called");
		return -Double.compare(this.aiScore, o.aiScore);

	}

}
