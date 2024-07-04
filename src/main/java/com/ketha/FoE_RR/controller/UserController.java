package com.ketha.FoE_RR.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ketha.FoE_RR.model.User;
import com.ketha.FoE_RR.service.UserService;

@RestController
public class UserController {

//	@Autowired // Field injection
	UserService service;
	
	// Constructor injection
//	public UserController(UserService service) {
//		this.service = service;
//	}
//	
	
	// Setter injection for service object
	@Autowired
	public void setService(UserService service) {
		this.service = service;
	}
	
	@GetMapping("/user")
	public List<User> getAllUser() {
		return service.getAllUser();
	}
	
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable int userId) {
		return service.getUserById(userId);
	}
	
	@PostMapping("/user")
	public void addUser(@RequestBody User userDetails) {
		service.addUser(userDetails);
	}
	
	@PutMapping("/user")
	public void updateUser(@RequestBody User userDetails) {
		service.updateUser(userDetails);
	}
	
	@DeleteMapping("/user/{userId}")
	public void deleteUser(@PathVariable int userId) {
		service.deleteUser(userId);
	}
}
