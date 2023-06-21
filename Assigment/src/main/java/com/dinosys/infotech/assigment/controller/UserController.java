package com.dinosys.infotech.assigment.controller;

import java.lang.annotation.Annotation;
import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

import org.hibernate.Remove;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.generator.EventType;
import org.hibernate.tuple.GenerationTiming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinosys.infotech.assigment.entities.Category;
import com.dinosys.infotech.assigment.entities.Users;
import com.dinosys.infotech.assigment.repository.CategoryRepository;
import com.dinosys.infotech.assigment.repository.UserRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	@Autowired
  private UserRepository userRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping("/")
	public List<Users> getAllUser(){
	return	this.userRepository.findAll();
	}
	
	
	@PostMapping("/")
	public Users Add(@RequestBody Users user) {
		LocalTime now = LocalTime.now();
		user.setLastSeen(now.toString());
		return this.userRepository.save(user);
		
	}

	
	
    @GetMapping("/{name}")
    public List<Users> getUserByName(@PathVariable String name){
    	
    	
    	return this.userRepository.findByNameContaining(name);
    	
    }
    @GetMapping("/email/{email}")
    public List<Users> getByEmail(@PathVariable("email")String email){ 
    	return this.userRepository.findByEmailContaining(email);
    	
    }
    @GetMapping("/mobile/{mobile}")
    public List<Users> getByMobile(@PathVariable("mobile") String mobile){
    	return this.userRepository.findByMobileContaining(mobile);
    	
    }

   
 
    
    
    
    

	
	
     

}
