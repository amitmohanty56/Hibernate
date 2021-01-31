package hibernate.mapping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.bean.Group;
import hibernate.bean.Player;
import hibernate.bean.Story;
import hibernate.bean.Team;
import hinernate.query.ConfigurationUtility;

public class OneToManyClient_List {

	public static void main(String[] args) {
		Session session = ConfigurationUtility.getSession();
		Transaction tranx = session.beginTransaction();
		
        Story stories1 = new Story();
        stories1.setId(1);
        stories1.setInformation("Spy Stories");
        
        Story stories2 = new Story();
        stories2.setId(2);
        stories2.setInformation("Ghost Stories");
        
        
        Story stories3 = new Story();
        stories3.setId(3);
        stories3.setInformation("Love Stories");
        
        List<Story> listOfStory = new ArrayList<Story>();
        listOfStory.add(stories1);
        listOfStory.add(stories2);
        listOfStory.add(stories3);
        
        
        Group group = new Group();
        group.setId(1);
        group.setName("Fictional");
        group.setStories(listOfStory);
        
		session.save(group);
		//session.flush();
		tranx.commit();
		session.close();
		
		
		
		

	}

}
