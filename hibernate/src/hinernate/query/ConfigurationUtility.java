package hinernate.query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ConfigurationUtility {
	
	public static Session getSession() {
		Configuration config = new Configuration().configure();
		Session session = config.buildSessionFactory().openSession();
		
		return session;
	}

}
