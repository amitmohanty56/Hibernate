package hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hinernate.query.ConfigurationUtility;

public class HQLNonSelectOperation {

	public static void main(String[] args) {
		Session session = ConfigurationUtility.getSession();
		Transaction tranx = session.beginTransaction();
		
		//Positional Parameter
		//String sqlPositionalParam = "update Employee set country= ? where id = ?";
		//Query query = session.createQuery(sqlPositionalParam);		
		//query.setParameter(0, "ind");
		//query.setParameter(1, 1);
		
		//Named Parameter
		String sqlNamedParam = "update Employee set country= :countryName where id = :id";
		Query queryNamedParam = session.createQuery(sqlNamedParam);
		queryNamedParam.setString("countryName", "ind");
		queryNamedParam.setInteger("id", 3);
		
		int noOfRowsUpdated = queryNamedParam.executeUpdate();
		System.out.println("No of Rows Updated "+noOfRowsUpdated);
		tranx.commit();

	}

}
