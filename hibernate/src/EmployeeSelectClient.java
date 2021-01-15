

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeSelectClient {

	public static void main(String[] args) {
		System.out.println("Hibernate Employee Select Client");

		Configuration config = new Configuration();
		Configuration cf = config.configure();
		
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		
		//Transaction transaction = session.beginTransaction(); 
		System.out.println("Session obj is " + session.toString());
		Employee emp = (Employee) session.get(Employee.class, 1);
		System.out.println("Emp obj is " +emp);
		
	}

}
