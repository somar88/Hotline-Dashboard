package sa.application.person;

public class Person {

	private String D_Number;
	private String first_name;
	private String last_name;

	public Person(String name, String lastName, String d_Number) {
		this.first_name = name;
		this.last_name = lastName;
		this.D_Number = d_Number;
	}

	public String getD_Number() {
		return D_Number;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}
	
	
}
