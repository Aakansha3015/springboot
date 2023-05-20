package com.example.Department.Controller;
import com.example.Department.Model.Department;
import com.example.Department.Service.DepartmentServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController 
{
	@Autowired
	DepartmentServiceImplementation implementation;
	
	@PostMapping("/save") 												 //postmapping:when we want to create new record
	public String saveDepartment1(@RequestBody Department d ) 
	{
		return "This data is saved successfully";
	}
	
	@PostMapping("/fetchDepartments")
	public List<Department> fetchAllDepartments(@RequestBody Department d )
	{
		return implementation.fetchAllDepartments(d.getId());
	}
	
	@GetMapping("/demo")
	public List<Department> findBylocation(@RequestBody Department departmentDetails)
	{
		System.out.println(departmentDetails);
		return implementation.findBylocation(departmentDetails.getLocation());
	}
	
	@GetMapping("/deparment name")
	public List<Department> findByName(@RequestBody Department departmentName)
	{
		System.out.println(departmentName);
		return implementation.findByName(departmentName.getLocation());
	}
	
	@GetMapping("/fetch_dep")
	public List<Integer> findAllById()
	{	 
		return implementation.findAllById();
	}
	
	
	
	
	
	
}
