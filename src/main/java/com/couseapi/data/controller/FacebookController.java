package com.couseapi.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.couseapi.data.domain.FacebookUser;
import com.couseapi.data.service.FacebookService;

@RestController
public class FacebookController {
	
	@Autowired
	private FacebookService facebookService;
	
	@RequestMapping("/facebookuser")
	public List<FacebookUser> getAllUser(){
		return facebookService.getAllUser();
	}
	@PostMapping("/createUser")
	public void addUser(@RequestBody FacebookUser user ) {
		facebookService.addUser(user);
	}
	
	@PutMapping("/updateUser")
	public void updateUser(@RequestBody FacebookUser user) {
		facebookService.updateUser(user);
	}
	
	@RequestMapping("/login/{username}/{password}")
	public FacebookUser getUser(@PathVariable String username, @PathVariable String password) {
		return facebookService.getUser(username, password);
	} 
	
}
