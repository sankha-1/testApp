package com.ilending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ilending.model.User;
import com.ilending.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private UserService userService;
			
	@PostMapping("/add")
	public String addUserByAdmin(@RequestBody User user) {
		String msg = userService.addNewUser(user);
		return msg;
	}
}
