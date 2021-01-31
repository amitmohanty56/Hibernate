package hibernate.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hinernate.query.ConfigurationUtility;
import hinernate.query.Employee;

public class HQLSelect {

	public static void main(String[] args) {
		Session session = ConfigurationUtility.getSession();
		//Transaction tranx = session.beginTransaction();
		System.out.println("Got the session object");
		String hqlQuery = "from Employee";
		Query query = session.createQuery(hqlQuery);
		
		//1st Approach
//		System.out.println("Get all the row Using list() method");
//		List<Employee> listOfEmployee = query.list();
//		
//		for(Employee emp : listOfEmployee) {
//			System.out.println(emp);
//		}
		
		//2nd Approach
		System.out.println("Get all the row Using Iterae() method");
		Iterator<Employee> iterate = query.iterate();
		
		while(iterate.hasNext()) {
			Employee emp = iterate.next();
			System.out.println(emp);
		}
		

	}

}
