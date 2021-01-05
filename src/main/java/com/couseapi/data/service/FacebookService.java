package com.couseapi.data.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.couseapi.data.domain.FacebookUser;
import com.couseapi.data.repository.FacebookRepository;

@Service
public class FacebookService {
	
	@Autowired
	private FacebookRepository facebookRepository;
	
	public List<FacebookUser> getAllUser(){
		
		List<FacebookUser> users = new ArrayList<>();
		Iterable<FacebookUser> fb = facebookRepository.findAll();
		fb.forEach(users:: add);
		return users;	
	}
	
	public void addUser(FacebookUser user) {
		facebookRepository.save(user);
	}
	
	public void updateUser(FacebookUser user) {
		facebookRepository.save(user);
	}
	
	public FacebookUser getUser(String username, String password) {
		
	List<FacebookUser> allusers = this.getAllUser();
	 for (int i = 0; i< allusers.size(); i++) {
		 if(allusers.get(i).getUsername().equals(username) && allusers.get(i).getPassword().equals(password)) {
			 return allusers.get(i);
		 }
		
		return null;
	} 
		
		return null;
	}

}
