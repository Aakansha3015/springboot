package com.example.Example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Example.Repository.EmployeeRepository;
import com.example.Example.model.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController 
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	// Create new Employees
	@PostMapping("/employee")
	public String createNewEmployee(@RequestBody Employee employee) 
	{
		System.out.println(employee.getEmp_age()+employee.getEmp_city()+employee.getEmp_salary()+employee.getEmp_name());
		employeeRepository.save(employee);
		return "Employee created in database";
	}
	
	// Retrive All the Employess
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployee()
	{
		List<Employee> empList=new ArrayList<>();
		System.out.print("working");
		empList=employeeRepository.findAll();
		System.out.print(empList);
		return new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
	}
	
	 // Retrive empoyees by emp_id [http://localhost:8087/api/employee/1 ]  
	@GetMapping("/employee/{emp_id}")
	public ResponseEntity<Employee>getEmployeeById(@PathVariable long emp_id)
	{
		Optional<Employee> emp=employeeRepository.findById(emp_id);
		if(emp.isPresent())
		{
			return new ResponseEntity<Employee>	(emp.get(),HttpStatus.FOUND);
		}else
		{
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Update a employee by emp_id
	@PutMapping("/employee/{emp_id}")
	public String updateEmployeeById(@PathVariable long emp_id, @RequestBody Employee employee)
	{
		Optional<Employee> emp= employeeRepository.findById(emp_id);
		if(emp.isPresent())
		{
			Employee existEmp =emp.get();
			existEmp.setEmp_age(employee.getEmp_age());
			existEmp.setEmp_city(employee.getEmp_city());
			existEmp.setEmp_name(employee.getEmp_name());
			existEmp.setEmp_salary(employee.getEmp_salary());
			
			employeeRepository.save(existEmp);
			return "Employee Details against id " + emp_id + "updated";
		}else
		{
			return "Employee Details does not exist for emp_id"+emp_id;
		}	
	}
	
	//Delete a employee By empid
	@DeleteMapping("/employee/{emp_id}")
	public String deleteEmployeeByEmpId(@PathVariable Long emp_id)
	{
		employeeRepository.deleteById(emp_id);
		return "Employee Deleted Successfully";
	}
	
	//Find a all employee based on emp city
	//Find all employess whoes age is > emp_age
	
}
