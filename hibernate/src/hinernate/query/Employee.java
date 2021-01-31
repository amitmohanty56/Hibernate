package hinernate.query;


public class Employee {
	private int id;
	private int version;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String country;
	
	
	public Employee() {
		System.out.println("Employee Default Constructor");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}

	

	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
	

}
