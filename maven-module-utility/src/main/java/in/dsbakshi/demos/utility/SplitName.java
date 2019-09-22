package in.dsbakshi.demos.utility;

public class SplitName {

	private final String firstName;

	private final String middleName;

	private final String lastName;

	public SplitName(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

}
