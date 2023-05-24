package com.jpa.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.jpa.test.Model.UserRecord;
import com.jpa.test.Services.UserServiceImplementation;

@RestController  									//It simplify the creation of restfull APIs
public class UserController 
{
	@Autowired 
	UserServiceImplementation s;			
	
	@PostMapping("/User")				 						//postmapping: when we want to create new record
	public String SaveUser(@RequestBody UserRecord ur)
	{
		s.Save(ur);
		return "The information of the user is being saved!";
	}
	
	@GetMapping("/FetchAll")
	public List<UserRecord> FetchData()
	{
		return s.FetchData();
	}
	
	
//	@GetMapping("/GetInfo")
//	public List<UserRecord> findById(@RequestBody UserRecord ur)
//	{
//		System.out.println(departmentDetails);
//		return implementation.findBylocation(departmentDetails.getLocation());
//	}
	
	
}
