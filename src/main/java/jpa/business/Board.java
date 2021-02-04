package jpa.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Board {
	private Long id;
	private String Name;
	private String Description;
	private List<Card> cards = new ArrayList<Card>();
	private List<Card> todo = new ArrayList<Card>();
	private List<Card> doing = new ArrayList<Card>();
	private List<Card> done = new ArrayList<Card>();

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@OneToMany
	@JoinColumn(name = "KanbanId")
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public List<Card> getTodo() {
		return todo;
	}

	public void setTodo(List<Card> todo) {
		this.todo = todo;
	}

	public List<Card> getDoing() {
		return doing;
	}

	public void setDoing(List<Card> doing) {
		this.doing = doing;
	}

	public List<Card> getDone() {
		return done;
	}

	public void setDone(List<Card> done) {
		this.done = done;
	}

}
