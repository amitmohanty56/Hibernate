package hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.bean.Address;
import hibernate.bean.Student;
import hinernate.query.ConfigurationUtility;

public class ComponentMappingClient {

	public static void main(String[] args) {
		
		Session session = ConfigurationUtility.getSession();
		Transaction tranx = session.beginTransaction();
		
		Address address = new Address();
		address.setCity("Jurong");
		address.setState("Sg");
		address.setStreet("21");
		address.setZipcode("600218");
		Student student = new Student();
		student.setId(1);
		student.setName("Amit");
		student.setAddress(address);
		
		session.save(student);
		tranx.commit();
		
		
	}

}
