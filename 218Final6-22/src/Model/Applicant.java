package Model;

public class Applicant implements Comparable<Applicant>{

	private String firstName;
	private String lastName;
	private double gpa;
	private double Income;
	private String essay;
	private double AiScore;
	private String id;
	private String userName;
	private String passWord;

	public static int idCount = 0;

	public Applicant(String firstName, String lastName, double gpa, double income, String essay, double AiScore,
			String userName, String passWord) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		Income = income;
		this.essay = essay;
		this.AiScore = AiScore;
		this.userName = userName;
		this.passWord = passWord;
		this.id = String.valueOf(idCount++);
	}

	public Applicant() {

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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double getIncome() {
		return Income;
	}

	public void setIncome(double income) {
		Income = income;
	}

	public String getEssay() {
		return essay;
	}

	public void setEssay(String essay) {
		this.essay = essay;
	}

	public double getAiScore() {
		return AiScore;
	}

	public void setAiScore(double aiScore) {
		AiScore = aiScore;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Applicant [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + ", Income=" + Income
				+ ", essay=" + essay + ", AiScore=" + AiScore + ", id=" + id + ", userName=" + userName + ", passWord="
				+ passWord + "]";
	}

	@Override
	public int compareTo(Applicant o) {
		return -Double.compare(this.AiScore, o.AiScore);
	}

}
