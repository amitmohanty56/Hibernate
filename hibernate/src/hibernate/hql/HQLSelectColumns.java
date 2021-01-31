package hibernate.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hinernate.query.ConfigurationUtility;

public class HQLSelectColumns {

	public static void main(String[] args) {
		Session session = ConfigurationUtility.getSession();
		String hqlQuery = "select e.firstName,e.lastName from Employee e";
		Query query = session.createQuery(hqlQuery);
		
//		List<Object[]> listOfEmployee = query.list();
//		
//		for(Object[] obj : listOfEmployee) {
//			System.out.println(obj[0]+", "+obj[1]);
//		}
		
		//Here iterate() won't perform lazy loading. It will perform early loading.
		Iterator<Object[]> employeeObjects = query.iterate();
		while(employeeObjects.hasNext()) {
			Object[] obj = employeeObjects.next();
			Object firstName = obj[0];
			Object lastName = obj[1];
			
			System.out.println("FistName :"+firstName+" LastName : "+lastName );
		}
		
	}

}
