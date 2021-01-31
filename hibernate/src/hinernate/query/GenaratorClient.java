package hinernate.query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GenaratorClient {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tranx = session.beginTransaction();
		
		Employee emp = new Employee();
		//We are not setting PK because we are using generator algorithm to generate PK value.
		//emp.setId(9);
		emp.setFirstName("Jas");
		emp.setLastName("Boomrah");
		emp.setPhoneNumber(8623567);
		emp.setCountry("ind");
		
		session.save(emp);
		
		tranx.commit();
		

	}

}
