package hibernate.nativesql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import hinernate.query.ConfigurationUtility;
import hinernate.query.Employee;

public class NativeSQLClient {

	public static void main(String[] args) {
		Session session = ConfigurationUtility.getSession();
		//String nativeSqlFullRow = "select * from sys.employee";
		//SQLQuery query = session.createSQLQuery(nativeSqlFullRow);
		//query.addEntity(Employee.class); //if return 1 complete row then addEntity() method.
		
		//List<Employee> listOfEmployee = query.list();
		
//		for(Employee emp : listOfEmployee) {
//			System.out.println(emp);
//		}

		
		String nativeSqlLimitedRow = "select firstname from sys.employee";
		SQLQuery query = session.createSQLQuery(nativeSqlLimitedRow);
		query.addScalar("firstname", new StringType());// if return limited column then addScalar() method.
		
		Iterator listOfColumns = query.iterate();//not supported
		

		
		
		while(listOfColumns.hasNext()) {
			Object[] obj =  (Object[]) listOfColumns.next();
			Object id = obj[0];
			//Object lastName = obj[1];
			
			System.out.println("ID :"+id);
		}
	}

}
