package Model;

import java.io.Serializable;
import java.util.TreeSet;

public class applicantTree implements Serializable{

	private TreeSet<Applicant> set;


	public applicantTree() {

		set = new TreeSet<Applicant>();

	}

	public void insert(Applicant app) {
		set.add(app);
		System.out.println("inserted");
	}

	public void display() {
		set.forEach(e -> {
			System.out.println(e);
		});

		
	}

}
