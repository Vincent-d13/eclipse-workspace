package p6;

import java.util.Objects;

public class Name implements Comparable<Name>{
	
	private String firstName;
	private String lastName;
	
	
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	@Override
	public int compareTo(Name o) {
		return this.lastName.compareTo(o.lastName);
	}
	@Override
	public int hashCode() {
		return Objects.hash(lastName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(lastName, other.lastName);
	}
	
	

	
	
	
	
	
	
	

}
