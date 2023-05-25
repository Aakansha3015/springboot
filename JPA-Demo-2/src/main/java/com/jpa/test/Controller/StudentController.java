package com.jpa.test.Controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.Service.StudentServiceImplementation;
import com.jpa.test.model.StudentModel;

@RestController
public class StudentController
{
	@Autowired 
	StudentServiceImplementation serviceimplementation;
	
	@PostMapping("/Save")													//Create
	public String FetchAllInfo(@RequestBody StudentModel studentmodel)
	{
		serviceimplementation.SaveStudent(studentmodel);
		return "Successfully Fetched!";
	}
	
	@PostMapping("/FindByName")																	//Read
	public List<StudentModel> findByName(@RequestBody StudentModel f_name)
	{
		System.out.println(f_name);
		return serviceimplementation.findByName(f_name.getFirst_name());  //getter method:getFirst_name  //findByname & findByname method is diff
	}

	@PostMapping("/FindById")
	public List<StudentModel> findById(@RequestBody StudentModel rollno)
	{
		return serviceimplementation.fetchByid(rollno.getRollno());
	}
	
	@DeleteMapping("deleteStudent/{rollno}")													//Delete
	public ResponseEntity<String> deleteStudent(@PathVariable("rollno")Integer rollno)
	{
		serviceimplementation.deleteStudent(rollno);
		return new ResponseEntity<String>("Student with '"+rollno+"' has been deleted",HttpStatus.OK);
	}
	
	@PutMapping("/UpdateStudent/{rollno}")														//Update
	public ResponseEntity<String> updateStudent(@PathVariable("rollno")Integer rollno,StudentModel studentmodel)
	{
		StudentModel stdFromDB=serviceimplementation.getStudentById(rollno);
		stdFromDB.setFirst_name(studentmodel.getFirst_name());
		stdFromDB.setLast_name(studentmodel.getLast_name());
		
		serviceimplementation.SaveStudent(stdFromDB);
		return new ResponseEntity<String>("Student with has '"+rollno+"' been updateted",HttpStatus.OK);
	}
	
	@PostMapping("/FindByCity")
	public List<StudentModel> findByCity(@RequestBody StudentModel s_city)
	{
		System.out.println(s_city);
		return serviceimplementation.fetchCity(s_city.getCity());
	}
	
	@PostMapping("/FindByEmail")
	public List<StudentModel> findByEmail(@RequestBody StudentModel s_email)
	{
		System.out.println(s_email);
		return serviceimplementation.fetchEmail(s_email.getEmail());
	}
	
}
