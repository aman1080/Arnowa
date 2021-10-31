package com.arnowa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arnowa.entities.User;
import com.arnowa.entities.UserRepo;


@RestController
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	

	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		this.userRepo.save(user);
		System.out.println(user);
		return "User Added successfully";
		
	}
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		List<User> book =this.userRepo.findAll();
 		System.out.println(this.userRepo.findAll());
		return book;
	}
	
	@DeleteMapping("/deleteUser/{email}")
	public String deleteBook(@PathVariable String email) {
		this.userRepo.deleteById(email);
		return "User SuccessFully Deleted";
	}

}
