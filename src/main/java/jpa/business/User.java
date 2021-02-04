package jpa.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {
	private Long id;
	private Card card;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne()
	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
