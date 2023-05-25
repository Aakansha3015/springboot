package com.jpa.test.Service;

import java.util.List;

import com.jpa.test.model.StudentModel;

public interface ServiceInterface 
{
	public void SaveStudent(StudentModel Sm);	 //Save
	
	public void deleteStudent(Integer rollno);	//Delete
	
	public StudentModel getStudentById(Integer rollno); //Update
}
