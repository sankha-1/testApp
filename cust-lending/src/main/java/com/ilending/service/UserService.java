package com.ilending.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ilending.dao.UserRepository;
import com.ilending.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public String addNewUser(User user) {
		String encryptedPassword = encryptPassword(user.getPassword());
		user.setPassword(encryptedPassword);
		userRepository.save(user);
		return "User added successfully!";
	}
	
	private String encryptPassword(String password) {
		String encryptedPassword = passwordEncoder.encode(password);
		return encryptedPassword;
	}
}
