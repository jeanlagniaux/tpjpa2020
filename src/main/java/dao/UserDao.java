package dao;

import java.util.List;

import jpa.business.Card;
import jpa.business.User;

public class UserDao extends AbstractJpaDao<Long, User>{

	public UserDao() {
		super(User.class);
	}

	
	public List<String> getUsers(){
		
		String query = "select u.mail from User as u";
		return this.entityManager.createQuery(query).getResultList();
		
	}

}
