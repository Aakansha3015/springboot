package com.jpa.test.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jpa.test.Dao.StudentRepository;
import com.jpa.test.model.StudentModel;


@Service										//@Service annotation and allows developers to add business functionalities.
public class StudentServiceImplementation implements ServiceInterface
{
	@Autowired StudentRepository sr;
	
	@Override
	public void SaveStudent(StudentModel studentmodel)
	{
		sr.save(studentmodel);	
	}

	public List<StudentModel> findByName(String first_name) 
	{
		// TODO Auto-generated method stub
		return sr.findByName(first_name);
	}

	public List<StudentModel> fetchByid(int rollno) 
	{
		// TODO Auto-generated method stub
		return sr.fetchByid(rollno);
	}

	@Override
	public void deleteStudent(Integer rollno) 
	{	
		sr.deleteById(rollno);

	}

	@Override
	public StudentModel getStudentById(Integer rollno) 
	{
		return sr.findById(rollno).get();
	}

	public List<StudentModel> fetchCity(String city)  							//getter setter variables pass
	{
		// TODO Auto-generated method stub
		return sr.fetchCity(city);
	}

	public List<StudentModel> fetchEmail(String email) {
		// TODO Auto-generated method stub
		return sr.fetchEmail(email);
	}
	
	
}













