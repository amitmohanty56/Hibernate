package hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hinernate.query.ConfigurationUtility;
import hinernate.query.Employee;

public class TablePerClass_Client {

	public static void main(String[] args) {
		
		Session session = ConfigurationUtility.getSession();
		
		Transaction tranx = session.beginTransaction();
		
		Employee emp = new Employee();
		//Update the existing record.
		//Employee emp = (Employee) session.get(Employee.class, 5);
		//Use this PK/ID based on the PK generator tag.
		//emp.setId(1);
		emp.setFirstName("Virat");
		emp.setLastName("Kohli");
		emp.setPhoneNumber(123456);
		emp.setCountry("Ind");
		
//		RegularEmployee rEmployee = new RegularEmployee();
//		//rEmployee.setId(2);
//		rEmployee.setFirstName("MS");
//		rEmployee.setLastName("Dhoni");
//		rEmployee.setSalary(2000);
//		rEmployee.setBonus(3000);
		
		session.save(emp);
		tranx.commit();

	}

}
