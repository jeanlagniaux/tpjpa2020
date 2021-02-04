package jpa.business;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Card {

	private Long id;
	private String name;
	private String note;
	private int timeToDO;
	private String status;
	private Date endDate;
	private User affectedUser;
	private List<String> tags = new ArrayList<String>();
	private String url;
	private Board myBoard;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getTimeToDO() {
		return timeToDO;
	}

	public void setTimeToDO(int timeToDO) {
		this.timeToDO = timeToDO;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@OneToMany(mappedBy = "card")
	public User getAffectedUser() {
		return affectedUser;
	}

	public void setAffectedUser(User affectedUser) {
		this.affectedUser = affectedUser;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@ManyToOne
	public Board getMyBoard() {
		return myBoard;
	}

	public void setMyBoard(Board myBoard) {
		this.myBoard = myBoard;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", name=" + name + ", note=" + note + ", timeToDO=" + timeToDO + ", status=" + status
				+ ", endDate=" + endDate + ", affectedUser=" + affectedUser + ", tags=" + tags + ", url=" + url + "]";
	}

}
