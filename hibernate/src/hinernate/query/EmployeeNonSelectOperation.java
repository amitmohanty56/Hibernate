package hinernate.query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeNonSelectOperation {

	public static void main(String[] args) {
		
		Configuration configure = new Configuration().configure();
		
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tranx = session.beginTransaction();
		//Create new employee to Save in DB.
		Employee emp = new Employee();
		//Update the existing record.
		//Employee emp = (Employee) session.get(Employee.class, 5);
		//Use this PK/ID based on the PK generator tag.
		//emp.setId(5);
		emp.setFirstName("Ajinkya");
		emp.setLastName("Rahane");
		emp.setPhoneNumber(2345643);
		emp.setCountry("Ind");
		
		session.save(emp);
		tranx.commit();
		//session.close();

	}

}
