package hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import hinernate.query.ConfigurationUtility;
import hinernate.query.Employee;

public class CriteriaAPIClient {

	public static void main(String[] args) {
		
		Session session = ConfigurationUtility.getSession();
		//Select all the rows and columns from employee table.
		Criteria criteria = session.createCriteria(Employee.class);
		
		//Select rows based on condition. eq means equal. gt means greater than
		
		Criterion criterion = Restrictions.ge("id", 5);
		
		//Adding criterion to criteria
		criteria.add(criterion);
		
		List<Employee> listOfEmployee = criteria.list();
		
		for(Employee employee : listOfEmployee) {
			System.out.println(employee);
		}

	}

}
