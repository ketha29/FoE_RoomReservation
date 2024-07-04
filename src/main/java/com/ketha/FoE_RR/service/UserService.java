package com.ketha.FoE_RR.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketha.FoE_RR.model.User;
import com.ketha.FoE_RR.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository repo;
	
	@Autowired
	public void setRepo(UserRepository repo) {
		this.repo = repo;
	}

	public List<User> getAllUser() {
		return repo.findAll();
	}
	
	public User getUserById(int userId) {
		return repo.findById(userId).orElse(new User());
	}
	
	public void addUser(User user) {
		repo.save(user);
	}
	
	public void updateUser(User user) {
		repo.save(user);
	}

	public void deleteUser(int userId) {
		repo.deleteById(userId);
	}
}
