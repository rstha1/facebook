package com.couseapi.data.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FacebookUser {
	
	@Id
	private String id;
	private String username;
	private String password;
	private String numOfFriends;
	private String address;
	
	public FacebookUser() {
		
	}

	public FacebookUser(String iD, String username, String password, String numOfFriends, String address) {
		super();
		this.id = iD;
		this.username = username;
		this.password = password;
		this.numOfFriends = numOfFriends;
		this.address = address;
	}

	public String getID() {
		return id;
	}

	public void setID(String iD) {
		id = iD;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumOfFriends() {
		return numOfFriends;
	}

	public void setNumOfFriends(String numOfFriends) {
		this.numOfFriends = numOfFriends;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}


