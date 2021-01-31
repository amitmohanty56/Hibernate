package hibernate.mapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.bean.Player;
import hibernate.bean.Team;
import hinernate.query.ConfigurationUtility;

public class OneToManyClient_set {

	public static void main(String[] args) {
		Session session = ConfigurationUtility.getSession();
		Transaction tranx = session.beginTransaction();
		
//		Player player1 = new Player();
//		player1.setName("MS");
//		player1.setAge((byte)39);
//		player1.setId(1);
//		
//		
//		Player player2 = new Player();
//		player2.setName("Sachin");
//		player2.setAge((byte)44);
//		player2.setId(2);
//		
//		
//		Player player3 = new Player();
//		player3.setName("Rohit");
//		player3.setAge((byte)33);
//		player3.setId(3);
//		
//		Set<Player> setOfPlayers = new HashSet<Player>();
//		setOfPlayers.add(player1);
//		setOfPlayers.add(player2);
//		setOfPlayers.add(player3);
//		
//		Team team = new Team();
//		team.setId(1);
//		team.setName("Indian Cricket Team");
//		team.setPlayers(setOfPlayers);
//		
//		
//		
//		session.save(team);
//		session.flush();
//		tranx.commit();
//		session.close();
		
		Team team = (Team)session.get(Team.class, new Integer(1));
		System.out.println(team.getName());
		//System.out.println(team);
		
		

	}

}
