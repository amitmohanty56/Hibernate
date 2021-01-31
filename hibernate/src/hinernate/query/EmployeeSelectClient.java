package hinernate.query;


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
		
		Transaction transaction = session.beginTransaction(); 
		//System.out.println("Session obj is " + session.toString());
		Employee emp = (Employee) session.load(Employee.class, new Integer(4));
		System.out.println("Emp obj is " +emp);
		//System.out.println("Is present in session : "+session.contains(emp));
		System.out.println("---------------load the object-----");
		System.out.println(emp.getId());
		transaction.commit();
		session.close();
		
	}

}
