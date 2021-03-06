package com.reallyrottens.pool.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	
	public Player(String name) {
		super();
		this.name = name;
	}
	
	public Player() {}

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

	@Override
	public String toString() {
		return "Player {id=" + id + ", name=" + name + "}";
	}
	
	

}
