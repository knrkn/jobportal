package com.capgemini.jobportal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jobportal.model.JobPortal;
import com.capgemini.jobportal.service.UserService;


@RestController
public class UserController {
@Autowired
UserService userservice;

@PostMapping(value="/users")
public JobPortal createUsers( @RequestBody JobPortal user) {
	return userservice.createUser(user);
}

@GetMapping(value="/users")
public List<JobPortal> getAllUsers(){
	return userservice.getAllUsers();
}

@GetMapping("/users/{user_id}")
public Optional<JobPortal> findUserById(@PathVariable int user_id) {
	return userservice.getUsersById(user_id);
}

@PutMapping("/users")
public JobPortal updateUser(@RequestBody JobPortal user) {
return userservice.updateUser(user);
}

@DeleteMapping("/users/{user_id}")
public String deleteUser (@PathVariable int user_id){
	return userservice.deleteUsersById(user_id);
}

}
