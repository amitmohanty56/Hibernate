package hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import hinernate.query.ConfigurationUtility;
import hinernate.query.Employee;

public class CriteriaWithProjections {

	public static void main(String[] args) {
		
		Session session = ConfigurationUtility.getSession();
		//Select all the rows and columns from employee table.
		Criteria criteria = session.createCriteria(Employee.class);
		
		Projection pFirstName = Projections.property("firstName");//Selected Columns
		Projection pLastName = Projections.property("lastName");
		
		ProjectionList projList = Projections.projectionList();
		projList.add(pFirstName);
		projList.add(pLastName);
		
		criteria.setProjection(projList);
		
List<Object[]> listOfEmployee = criteria.list();
		
		for(Object[] name : listOfEmployee) {
			System.out.print(name[0]);
			System.out.println(" - "+name[1]);
		}

	}

}
