package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Register {
	
	@Id
	private int id;
	private String name;
	private String username;
	@Temporal(TemporalType.DATE)
	private Date dob;
	private String password;
	private String contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Register() {
		super();
	}
	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", username=" + username + ", dob=" + dob + ", password="
				+ password + ", contact=" + contact + "]";
	}
	
	
	
	

}
