package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "user")
	private String user;
	@Column(name = "pass")
	private String pass;
	@Column(name = "nombre")
	private String name;
	@Column(name = "apellidos")
	private String surnames;

	public User() {
		
	}
	
	public User(int id, String user, String pass, String name, String surnames) {
		super();
		this.id = id;
		this.user = user;
		this.pass = pass;
		this.name = name;
		this.surnames = surnames;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurnsames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

}
