package com.example.sb_practice_back.db_test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:8080")

public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@RequestMapping(value = "/return_db_data", method = RequestMethod.GET)
	public List<User> getUsers(){
		
		List<User> dataList = new ArrayList<>();
		
		dataList = repository.findAll();
		
		return dataList;
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String createUser(UserForm form) {
		User user = new User();
		user.setId(form.getId());
		user.setEmail(form.getEmail());
		user.setName(form.getName());
		user.setPassword(form.getPassword());
		
		repository.save(user);
		
		return "redirect:/return_db_data";
	}
	
	
	@RequestMapping(value = "/return_sample_data", method = RequestMethod.GET)
	public List<String>Sample(){
		
		List<String> dataList = new ArrayList<>();
		
		dataList.add("aaa");
		dataList.add("bbb");
		
		return dataList;
	}
	
	

}
