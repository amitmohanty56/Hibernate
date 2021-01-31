package hibernate.bean;

public class Student {
	private long Id;
	private String name;
	private Address address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
