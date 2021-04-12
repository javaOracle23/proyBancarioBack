package com.banco.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.apirest.models.entity.User;
import com.banco.apirest.models.service.UserService;



@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/apiuser")
public class UserController {

	
	// injection dependency
	@Autowired
	private UserService userService;	

	
	@GetMapping("/usuarios/{username}")
	public User login(@PathVariable  String username) {					
		User user = userService.findByUserName(username);
		return user;		
	}

	@PostMapping("addUser")	
	public User addUser(@RequestBody User user) {
		user.setId(null);
		userService.save(user);
		return user;
	}
	
	
}
