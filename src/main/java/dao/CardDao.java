package dao;

import java.util.List;

import jpa.business.Card;
import jpa.business.User;

public class CardDao extends AbstractJpaDao<Long, Card>{

	public CardDao() {
		super(Card.class);
	}

	
	public List<User> getAffectedUser(){
		String query = "select u.affectedUser from Card as u";
		return this.entityManager.createQuery(query).getResultList();
	}
	
}
