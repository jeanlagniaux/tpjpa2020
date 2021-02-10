package jpa;

import javax.persistence.EntityManager;

import dao.CardDao;
import dao.UserDao;
import jpa.business.Card;
import jpa.business.User;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Lien pour montrer les valeurs jdbc:hsqldb:hsql://localhost/
		 */


//		UserDao daoU = new UserDao();
//		User user = new User();
//		user.setMail("pablo@mail.com");
//		user.setName("pablo");
//		daoU.save(user);
//		
//		System.out.println(daoU.getUsers());
		
		CardDao dao = new CardDao();
//		Card card = new Card();
//		card.setName("tache4");
//		card.setStatus("DOING");
//		card.setAffectedUser(user);
//		dao.save(card);
		
		// System.out.println("user : "+ dao.getAffectedUser().get(0).getName());
		

		// test
		try {

			// catch
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
