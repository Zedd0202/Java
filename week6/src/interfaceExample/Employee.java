package interfaceExample;

import lectureSource.Payable;

public abstract class Employee implements Payable {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	// three-argument constructor
	public Employee(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	} // end three-argument Employee constructor

	// set first name
	public void setFirstName(String first) {
		firstName = first; // should validate
	} // end method setFirstName

	// return first name
	public String getFirstName() {
		return firstName;
	} // end method getFirstName

	public void setLastName(String last) {
		lastName = last; // should validate
	} // end method setLastName

	public String getLastName() {
		return lastName;
	} // end method getLastName

	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn; // should validate
	} // end method setSocialSecurityNumber

	// return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	} // end method getSocialSecurityNumber

	// return String representation of Employee object
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s",
				getFirstName(), getLastName(), getSocialSecurityNumber());
	} // end method toString

} // end abstract class Employee
