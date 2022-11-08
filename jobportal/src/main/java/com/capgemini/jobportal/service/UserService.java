package com.capgemini.jobportal.service;

import java.util.List;
import java.util.Optional;
//import org.springframework.data.rest.webmvc.ResourceNotFoundException;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capgemini.jobportal.model.JobPortal;
import com.capgemini.jobportal.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public JobPortal createUser(JobPortal user) {
		return userRepository.save(user);
	}
	
	public List<JobPortal> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Optional<JobPortal> getUsersById(int user_id){
		return userRepository.findById( user_id);
	}
	
	public String deleteUsersById(int user_id) {
		Optional<JobPortal> u= userRepository.findById(user_id);
	if(u.isPresent()) {
		userRepository.deleteById(user_id);
		return "user details deleted with id: "+user_id;
	}
		return "user not found with id: "+user_id;
    }

	
	
	public JobPortal updateUser(JobPortal user) {
		
		return userRepository.save(user);
	}
}


