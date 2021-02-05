package jpa.business;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Project implements Serializable{

	private Long id;
	private String name;
	
	public Project() {
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
